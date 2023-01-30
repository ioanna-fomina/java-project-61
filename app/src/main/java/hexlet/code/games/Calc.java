package hexlet.code.games;
import hexlet.code.utils.Utils;
import java.util.Random;
public class Calc {
    public static String getDescription() {
        var rules = "What is the result of the expression?";
        return rules;
    }
    static String randOperator() {
        String[] operators = {"+", "-", "*"};
        int i = new Random().nextInt(operators.length);
        return operators[i];
    }
    static String[] questionAndAnswer() {
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
        String[] paramsArray = {question, correctAnswer};
        return paramsArray;
    }
    public static String[][] getQuestionAndAnswer() {
        String[][] paramsArray = new String[3][2];
        for (var item : paramsArray) {
            String[] params = questionAndAnswer();
            item[0] = params[0];
            item[1] = params[1];
        }
        return paramsArray;
    }
}
