package practiceSaturdays;
// Armstrong 371,153,370,407
public class armstrongprac {
    public static void main(String[] args) {
        
    
    int num=47;
    int k=num;
    int sum=0;
    while(num>0)
    {
        int j=num%10;
        num/=10;
        sum+=(j*j*j);
    }
    if(sum==k)
    System.out.println(k+" is Armstrong");
    else
    System.out.println(k+" is  not Armstrong");
    }
    
}
