package hexlet.code;
import hexlet.code.games.*;
import java.util.Scanner;
public class App {
    public static String userChoice;
    public static String[] game = new String[3];
    public static String[] gameParams(String userChoice) {
        switch (userChoice) {
            case "2" -> {
                game[0] = Even.getRules();
                game[1] = Even.getQuestion();
                game[2] = Even.getCorrectAnswer();
            }
            case "3" -> {
                game[0] = Calc.getRules();
                game[1] = Calc.getQuestion();
                game[2] = Calc.getCorrectAnswer();
            }
            /*case "4" -> {
                game[0] = GCD.getRules();
                game[1] = GCD.getQuestion();
                game[2] = GCD.getCorrectAnswer();
            }
            case "5" -> {
                game[0] = Progression.getRules();
                game[1] = Progression.getQuestion();
                game[2] = Progression.getCorrectAnswer();
            }
            case "6" ->
                game[0] = Prime.getRules();
                game[1] = Prime.getQuestion();
                game[2] = Prime.getCorrectAnswer();
            }*/
        }
        return game;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
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
