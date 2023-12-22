


package himanshu.dowhileloop;


public class Reversefibnoisi {
    public static void main(String[] args) {
        int a,b=21,c=34;
        System.out.print(c+ "," +b + ",");
        a = c-b;
        do {
            System.out.print(a+ " ,");
            c= b;
            b = a ;
            a =c-b;
        }
        
        while(a>0);
        System.out.println(a+",");
    }
            

}
