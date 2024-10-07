import java.util.Scanner;
public class Main{
    public static void jumbledPuzzle() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to Level 1!");
        if (!word(scanner, "NEP", "PEN")) return;
        score++;
        if (!word(scanner, "CAR", "CAR")) return;
        score++;
        if (!word(scanner, "BAT", "BAT")) return;
        score++;
        System.out.println("Congratulations! You completed Level 1 with a score of " + score);
        System.out.println("\nWelcome to Level 2!");
        if (!word(scanner, "POAS", "SOAP")) return;
        score++;
        if (!word(scanner, "RETS", "REST")) return;
        score++;
        if (!word(scanner, "LIST", "LIST")) return;
        score++;
        System.out.println("Well done! You completed Level 2 with a score of " + score);
        System.out.println("\nWelcome to Level 3!");
        if (!word(scanner, "CDOUL", "COULD")) return;
        score++;
        if (!word(scanner, "SLEET", "SLEET")) return;
        score++;
        if (!word(scanner, "NAMES", "NAMES")) return;
        score++;
        System.out.println("Congratulations! You completed all levels with a perfect score of " + score);
    }
    public static boolean word(Scanner scanner, String jumbledWord, String correctAnswer) {
        System.out.println("Unscramble the letters: " + jumbledWord);
        String userAnswer = scanner.nextLine().toUpperCase();
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Sorry! You have lost. Your score is " + (correctAnswer.length() - 2));
            return false;
        }
    }
    public static void main(String[] args) {
        jumbledPuzzle();
    }
}
