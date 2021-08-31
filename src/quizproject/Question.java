

package quizproject;


public class Question {
    private int questionno,correctanswer;
    private String question,optiona,optionb,option,optiond,explanation;

    public Question(int questionno, int correctanswer, String question, String optiona, String optionb, String option, String optiond, String explanation) {
        this.questionno = questionno;
        this.correctanswer = correctanswer;
        this.question = question;
        this.optiona = optiona;
        this.optionb = optionb;
        this.option = option;
        this.optiond = optiond;
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

    public String getOptiona() {
        return optiona;
    }

    public String getOptionb() {
        return optionb;
    }

    public String getOption() {
        return option;
    }

    public String getOptiond() {
        return optiond;
    }

    public String getExplanation() {
        return explanation;
    }

    @Override
    public String toString() {
        return "Question{" + "questionno=" + questionno + ", question=" + question + ", optiona=" + optiona + ", optionb=" + optionb + ", option=" + option + ", optiond=" + optiond + '}';
    }
    
    
}
