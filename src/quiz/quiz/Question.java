package quiz;


public class Question  {
  private int questionno,correctanswer;
  private String question, opta,optb,optc,optd,explanation;

    public Question(int questionno, int correctanswer, String question, String opta, String optb, String optc, String optd, String explanation) {
        this.questionno = questionno;
        this.correctanswer = correctanswer;
        this.question = question;
        this.opta = opta;
        this.optb = optb;
        this.optc = optc;
        this.optd = optd;
        this.explanation = explanation;
    }

    public int getQuestionno() {
        return questionno;
    }

    public int getCorrectanswer() {
        return correctanswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOpta() {
        return opta;
    }

    public String getOptb() {
        return optb;
    }

    public String getOptc() {
        return optc;
    }

    public String getOptd() {
        return optd;
    }

    public String getExplanation() {
        return explanation;
    }
    public void display()
{
    System.out.println("Question No: " + questionno);
    System.out.println("Question : " + question);
    System.out.println(" 1: " + opta + "\t2: " + optb);
    System.out.println(" 3: " + optc + "\t4: " + optd);
}

public String tostring()
{
    return questionno+" "+question+" "+opta+" "+optb+" "+optc+" "+optd+" "+explanation;

}
     
}

  
