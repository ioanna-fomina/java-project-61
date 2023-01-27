package hexlet.code.games;
import hexlet.code.service.Utils;
public class Even {

    public static String getRules() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        return rules;
    }

    public static String[] getQuestionAndAnswer() {
        int number = Utils.randNum();
        String question = Integer.toString(number);
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        String[] paramsArray = {question, correctAnswer};
        return paramsArray;
    }
}
