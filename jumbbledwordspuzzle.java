//task4
import java.util.Scanner;

public class JumbledWordsPuzzle {

    // Function to play the game
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int score = 0; // Initialize score
        
        // Level 1: Three-letter words
        System.out.println("Welcome to Level 1!");
        if (!askQuestion(scanner, "NEP", "PEN")) return; // First word
        score++;
        if (!askQuestion(scanner, "CAR", "CAR")) return; // Second word
        score++;
        if (!askQuestion(scanner, "BAT", "BAT")) return; // Third word
        score++;
        System.out.println("Congratulations! You completed Level 1 with a score of " + score);
        
        // Level 2: Four-letter words
        System.out.println("\nWelcome to Level 2!");
        if (!askQuestion(scanner, "POAS", "SOAP")) return;
        score++;
        if (!askQuestion(scanner, "RETS", "REST")) return;
        score++;
        if (!askQuestion(scanner, "LIST", "LIST")) return;
        score++;
        System.out.println("Well done! You completed Level 2 with a score of " + score);
        
        // Level 3: Five-letter words
        System.out.println("\nWelcome to Level 3!");
        if (!askQuestion(scanner, "CDOUL", "COULD")) return;
        score++;
        if (!askQuestion(scanner, "SLEET", "SLEET")) return;
        score++;
        if (!askQuestion(scanner, "NAMES", "NAMES")) return;
        score++;
        System.out.println("Congratulations! You completed all levels with a perfect score of " + score);
    }
    
    // Function to ask a question and check the answer
    public static boolean askQuestion(Scanner scanner, String jumbledWord, String correctAnswer) {
        System.out.println("Unscramble the letters: " + jumbledWord);
        String userAnswer = scanner.nextLine().toUpperCase(); // Get user input and convert to uppercase for consistency
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Sorry! You have lost. Your score is " + (correctAnswer.length() - 2));
            return false;
        }
    }
    
    // Main function
    public static void main(String[] args) {
        playGame(); // Start the game
    }
}
  
  
