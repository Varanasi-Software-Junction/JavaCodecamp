package quiz;
import java.util.*;


public class qAndA {
    static int correct=0;
    static int checkprev=0;
    String q, opt1, opt2,opt3,opt4,ans,explaination;
    qAndA(String q,String opt1,String opt2,String opt3,String opt4,String ans,String explaination)
    {
        this.q=q;
        this.opt1=opt1;
        this.opt2=opt2;
        this.opt3=opt3;
        this.opt4=opt4;
        this.ans=ans;
        this.explaination=explaination;

    }
    public void func()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose: ");
        System.out.println("Q. "+q);
        System.out.println("1. "+opt1+"                  "+"2. "+opt2);
        System.out.println("3. "+opt3+"                  "+"4. "+opt4);
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
        {System.out.println("**********Correct Answer********");
        correct++;
        }
        else
        {System.out.println("-----------Wrong Answer---------");
        System.out.println("Explaination: "+explaination);
        
        }


    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        qAndA list[]={new qAndA("Who was the founder of the Theosophical Society in India and started the Home Rule League?", "Annie Besant","Acharya Narendra Dev","Lal-Bal-Pal", "None of the above","Annie Besant", "Ans. Annie Besant"),new qAndA(" The first Women External Affair Minister of India was:", "Sushma Swaraj", "Indira Gandhi", "Jayalalitha", "Prathibha Patil", "Indira Gandhi", "Ans. Indira Gandhi"),new qAndA("Which is the Capital of Bihar?", "Chiraigaon", "Nai Basti","Patna","Bhagalpur" , "Patna", "Ans. Patna"),new qAndA("The first Buddhist Council was held in the reign of", "Ajatashatru", "Ashoka", "Kanishka", "Bimbisara", "Ajatashatru", "Ans. Ajatashatru")};
        int i=0;
        
        System.out.println("Welcome to Quiz Shop ,We have some interesting questions for you, try spending some time with us, you will love it \nPress 0 to Start Quiz ");
        int c1=sc.nextInt();
        if(c1==0)
        {
        qAndA ob=list[i];
            ob.func();}
        while(true)
        {
            
            
            System.out.println("1. Display Score: ");
            System.out.println("2. Go to Next Question: ");

            if(i>=1)
            System.out.println("3. Go to Previous Question: ");
            System.out.println("Enter choice: ");
            int ch=sc.nextInt();
            
            if(ch==1)
            System.out.println(correct+" Correct Answers \nScore: "+correct+"/"+(i+1));
            if(ch==2)
            {i++;
                qAndA ob1=list[i];
                ob1.func();
                
                }
            else if(ch==3 && i>=1)
            {correct--;
                i--;
                qAndA ob1=list[i];
                ob1.func();
                
            }
            
            if(i+1==list.length)
            break;
        }
        System.out.println(correct+" Correct Answers \nScore: "+correct+"/"+list.length);

//qAndA obj=new Question(questionno, correctanswer, question, opta, optb, optc, optd, explanation) 
    }
    
}
