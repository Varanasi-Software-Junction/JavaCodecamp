package practiceSaturdays;

public class primefactors {
    public static void main(String[] args) {
        int num=120;
        int i=2;
        int flag=0;
        while(num!=1)
        {
            
            if(num%i==0)
            {num=num/i;
               // System.out.println(num);
            flag=1;}
            
            else 
            {
                if(flag==1)
                 System.out.println(i);
                i++;
                flag=0;
            }




            

            
        }
        System.out.println(i);
    }
    
}
