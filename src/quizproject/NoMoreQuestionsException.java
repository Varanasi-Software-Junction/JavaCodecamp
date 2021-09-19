
package quizproject;


public class NoMoreQuestionsException extends Exception{
    public NoMoreQuestionsException()
    {
        
    }
    public NoMoreQuestionsException(String message)
    {
        super(message);
    }
}
