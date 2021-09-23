import java.util.Scanner;

//package string;
public class Library
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String bookcode="Ec200";
        String usercode="QWERTY";
        String dateofIssue="09/08/2021";
        //String dateofReturn="25/08/2021";
        int d2=Integer.parseInt(dateofIssue.substring(0,2));
        int m2=Integer.parseInt(dateofIssue.substring(3,5));
        int y2=Integer.parseInt(dateofIssue.substring(6,10));
        
        System.out.println("Enter book code: ");
        String bookCd=sc.next();
        //System.out.println("*"+bookCd+"*");
        String dateofReturn="";
        if(bookCd.equals(bookcode))
        {
            System.out.println("Book Code: "+bookcode);
            System.out.println("User: "+usercode);
            System.out.println("Date of Issue "+dateofIssue);
            System.out.println("Enter Date of Return: ");
            dateofReturn=sc.next();



        
        int d1=Integer.parseInt(dateofReturn.substring(0,2));
        int m1=Integer.parseInt(dateofReturn.substring(3,5));
        int y1=Integer.parseInt(dateofReturn.substring(6,10));
        
        
        
        
        int s=getDifference(d1, m1, y1, d2, m2, y2);
        System.out.println("Book Used for "+s+" days");
        if(s>14)
        {
        System.out.println((s-14)+" Days Late Return");
        System.out.println("Late Fine Amount: ₹ "+(s-14)*2);
        }}
        sc.close();

    }
    
//package string;


    static boolean isLeapYear(int year)
    {
        if(year % 400==0)
        return true;
        if(year % 4!=0)
        return false;
        if(year % 100==0)
        return false;
        return true;
    }
    static int getDaysInMonth(int month,int year)
    {
        switch(month)
        {
            case 4:
            case 6:
            case 9:
            case 11:
            return 30;
            case 2:
            if(isLeapYear(year))
            return 29;
            return 28;
            default: return 31;
        }
    }
    static int compar(int d1,int m1, int y1,int d2,int m2, int y2 )
{
    //D1>D2 1, D1==D2 0 D1<D2 -1
    if(y1>y2)
    return 1;
    if(y1<y2)
    return -1;
    
        if(m1>m2)
        return 1;
        if(m1<m2)
        return -1;
        
            if(d1>d2)
            return 1;
            if(d1<d2)
            return -1;
            
        
    
    return 0;
    
    
}


    static int getDifference(int d1,int m1, int y1,int d2,int m2, int y2)
    {
        //D1>=D2
        int check=compar(d1, m1, y1, d2, m2, y2);
        if(check==-1)
        {
            int t1=d1;
            d1=d2;
            d2=t1;
            int t2=m1;
            m1=m2;
            m2=t2;
            int t3=y1;
            y1=y2;
            y2=t3;
        }
        int diff1=d1-1;
        int diff2=d2-1;
        int month1=0,month2=0,yearsum=0;
        for(int i=1;i<m1;i++)
        {
            month1+=getDaysInMonth(i, y1);
        }
        for(int i=1;i<m2;i++)
        {
            month2+=getDaysInMonth(i, y2);
        }
        for(int i=y2;i<=y1-1;i++)
        {
            if(isLeapYear(i))
            yearsum+=366;
            else
            yearsum+=365;
        }
        if(check==-1)
        return (yearsum-month2+month1-diff2+diff1)*(-1);
        if(check==0)
        return 0;
        return (yearsum-month2+month1-diff2+diff1);

    
    

        
    }
    
    

}