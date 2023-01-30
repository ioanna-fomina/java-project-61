package hexlet.code.games;
import hexlet.code.utils.Utils;

public  class GCD {
    public static String getDescription() {
        String descriprion = "Find the greatest common divisor of given numbers.";
        return descriprion;
    }

    static int gcdOfNumbers(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdOfNumbers(n2, n1 % n2);
    }
    static String[] questionAndAnswer() {
        int num1 = Utils.randNum();
        int num2 = Utils.randNum();
        String question = Integer.toString(num1) + " " + Integer.toString(num2);
        String correctAnswer = Integer.toString(gcdOfNumbers(num1, num2));
        String[] paramsArray = {question, correctAnswer};
        return paramsArray;
    }
    public static String[][] getQuestionAndAnswer() {
        final int round = 3;
        String[][] paramsArray = new String[round][2];
        for (var item : paramsArray) {
            String[] params = questionAndAnswer();
            item[0] = params[0];
            item[1] = params[1];
        }
        return paramsArray;
    }
}
