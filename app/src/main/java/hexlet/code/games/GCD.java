package hexlet.code.games;
import hexlet.code.service.Utils;

public  class GCD {
    public static String getRules() {
        String rules = "Find the greatest common divisor of given numbers.";
        return rules;
    }
    public static String[] getQuestionAndAnswer() {
        int num1 = Utils.randNum();
        int num2 = Utils.randNum();
        String question = Integer.toString(num1) + " " + Integer.toString(num2);
        String correctAnswer = Integer.toString(Utils.gcdOfNumbers(num1, num2));
        String[] paramsArray = {question, correctAnswer};
        return paramsArray;
    }
}
