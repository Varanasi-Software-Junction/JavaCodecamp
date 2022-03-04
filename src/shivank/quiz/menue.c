#include<stdio.h>
int main()
{
    int a[]={1,3,2,4,6,8,4,0};
    int i,j,k,l; 
    int max,min;   
    int n=sizeof(a)/sizeof(int);
    while (1)//(i=0; i<=n-1; i++);
{ 
    printf("0-exit\n1-printall\n2-print reverse\n3-find max\n4-find min\nEnter your choice :");
    scanf("%d",&j);
    switch(j)
    {
        case 0:
        {
        return 0;
        }
    case 1: 
    {
    for(i=0;i<=n-1;i++)
    {
    printf("%d,",a[i]);
    }
    }
    case 2:
    {
        for(i=n-1; i>0; i--)
        { 
            printf("%d,",a[i]);
        }break;
    
}
case 3:
{
    for(i=0; i<=n-1; i++)  
    {
        if(max>a[i])
        {
            max=a[i];
            { 
            printf("%d",max)
        }break;}
    }
}
}
}    
}
    