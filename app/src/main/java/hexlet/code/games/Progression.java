package hexlet.code.games;
import hexlet.code.service.Utils;
import java.util.Arrays;

public class Progression {
    public static String getRules() {
        String rules = "What number is missing in the progression?";
        return rules;
    }

    public static String[] getQuestionAndAnswer() {
        String[] numbers = new String[Utils.randNum(5, 10)];
        Utils.fillArrayRandProgression(numbers);

        int missingNumberPlace = Utils.randNum(0, numbers.length);
        String correctAnswer = numbers[missingNumberPlace];
        numbers[missingNumberPlace] = "..";

        String question = Utils.arrayToString(numbers);
        String[] paramsArray = {question, correctAnswer};
        return paramsArray;
    }
}