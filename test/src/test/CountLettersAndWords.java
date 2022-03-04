
package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class CountLettersAndWords {
   public static int[] CountWordsAndLetters(String filepath) throws FileNotFoundException, IOException
   {
       String string="";
       File f=new File(filepath);
      FileReader reader=new FileReader(f);
      BufferedReader br=new BufferedReader(reader);
      String line=br.readLine();
      while(line!=null)
      {
          string =string + line + " ";
          line=br.readLine();
          
      }
      string=string.trim();
      string=" " + string + " ";
      int countwords=0;
      int countletters=0;
      char[] chars=string.toCharArray();
      int n=chars.length;
      for (int i=1;i<=n-1;i++)
      {
          char prev=chars[i-1];
          char next=chars[i];
          if(Character.isLetter(prev))
              countletters++;
          if(Character.isLetter(prev) && !Character.isLetter(next))
              countwords++;
      }
      System.out.println(string);
       
       
       
       
       return new int[]{countletters,countwords};
   }
    public static void main(String[] args) throws IOException {
     int[] count=   CountWordsAndLetters("f:\\data.txt");
        int letters=count[0];
        int words=count[1];
        System.out.println(letters);
        System.out.println(words);
    }
}
