package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        String userChoice = scanner.next();
        switch (userChoice) {
            case "1" -> {
                Engine.greeting(scanner);
                scanner.close();
            }
            case "0" -> scanner.close();
            case "2" -> Engine.createGame(scanner, Even.getDescription(), Even.getQuestionAndAnswer());
            case "3" -> Engine.createGame(scanner, Calc.getDescription(), Calc.getQuestionAndAnswer());
            case "4" -> Engine.createGame(scanner, GCD.getDescription(), GCD.getQuestionAndAnswer());
            case "5" -> Engine.createGame(scanner, Progression.getDescription(), Progression.getQuestionAndAnswer());
            case "6" -> Engine.createGame(scanner, Prime.getDescription(), Prime.getQuestionAndAnswer());
            default -> {
                System.out.print("Incorrect input");
                scanner.close();
            }
        }
    }
}
