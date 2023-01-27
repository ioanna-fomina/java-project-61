package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUND = 3;

    public static void createGame(Scanner scanner, String userChoice) {
        Cli.greeting(scanner);
        String rules = App.gameParams(userChoice)[0];
        System.out.println(rules);

        var count = 0;
        while (count < ROUND) {
            String question = App.gameParams(userChoice)[1];
            String correctAnswer = App.gameParams(userChoice)[2];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                count += 1;
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                scanner.close();
                break;
            }
        }
        if (count == ROUND) {
            System.out.println("Congratulations, " + Cli.userName + "!");
            scanner.close();
        }
    }
}
