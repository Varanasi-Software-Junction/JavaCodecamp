package Test;
import java.util.Scanner;
public class qAndA {
    static int correct=0;
    String q, opt1, opt2,opt3,opt4,ans,explaination;
    qAndA(String q,String opt1,String opt2,String opt3,String opt4,String ans,String Explaination)
    {
        this.q=q;
        this.opt1=opt1;
        this.opt2=opt2;
        this.opt3=opt3;
        this.opt4=opt4;
        this.ans=ans;
        this.explaination=Explaination;

    }
    public void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose: ");
        System.out.println("Q. "+q);
        System.out.println("1. "+opt1+"   "+"2. "+opt2);
        System.out.println("3. "+opt3+"   "+"4. "+opt4);
        int a1=sc.nextInt();
        int b1=0;
        int c=1;
        String all[]={opt1,opt2,opt3,opt4};
        for(int i=0;i<=3;i++)
        {
            if(all[i].equals(ans))
            {
                b1=i+1;
                break;
            }
            
        }
        if(a1==b1)
        {
            System.out.println("***Correct Answer***");
        correct++;
        }else
        {
            System.out.println("-----------Wrong Answer---------");
        System.out.println("Explaination: "+explaination);}
       }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        qAndA ob[]={new qAndA("Which of the following is not a Java features?", "Dynamic", "Architecture Neutral", "Use of pointers", "Object-oriented", "Use of pointers","Ans.C \n "),new qAndA("What does the expression float a = 35 / 0 return?","0","Not a Number","Infinity","Run time exception","Infinity","Ans.c \n "),new qAndA("Which package contains the Random class?","java.util package","java.lang package","java.awt package","java.io package","java.util package","Ans.A \n "),new qAndA("Which of the following is a reserved keyword in Java?","object","strictfp","main","system","strictfp","Ans.B \n ")};
        int i=0;
        System.out.println("welcome to the online examination system");
        int c1=sc.nextInt();
        if(c1==0)
        {
        qAndA o=ob[i];
            o.func();}
        while(true)
        {
        System.out.println("2. Go to Next Question: ");

            if(i>=1)
            
            {
                System.out.println("3. Go to Previous Question: ");
            
        }
            System.out.println("Enter choice: ");
            int ch=sc.nextInt();
            
            if(ch==1)
            System.out.println(correct+" Correct Answers \nScore: "+correct+"/"+(i+1));
            else if(ch==2)
            {
                i++;
                qAndA o=ob[i];
                o.func();
                }
            else if(ch==3 && i>=1)
            {
                correct--;
                i--;
                qAndA o=ob[i];
                o.func();
            }
            
            if(i+1==ob.length)
            break;
        }
        System.out.println(correct+" Correct Answers \nScore: "+correct+"/"+ob.length);
    }
} 



            
        
    


    

