//package string;
public class name
{
    public static void main(String args[])
    {String s="Vishal chand";
    char a[]=s.toCharArray();
    System.out.print(a[0]);
    for(int i=1;i<a.length;i++)
    {
        if(a[i]==' ')
        System.out.print(a[i+1]);
    }

}}