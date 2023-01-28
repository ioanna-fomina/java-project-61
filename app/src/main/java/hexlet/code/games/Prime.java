package hexlet.code.games;
import hexlet.code.service.Utils;

public class Prime {
    public static String getRules() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        return rules;
    }
    public static String[] getQuestionAndAnswer() {
        int number = Utils.randNum();
        String question = Integer.toString(number);
        String correctAnswer = Utils.isPrime(number) ? "yes" : "no";
        String[] paramsArray = {question, correctAnswer};
        return paramsArray;
    }
}
