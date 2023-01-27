package hexlet.code.service;
import java.util.Random;

public class Utils {
    public static int randNum() {
        return 100 - ((int) (Math.random() * 100));
    }
    public static String[] operators = {"+", "-", "*"};
    public static String randElement(String[] array) {
        int i = new Random().nextInt(array.length);
        return array[i];
    }
}
