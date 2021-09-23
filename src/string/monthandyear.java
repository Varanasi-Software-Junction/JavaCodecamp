public class monthandyear
{
    public static int days(int month,int year)
    {
        switch(month)
        {
            case 4:
            case 6:
            case 9:
            case 11:
            return 30;
            case 2:
            {
                if(leap(year))
                return 29;
                return 28;
            }
            default: return 31;
        
        
        }

    }
    public static boolean leap(int year)
    {
        if(year%400==0)
        return true;
        if(year%4!=0)
        return false;
        if(year%100==0)
        return false;
        return true;

    }
    public static void main(String args[])
    {
        int mon=9;
        int year=2020;
        int s=days(mon,year);
        System.out.println(s);

    }
}