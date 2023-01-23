package hexlet.code;
import java.util.Scanner;
public class Even {
    //Scanner scanner;
    //public String userName = "";
    //public static void greeting(Scanner scanner) {
    //    System.out.println("\nWelcome to the Brain Games!");
    //    System.out.print("May I have your name? ");
    //    userName = scanner.next();
    //    System.out.println("Hello, " + userName + "!");
    //isEven(scanner);
    //}
    public static String falseMessage(String userAnswer, int number) {
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        return String.format("'%s' is wrong answer ;(. Correct answer was '%s'", userAnswer, correctAnswer);
        }
    public static void isEven(Scanner scanner) {
        //Scanner scanner = new Scanner(System.in);
        final String CONGRATULATION = String.format("Congratulations, %s!", App.userName);
        final String TRUE_MESSAGE = "Correct!";
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int count = 1; count < 4; count += 1) {
            int number = Number.randNum();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (number % 2 == 0 && userAnswer.equals("yes") || number % 2 != 0 && userAnswer.equals("no")) {
                System.out.println(TRUE_MESSAGE);
            } else {
                System.out.println(falseMessage(userAnswer, number));
                scanner.close();
            }
        }
        System.out.println(CONGRATULATION);
        scanner.close();
    }
}
