package hexlet.code.games;
import hexlet.code.utils.Utils;
import hexlet.code.Engine;
public  class GCD {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    static int gcdOfNumbers(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdOfNumbers(n2, n1 % n2);
    }
    public static String[][] runGame() {
        int arraysCount = Engine.ROUNDS_COUNT;
        String[][] questionAndAnswer = new String[arraysCount][2];
        for (var item : questionAndAnswer) {
            int num1 = Utils.randNum();
            int num2 = Utils.randNum();
            String question = Integer.toString(num1) + " " + Integer.toString(num2);
            String correctAnswer = Integer.toString(gcdOfNumbers(num1, num2));
            item[0] = question;
            item[1] = correctAnswer;
        }
        return questionAndAnswer;
    }
}
