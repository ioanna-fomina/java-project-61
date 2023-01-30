package hexlet.code.games;
import hexlet.code.utils.Utils;

public class Prime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i += 1) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    static String[] questionAndAnswer() {
        int number = Utils.randNum();
        String question = Integer.toString(number);
        String correctAnswer = isPrime(number) ? "yes" : "no";
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
