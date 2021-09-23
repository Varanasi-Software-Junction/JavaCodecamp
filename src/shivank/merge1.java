package shivank;


public class merge1{

    static void merge(int a[],int b[])
    {
        int n=a.length+b.length;
        int c[]=new int [n];
        
        
        int min=999,l=0;
        for(int i=0;i<b.length-1;i++)
        {
        for(int j=0;j<b.length-i-1;j++)
            {
                if(b[j]>b[j+1])
                {
                    int g=b[j];
                    b[j]=b[j+1];
                    b[j+1]=g;
                
                }
            }
        }
        for(int i=0;i<b.length;i++)
        {System.out.print(b[i]+" ");}
        for(int i=0;i<a.length-1;i++)
        {
        for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int g=a[j];
                    a[j]=a[j+1];
                    a[j+1]=g;
                
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {System.out.print(a[i]+" ");}   
        
        int y=0,z=0,k=0;
        while((y<a.length && z<b.length) )
           { if(a[y]<=b[z])
            {
                c[k++]=a[y++];
                
            }
            else 
            {
                c[k++]=b[z++];
                
            }

        } 
        
        while(y<a.length)
        {
            c[k++]=a[y++];
        }
        while(z<b.length)
        {
            c[k++]=b[z++];
        } 

        
            
             

        
        System.out.println();
        for(int i=0;i<n;i++)
        {System.out.print(c[i]+" ");}

            
        
    }

    public static void main(String args[])
{
    int a[]={2,7,9,3};
    int b[]={8,4,5,2,1};
    merge(a,b);

}
}