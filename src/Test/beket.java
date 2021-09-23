package Test;
public class beket {
    public static void main(String[] args) {
        String exp="( a+b ))(*( + (d-e))";
        char[] chars =exp.toCharArray();
        int count=0;
        for(char ch : chars)
        {
            if (ch=='(')
                count++;
            if(ch==')')
                count--;
             if (count<0)
             {
            System.out.println("Invaild");
            return;
             }
        }
        {
       if (count==0)
            System.out.println("vaild");
         
       else
                System.out.println("invalid");
       
        }   
           
        System.out.println(count);
    }
    }
