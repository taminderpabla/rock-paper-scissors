import java.util.*;

/*
* ROCK PAPER SCISSORS: Phase 4 (a)
* Player rating per match
* */

// Driver program
public class Main {
    public static void main(String[] args) {
        System.out.println("ROCK PAPER SCISSORS " +
                "\n---------------------------------------------------------------------");
        // CREATE GAME
        Game game = new Game();
        game.printRulebook();

        Scanner scanner = new Scanner(System.in);

        // Initialize username
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine().toUpperCase().trim(); //usernames are only uppercase
        game.matchBanner(userName); // banner
        // Initialize player rating
        int rating; // VARIABLE to initialize historical rating from "ratings.txt"

        gameplay:
        while (true) {
            System.out.println("Please enter instruction: ");
            String userMove = scanner.nextLine().toLowerCase().trim(); // improve input reading
            switch (userMove) {
                case "rock":
                case "paper":
                case "scissors":
                    game.playMatch(userMove); // GAMEPLAY
                    break;
                case "!rating":
                    rating = Game.getRating(); // get current/updated rating
                    System.out.println("Current rating: " + rating);
                    break;
                case "!exit":
                    break gameplay; // stop match repetition
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

        // game over output
        System.out.println("""

                THANK YOU FOR PLAYING!
                ---------------------------------------------------------------------""");
    }
}