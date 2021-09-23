package ternary;
import java.util.*;
class aug1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		while(n>0)
		{
		int fa[]=new int[6];
		for(int i=0;i<6;i++)
		fa[i]=sc.nextInt();
		int s1=fa[0]+fa[1]+fa[2];
		int s2=fa[3]+fa[4]+fa[5];
        n--;
		if(s1>s2)
		{
		    System.out.println("1");
		    return;
		}
		System.out.println("2");
        }
		
		    
	}
		
}