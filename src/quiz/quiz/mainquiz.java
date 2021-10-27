package quiz;

import java.util.Scanner;

public class mainquiz {
    static int correct=0;
    public static void main(String[] args) throws Except {
    Scanner sc=new Scanner(System.in);   
    Question list[]={new Question(1,1,"Who was the founder of the Theosophical Society in India and started the Home Rule League?", "Annie Besant","Acharya Narendra Dev","Lal-Bal-Pal", "None of the above", "Ans. Annie Besant"),new Question(2,2," The first Women External Affair Minister of India was:", "Sushma Swaraj", "Indira Gandhi", "Jayalalitha", "Prathibha Patil", "Ans. Indira Gandhi"),new Question(3,3,"Which is the Capital of Bihar?", "Chiraigaon", "Nai Basti","Patna","Bhagalpur", "Ans. Patna"),new Question(4,1,"The first Buddhist Council was held in the reign of", "Ajatashatru", "Ashoka", "Kanishka", "Bimbisara", "Ans. Ajatashatru")};
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
    correct++;}
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
