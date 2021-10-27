
package quizproject;

import java.util.logging.Level;
import java.util.logging.Logger;

public class QuizMain {
    public static void main(String[] args) {
        Question[] questions={
            new Question(1, 2, "What is the capital of Bihar? ", "Lanka", "Patna", "Delhi", "Mumbai", "Patna is the capital"),
            new Question(2, 2, "What is the capital of Telangana? ", "Lanka", "Hyderabad", "Delhi", "Mumbai", "Hyderabad is the capital"),
            new Question(3, 2, "What is the capital of Japan? ", "Lanka", "Tokyo", "Delhi", "Mumbai", "Tokyo is the capital")
        
        };
        
        QuestionSupplier supplier=new QuestionSupplier(questions);
        int qno=0;
        while (true) {            
            try {
                Question question=supplier.next();
                question.display();
            } catch (NoMoreQuestionsException ex) {
                return;
            }
            
        }
    }
}
