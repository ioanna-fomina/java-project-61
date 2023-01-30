package hexlet.code.games;
import hexlet.code.utils.Utils;
import hexlet.code.Engine;
public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";
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
    public static String[][] runGame() {
        int arraysCount = Engine.ROUNDS_COUNT;
        String[][] questionAndAnswer = new String[arraysCount][2];
        for (var item : questionAndAnswer) {
            final int minNumbersLength = 5;
            final int maxNumbersLength = 10;
            String[] numbers = new String[Utils.randNum(minNumbersLength, maxNumbersLength)];
            fillArrayRandProgression(numbers);

            int placeOfMissingNumber = Utils.randNum(0, numbers.length);
            String correctAnswer = numbers[placeOfMissingNumber];
            numbers[placeOfMissingNumber] = "..";

            String question = arrayToString(numbers);
            item[0] = question;
            item[1] = correctAnswer;
        }
        return questionAndAnswer;
    }
}
