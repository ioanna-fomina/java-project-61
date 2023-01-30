package hexlet.code.games;
import hexlet.code.utils.Utils;
import hexlet.code.Engine;
public class Even {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String[][] runGame() {
        int arraysCount = Engine.ROUNDS_COUNT;
        String[][] questionAndAnswer = new String[arraysCount][2];
        for (var item : questionAndAnswer) {
            int number = Utils.randNum();
            String question = Integer.toString(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            item[0] = question;
            item[1] = correctAnswer;
        }
        return questionAndAnswer;
    }
}
