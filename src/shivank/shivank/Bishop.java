package shivank;// incomplete

public class Bishop
{
    public static void main(String args[])
    {
        int r=2,c=6;
        int y=r,z=c;
        while(c<=8 && r<=8)
        {
            System.out.println(r++ +" "+c++);
        }
        while(y+z==8)
        {
            System.out.println(r--+" "+c--);
        }
        while(c<=8 && r<=8)
        {
            System.out.println(r++ +" "+c++);
        }
        while(c>=1 && r>=1)
        {
            System.out.println(r--+" "+c--);
        }



    }

} 