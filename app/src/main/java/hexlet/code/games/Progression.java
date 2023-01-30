package hexlet.code.games;
import hexlet.code.utils.Utils;

public class Progression {
    public static String getDescription() {
        String rules = "What number is missing in the progression?";
        return rules;
    }
    static void fillArrayRandProgression(String[] array) {
        int firstNum = Utils.randNum();
        for (var i = 0; i < array.length; i += 1) {
            array[i] = Integer.toString(firstNum);
            firstNum += 1;
        }
    }
    static String arrayToString(String[] array) {
        var result = new StringBuilder();
        for (var i : array) {
            result.append(i);
            result.append(" ");
        }
        return result.toString();
    }
    static String[] questionAndAnswer() {
        final int minNumbersLength = 5;
        final int maxNumbersLength = 10;
        String[] numbers = new String[Utils.randNum(minNumbersLength, maxNumbersLength)];
        fillArrayRandProgression(numbers);

        int missingNumberPlace = Utils.randNum(0, numbers.length);
        String correctAnswer = numbers[missingNumberPlace];
        numbers[missingNumberPlace] = "..";

        String question = arrayToString(numbers);
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
