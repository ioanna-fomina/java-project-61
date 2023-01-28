package hexlet.code;
import hexlet.code.games.*;
import java.util.Scanner;
public class App {
    public static String userChoice;
    public static String[] gameParams(String userChoice) {
        String[] game = new String[3];
        switch (userChoice) {
            case "2" -> {
                game[0] = Even.getRules();
                String[] questionAndAnswer = Even.getQuestionAndAnswer();
                game[1] = questionAndAnswer[0];
                game[2] = questionAndAnswer[1];
            }
            case "3" -> {
                game[0] = Calc.getRules();
                String[] questionAndAnswer = Calc.getQuestionAndAnswer();
                game[1] = questionAndAnswer[0];
                game[2] = questionAndAnswer[1];
            }
            case "4" -> {
                game[0] = GCD.getRules();
                String[] questionAndAnswer = GCD.getQuestionAndAnswer();
                game[1] = questionAndAnswer[0];
                game[2] = questionAndAnswer[1];
            }
            /*case "5" -> {
                game[0] = Progression.getRules();
                String[] questionAndAnswer = Progression.getQuestionAndAnswer();
                game[1] = questionAndAnswer[0];
                game[2] = questionAndAnswer[1];
            }
            case "6" ->
                game[0] = Prime.getRules();
                String[] questionAndAnswer = Prime.getQuestionAndAnswer();
                game[1] = questionAndAnswer[0];
                game[2] = questionAndAnswer[1];
            }*/
        }
        return game;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n0 - Exit");
        System.out.print("Your choice: ");
        userChoice = scanner.next();
        switch (userChoice) {
            case "1" -> {
                Cli.greeting(scanner);
                scanner.close();
            }
            case "0" -> scanner.close();
            case "2", "3", "4", "5", "6" -> Engine.createGame(scanner, userChoice);
            default -> {
                System.out.print("Incorrect input");
                scanner.close();
            }
        }
    }
}
