package shivank.practiceSaturdays;
public class concentric {
    public static void main(String[] args) {
        int n=4;
        int val=n*n;
        int k=n;
        int x=1;
        int a[][]=new int[n][n];
        int b[][]=run(a,n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(b[i][j]+"\t");
            System.out.println();
        }
        
    }



        public static int[][] run(int a[][],int n)
        {
        int i=0;
        int j=0;
        int left=0;
        int right=n-1;
        int top=0;
        int x=1;
        int bottom=n-1;
        while(x<=n*n)
        {
            
            for(j=top;j<right;j++)
            {
            if(a[top][j]==0)
            a[top][j]=x;
            System.out.println(top+" "+j+" +");
            x++;
            if(x==(n*n)+1)
            return a;
                
            }
            
            for(j=top;j<bottom;j++)
            {
            if(a[j][right]==0)
            a[j][right]=x;
            System.out.println(j+" "+right+" -");
            x++;
            if(x==(n*n)+1)
            return a;
                
            }
            
            for(j=right;j>0;j--)
            {
            if(a[bottom][j]==0)    
            a[bottom][j]=x;
            System.out.println(bottom+" "+j+" *");
            
            x++;
            if(x==(n*n)+1)
            return a;
                   
            }
            
            for(j=bottom;j>0;j--)
            {
             if(a[j][left]==0)   
            a[j][left]=x;
            System.out.println(j+" "+left+" /");
            
            x++;
            if(x==(n*n)+1)
            return a;
                
            }
            
            
            top++;
            
            left++;
            
            bottom--;
            
            right--;
            
            //right--;
            //for(i=0;i<=bottom;i++)

            
            
            
            
            

        }
        return a;}
        
}
