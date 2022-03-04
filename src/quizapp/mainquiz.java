package quizapp;
import java.util.Scanner;
public class mainquiz {
  static int correct=0;
    public static void main(String[] args) throws Except {
    Scanner sc=new Scanner(System.in);   
    Question list[]={new Question(1,3,"Which of the following is not a Java features?", "Dynamic", "Architecture Neutral", "Use of pointers", "Object-oriented","Ans.C \n "),new Question(2,3,"What does the expression float a = 35 / 0 return?","0","Not a Number","Infinity","Run time exception","Ans.c \n "),new Question(3,1,"Which package contains the Random class?","java.util package","java.lang package","java.awt package","java.io package","Ans.A \n "),new Question(4,2,"Which of the following is a reserved keyword in Java?","object","strictfp","main","system","Ans.B \n ")};
    int i=0;
    System.out.println("Welcome to Quiz Shop ,We have some interesting questions for you, try spending some time with us, you will love it \nPress 0 to Start Quiz ");
    int c1=sc.nextInt();
    
    Question q=list[i];
        q.display();
        c1=sc.nextInt();
        if(c1==q.getCorrectanswer())
        {System.out.println("Correct Answer");
    correct++;}
        else 
        {System.out.println("Wrong Answer");
        System.out.print(q.getExplanation()+"\n");
       // correct--;
    }
    while(true)
    {
        
    System.out.println("1. Go to Next Question: ");
    if(i>=1)
    System.out.println("2. Go to Previous Question: ");
    System.out.println("Enter choice: ");    
    int ch=sc.nextInt();
    Questionsupplier obj2=new Questionsupplier(list);
    //obj2.next();
    if(ch==1)
    {i++;
        //CQ=i;
        Question q1=list[i];
        q1.display();
        c1=sc.nextInt();
        if(c1==q1.getCorrectanswer())
        {System.out.println("Correct Answer");
    correct++;
    }
        else 
        {System.out.println("Wrong Answer");
        System.out.print(q1.getExplanation()+"\n");
    //correct--;
}
    }
    else if(ch==2 &&i>=1)
    {i--;
        Question q1=list[i];
        q1.display();
        c1=sc.nextInt();
        if(c1==q1.getCorrectanswer())
        {System.out.println("Correct Answer");
        correct++;
    }
        else 
        {//correct--;
            System.out.println("Wrong Answer");
            System.out.print(q1.getExplanation()+"\n");
        }
    }
    if(i+1==list.length)
    break;
    
    

    }
    System.out.println("Score: "+(correct)+"/"+list.length);
    }
    
}

