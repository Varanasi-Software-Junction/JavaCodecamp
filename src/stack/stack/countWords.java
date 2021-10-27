package stack;
import java.util.*;
public class countWords {
    public static void main(String[] args) {
        Set<String> s1=new HashSet<>();
        Map<String,Integer> m1=new TreeMap<>();
        Set<String> s2=new HashSet<>();
String words[]={"is","an","the","this","that","and","on","in","for","to","what","why","when","where","hello","here","there","up","do","they","of","has","his","&","Rs","a","due","etc.","all","be","There","was","about","cr"};
for(int i=0;i<words.length;i++)
s2.add(words[i]);   
int count=1;   
Scanner sc=new Scanner(System.in);
        while(true)
        {
            //System.out.println("Type...........");
            String str=sc.next();
           
            int value=m1.getOrDefault(str,0);
            
            
            m1.put(str, value+1);
            int s=value+1;
            if(count<s)
            count=s;
            s1.add(str);
            for(int i=0;i<words.length;i++)
            m1.remove(words[i]);
            s1.removeAll(s2);
            System.out.println(m1);
            System.out.println(s1);
            System.out.println("****"+count+"****");
            //System.out.println(s1.toString());
            String[] Geeks = s1.toArray(new String[s1.size()]);
            for(int i=0;i<Geeks.length;i++)
            {
                if(m1.get(Geeks[i])==count)
                {
                    System.out.println(Geeks[i]);
                    //break;
                }
            }

        }

        


    }
    
}
