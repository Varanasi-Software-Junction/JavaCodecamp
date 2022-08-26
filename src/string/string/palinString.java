package string.string;

public class palinString {
    public static void main(String args[])
    {
        String s="abcrdcba";
        String s1=s.toLowerCase();
        char ch[]=s1.toCharArray();
        int mid=ch.length/2;
        for(int i=0;i<mid;i++)
        {
            if(ch[i]==ch[ch.length-1-i])
            continue;
            System.out.println(s +" is not Palindrome");
            return;
            
            
        }
        System.out.println(s+" is Palindrome");

    }
    
}
