package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static String greeting(Scanner scanner) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
    public static void createGame(Scanner scanner, String description, String[][] questionsAndAnswers) {
        String name = greeting(scanner);
        System.out.println(description);
        for (var item: questionsAndAnswers) {
            System.out.println("Question: " + item[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(item[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '" + item[1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                scanner.close();
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}
