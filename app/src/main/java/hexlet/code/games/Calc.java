package hexlet.code.games;
import hexlet.code.service.Utils;
public class Calc {
    //private String rules;
    //private String question;
    //private String correctAnswer;

    /*Calc(String rules, String question, String correctAnswer) {
        this.rules = rules;
        this.question = question;
        this.correctAnswer = correctAnswer;
    }*/

    public static String getRules() {
        var rules = "What is the result of the expression?";
        return rules;
    }

    public static String[] getQuestionAndAnswer() {
        int num1 = Utils.randNum();
        int num2 = Utils.randNum();
        String operator = Utils.randElement(Utils.operators);
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
        }
        String[] paramsArray = {question, correctAnswer};
        return paramsArray;
    }
}