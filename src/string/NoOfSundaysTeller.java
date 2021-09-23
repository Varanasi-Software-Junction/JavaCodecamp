public class NoOfSundaysTeller {
    
        




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
        int days=0;
        if(check==-1)
        days= (yearsum-month2+month1-diff2+diff1)*(-1);
        if(check==0)
        days= 0;
        if(check==1)
        days= (yearsum-month2+month1-diff2+diff1);
        //System.out.println(days);
        
        
        //
        return days;
    
    

        
    }
    public static void main(String args[])
    {
        int mon=8;
        String maas[]={"0","January","February","March","April","May","June","July","August","September","October","November","December"};
        int year=2021;
        int NoOfdays=day(mon,year);
        System.out.println(NoOfdays+" days in "+maas[mon]+" "+year);
      

        int d1=1;
        int d2=23;
        int m2=8;
        
        int m1=mon;
       
        int y1=year;
        int y2=2021;
        
        String week[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        //System.out.println(s);
        String search="Monday";
        int sun=-99;
        for(int i=1;i<=7;i++)
        {
            int s=getDifference(i, m1, y1, d2, m2, y2);
            int divas=checkday(s);
            if(week[divas]==search)
            {
                sun=i;
                break;
            }
        
        }
        
        
        int count=0;
        while(sun<=NoOfdays ) 
        {
            count++;
            System.out.println(sun+" "+maas[mon]+" "+year);
            sun+=7;
            
            //System.out.println();
        }
        System.out.println(" Are "+count+" "+search+"s");

    }    
        

    
    public static int checkday(int s)
    {
        String week[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String todayis="Monday";
        int pos=-1;
        
        for(int i=0;i<7;i++)
        {
            if(week[i]==todayis)
            {pos=i;
            break;}

        }
        
        s=s%7;
        //System.out.println(s);
        if(s>0)
        {
            s=pos+s;
            if(s>6)
            s-=7;
            //System.out.println(week[s]);
            return s;
        }
        if(s<0)
        {
            
            s=s+pos;
            if(s<0)
            s+=7;
            
            //System.out.println(week[s]);
            return s;
        }
        
        
        //System.out.println(week[s]);
        return pos;
    }

    



    
    public static int day(int month,int year)
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
    
    
}
