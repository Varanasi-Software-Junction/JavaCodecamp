package practiceSaturdays;

public class happyprac {
    public static void main(String[] args) {
        int num=188;
        int k=num;
        int flag=0;
        int a[]=new int[20];
        int i=0;
        while(true)
        {
            int sum=0;
            while(num>0)
            {int j=num%10;
                sum+=j*j;
            num=num/10;}
            
            if(sum==1)
            break;
            for(int p=0;p<a.length;p++)
            {
                if(a[p]==sum)
                {
                    System.out.println(k+" is not Happy");
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            break;
            a[i]=sum;
            i++;
            num=sum;



        }
        if(flag==0)
        System.out.println(k+" is happy");

    }
    
}
