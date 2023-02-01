package hexlet.code.games;
import java.util.Scanner;
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
    static String correctAnswer(String operator, int num1, int num2) {
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
        return correctAnswer;
    }
    static String[] questionAndAnswer() {
        int num1 = Utils.randNum();
        int num2 = Utils.randNum();
        String operator = randOperator();
        String question = Integer.toString(num1) + " " + operator + " " + Integer.toString(num2);
        String correctAnswer = correctAnswer(operator, num1, num2);
        String[] array = {question, correctAnswer};
        return array;
    }
    public static void runGame(Scanner scanner) {
        int arraysCount = Engine.ROUNDS_COUNT;
        String[][] dataForGame = new String[arraysCount][2];
        for (var item: dataForGame) {
            String[] data = questionAndAnswer();
            item[0] = data[0];
            item[1] = data[1];
        }
        Engine.createGame(scanner, DESCRIPTION, dataForGame);
    }
}
