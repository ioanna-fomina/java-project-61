package hexlet.code.games;
import hexlet.code.utils.Utils;
import java.util.Random;
import hexlet.code.Engine;
public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";
    static String randOperator() {
        String[] operators = {"+", "-", "*"};
        int i = new Random().nextInt(operators.length);
        return operators[i];
    }
    public static String[][] runGame() {
        int arraysCount = Engine.ROUNDS_COUNT;
        String[][] questionAndAnswer = new String[arraysCount][2];
        for (var item : questionAndAnswer) {
            int num1 = Utils.randNum();
            int num2 = Utils.randNum();
            String operator = randOperator();
            String question = Integer.toString(num1) + " " + operator + " " + Integer.toString(num2);
            String correctAnswer = "";
            switch (operator) {
                case "+" -> {
                    correctAnswer = Integer.toString(num1 + num2);
                }
                case "-" -> {
                    correctAnswer = Integer.toString(num1 - num2);
                }
                case "*" -> {
                    correctAnswer = Integer.toString(num1 * num2);
                }
                default -> { }
            }
            item[0] = question;
            item[1] = correctAnswer;
        }
        return questionAndAnswer;
    }
}
