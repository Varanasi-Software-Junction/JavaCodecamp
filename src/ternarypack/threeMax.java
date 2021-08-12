package ternarypack;
public class threeMax {
 public static void main(String[] args) {
        int a=111,b=21,c=3;
        int max=(a>=b && a>=c)?a:(b>=c)?b:c;
        System.out.println(max);
        //365 hrs 47 minutes
    int min=(a<b)?(a<c)?a:c  : (b<c)?b:c;
     System.out.println(min);
     int year=1900;
     String result=(year % 400 == 0)?"Leap Year":(year % 4==0)? (year %100!=0)?"Leap Year":"Not Leap Year":"Not Leap Year";
     System.out.println(result);
    }
    
    
}
