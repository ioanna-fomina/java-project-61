package hexlet.code.service;
import java.util.Random;

public class Utils {
    public static int randNum() {
        return 100 - ((int) (Math.random() * 100));
    }
    public static int randNum(int min, int max) {
        return (int) (Math.random() * (max - min - 1)) + min;
    }
    public static String[] operators = {"+", "-", "*"};
    public static String randElement(String[] array) {
        int i = new Random().nextInt(array.length);
        return array[i];
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
        if (num > 1) {
            for (int i = 2; i < num; i += 1) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static int gcdOfNumbers(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }
        if (n2 == 0) {
            return n1;
        }
        int n;
        for (n = 0; ((n1 | n2) & 1) == 0; n++) {
            n1 >>= 1;
            n2 >>= 1;
        }
        while ((n1 & 1) == 0) {
            n1 >>= 1;
        }
        do {
            while ((n2 & 1) == 0) {
                n2 >>= 1;
            }
            if (n1 > n2) {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            n2 = (n2 - n1);
        } while (n2 != 0);
        return n1 << n;
    }
}
