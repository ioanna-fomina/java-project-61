package hexlet.code.games;
import hexlet.code.utils.Utils;
public class Even {
    public static String getDescription() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        return rules;
    }

    static String[] questionAndAnswer() {
        int number = Utils.randNum();
        String question = Integer.toString(number);
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        String[] paramsArray = {question, correctAnswer};
        return paramsArray;
    }
    public static String[][] getQuestionAndAnswer() {
        int round = 3;
        String[][] paramsArray = new String[round][2];
        for (var item : paramsArray) {
            String[] params = questionAndAnswer();
            item[0] = params[0];
            item[1] = params[1];
        }
        return paramsArray;
    }
}
