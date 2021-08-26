package shivank;
public class find{
    public static void main(String args[])
    {
        int a[]={1,9,4,2,7,4,3,1};
        int find=0,c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==find)
            c++;

        }
        if(c==0)
        {
            System.out.println(find+" Not found ");
            return;
        }
        System.out.println(find+" found "+c+" times");

    }
}