package practiceSaturdays;
//perfect numbers : 6,28,496,8128
public class perfectNum {
   public static void main(String[] args) {
    int num=28;
    int sum=1;
    for(int i=2;i<=num/2;i++)
    {
        if(num%i==0)
        sum+=i;

    }
    if(sum==num)
    System.out.println(num+" is perfect");
    else
    System.out.println(num+" is not perfect");

   }    
    
}
