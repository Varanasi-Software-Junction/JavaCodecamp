package quizproject;

public class QuestionSupplier {
private Question[]  questions;
private int totalquestions,currentquestionno;

    public QuestionSupplier(Question[] questions) {
        this.questions = questions;
        this.totalquestions = questions.length;
        this.currentquestionno = -1;
    }

    public Question getQuestionByQuestionNo(int questionno) throws  NoMoreQuestionsException
    {
        if(questionno<0 || questionno>=totalquestions)
            throw new NoMoreQuestionsException("No question at position " + questionno);
        return questions[questionno];
    }
    
    public Question previous()throws NoMoreQuestionsException
    {
        if(currentquestionno<=0)
             throw new NoMoreQuestionsException("No question at position " + currentquestionno);
            currentquestionno--;
            return questions[currentquestionno];
    }
     public Question next()throws NoMoreQuestionsException
    {
        if(currentquestionno>=totalquestions)
             throw new NoMoreQuestionsException("No question at position " + currentquestionno);
            currentquestionno++;
            return questions[currentquestionno];
    }
    @Override
    public String toString() {
        return "QuestionSupplier{" + '}';
    }

}
