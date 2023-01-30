package hexlet.code.games;
import hexlet.code.utils.Utils;
import hexlet.code.Engine;
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
    public static String[][] runGame() {
        int arraysCount = Engine.ROUNDS_COUNT;
        String[][] questionAndAnswer = new String[arraysCount][2];
        for (var item : questionAndAnswer) {
            int number = Utils.randNum();
            String question = Integer.toString(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";
            item[0] = question;
            item[1] = correctAnswer;
        }
        return questionAndAnswer;
    }
}
