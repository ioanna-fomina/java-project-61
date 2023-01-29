package hexlet.code.service;
import java.util.Random;

public class Utils {
    public static int randNum() {
        final int maxRandNumber = 100;
        return maxRandNumber - ((int) (Math.random() * maxRandNumber));
    }
    public static int randNum(int min, int max) {
        return (int) (Math.random() * (max - min - 1)) + min;
    }
    public static String randOperator() {
        String[] operators = {"+", "-", "*"};
        int i = new Random().nextInt(operators.length);
        return operators[i];
    }
    public static void fillArrayRandProgression(String[] array) {
        int firstNum = randNum();
        for (var i = 0; i < array.length; i += 1) {
            array[i] = Integer.toString(firstNum);
            firstNum += 1;
        }
    }
    public static String arrayToString(String[] array) {
        var result = new StringBuilder();
        for (var i : array) {
            result.append(i);
            result.append(" ");
        }
        return result.toString();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i += 1) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int gcdOfNumbers(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdOfNumbers(n2, n1 % n2);
    }
}
