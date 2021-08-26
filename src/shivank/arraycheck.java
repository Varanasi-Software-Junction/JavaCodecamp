package shivank;

import java.util.Scanner;

public class arraycheck{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        
            System.out.println("1.add number into array:");
            System.out.println("2. update a number:");
            System.out.println("3.Delete a number: ");
            System.out.println("4.Search a number: ");
            int ch=sc.nextInt(); 

        switch(ch)
        {
            
            
            case 1:
                System.out.println("---------------------");
                System.out.println("Enter a number to add: ");
                int s=sc.nextInt();
                
                a[a.length-1]=s;
                for(int i=0;i<a.length;i++)
                {
                
                    System.out.print(a[i]+" ");
                

                }
                break;
            case 2:
            System.out.println("---------------------");
                for(int i=0;i<a.length;i++)
                {
                
                    System.out.print(a[i]+" ");
                

                }
                System.out.println();
                System.out.println("Enter the position you want to update: ");
                int posit=sc.nextInt();
                System.out.println("Enter the number : ");
                int num=sc.nextInt();
                a[posit]=num;
                for(int i=0;i<a.length;i++)
                {
                
                    System.out.print(a[i]+" ");
                

                }
                break;

                
            case 3:
            System.out.println("---------------------");
                for(int i=0;i<a.length;i++)
                {
                
                    System.out.print(a[i]+" ");
                

                }
                System.out.println();
                System.out.println("Enter the num you want to delete: ");
                int dig=sc.nextInt();
                System.out.println("Enter the pos : ");
                int pla=sc.nextInt();
                for(int i=pla;i<a.length;i++)
                {
                    a[i]=a[i+1];
                    

                }
                a[a.length-1]=0;
                for(int i=0;i<a.length;i++)
                {
                
                    System.out.print(a[i]+" ");
                

                }
                break;
                

                

            case 4:
            System.out.println("---------------------");
                System.out.println("Enter a number to Search: ");
                int nu=sc.nextInt();
                for(int i=0;i<a.length;i++)
                {
                if(a[i]==nu)
                {
                System.out.println(nu+" Found at position "+i);
                
                }

                }
                break;
            default:
            break;

            

            

            

        }

    }
}