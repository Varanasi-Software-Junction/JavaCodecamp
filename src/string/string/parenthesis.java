package string;

public class parenthesis {
    public static void main(String args[])
    {
    String s="((a*b)+1()*9)";
    int count=0;
    
    char ch[]=s.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
        if(ch[i]=='(')
        count++;
        if(ch[i]==')')
        count--;
        if(count==-1)
        {
            System.out.println("Invalid Statement");
            return;
        }
    }
    if(count==0)
    System.out.println("Valid Statement");
    else
    System.out.println("Invalid Statement");

    
}}
