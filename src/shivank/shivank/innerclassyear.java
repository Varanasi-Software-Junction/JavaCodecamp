package shivank;
enum monthly{
    jan,feb,mar,apr,may,jun,jul,aug,sept,oct,nov,dec;
}
enum days{
    sun,mon,tue,wed,thu,fri,sat;
}
public class innerclassyear {
    private int year;

    class month{
        monthly mon;
        days day;
        int date;
        month(monthly mon,days day,int date)
        {
            this.mon=mon;
            this.day=day;
            this.date=date;


        }
        public void display()
        {
            //year=2019;
           // String s[]={"0","January","February","March","April","May","June","July","August","September","October","November","December"};
            System.out.println(mon +" "+ day + " "+date);
            while(date>7)
            date=date-7;
            System.out.println("All "+day+" in"+mon);
            while(date<=31)
            {
                System.out.println(date);
                date+=7;
            }
        }}
        class fortnight
        {
            int h;
            fortnight(int h)
            {
                this.h=h;

            }
            void print()
            {
                System.out.println("square"+ (h*h));
            }

        }
    

    
    
}
