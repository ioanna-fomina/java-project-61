package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.Cli;
import java.util.Scanner;
public class App {
    private String userChoice;
    App(String userChoice) {
        this.userChoice = userChoice;
    }
    public String getUserChoice() {
        return this.userChoice;
    }
    //public void setUserChoice(String userChoice) {
    //    this.userChoice = userChoice;
    //}
    public static String[] gameParams(String choice) {
        final int PARAMS_COUNT = 3;
        String[] game = new String[PARAMS_COUNT];
        switch (choice) {
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
            case "5" -> {
                game[0] = Progression.getRules();
                String[] questionAndAnswer = Progression.getQuestionAndAnswer();
                game[1] = questionAndAnswer[0];
                game[2] = questionAndAnswer[1];
            }
            case "6" -> {
                game[0] = Prime.getRules();
                String[] questionAndAnswer = Prime.getQuestionAndAnswer();
                game[1] = questionAndAnswer[0];
                game[2] = questionAndAnswer[1];
            }
            default -> { }
        }
        return game;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        App app = new App(scanner.next());
        switch (app.getUserChoice()) {
            case "1" -> {
                Cli.greeting(scanner);
                scanner.close();
            }
            case "0" -> scanner.close();
            case "2", "3", "4", "5", "6" -> Engine.createGame(scanner, app.getUserChoice());
            default -> {
                System.out.print("Incorrect input");
                scanner.close();
            }
        }
    }
}
