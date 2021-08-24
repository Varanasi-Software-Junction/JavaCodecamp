//package string;
public class checkvowel{
    public static void main(String args[])
    {
        String q="Rajesh";
        q=q.toLowerCase();
        int count=0;
        char a[]=q.toCharArray();
        for(int i=0;i<q.length();i++)
        {
           // System.out.println(a[i]);
            
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
            {
                count++;

            }
            
        }
        System.out.println(count);
    }
}