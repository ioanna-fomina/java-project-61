package hexlet.code;
import java.util.Scanner;
import hexlet.code.Cli;
import hexlet.code.App;

public class Engine {
    public static final int ROUND = 3;

    public static void createGame(Scanner scanner, String userChoice) {
        String userName = Cli.greeting(scanner);
        String rules = App.gameParams(userChoice)[0];
        System.out.println(rules);

        var count = 0;
        while (count < ROUND) {
            String[] questionAndAnswer = App.gameParams(userChoice);
            String question = questionAndAnswer[1];
            String correctAnswer = questionAndAnswer[2];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                count += 1;
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                scanner.close();
                break;
            }
        }
        if (count == ROUND) {
            System.out.println("Congratulations, " + userName + "!");
            scanner.close();
        }
    }
}
