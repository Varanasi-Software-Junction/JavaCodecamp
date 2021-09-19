package quiz;

public class Questionsupplier {
    private Question qAndq[];
    private int TQ , CQ;
    Questionsupplier(Question que[])
    {
        this.CQ=-1;
        this.TQ=que.length;
        this.qAndq=que;

    }
   

    
    public Question getQuestionbyQuestionno(int questionno) throws Except
    {
        if(questionno<0 || questionno>=TQ)
            throw new Except("No question at position " + questionno);
        return qAndq[questionno];
    }

    public Question previous()throws Except
    {
        if(CQ<=0)
             throw new Except("No question at position " + CQ);
            CQ--;
            return qAndq[CQ];
    }
    public  Question next() throws Except
    {
        if(CQ>=TQ)
            throw new Except("No question at position " + CQ);
            CQ++;
            return qAndq[CQ];
    
    }
    public String tostring()
   {
       return "Hi";
   } 
    

    
    
    

    
        
    


    
}
