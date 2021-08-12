package primepackages;
import java.util.Scanner;
public class anagrams {
public static void main(String[] args){

    String input= "abad";
    String anagram="cdba";
    if(input.length()!=anagram.length())
    {
        System.out.println("Not Anagram");
        return;
    }
    char[] inputchars=input.toCharArray();
    for(char ch:inputchars)
    {
        
        anagram=anagram.replaceFirst("" + ch, "");
        System.out.println(anagram);
    }
    if(anagram.length()!=0)
    {
        System.out.println("Not Anagram");
          }
    else
    {
      
        System.out.println("Anagram");
        
    }
    }
    
}
