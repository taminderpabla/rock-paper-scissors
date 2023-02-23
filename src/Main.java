import java.util.*;

/*
* ROCK PAPER SCISSORS: Phase 3 (b)
* Play multiple games.
* OOP principles and design. Improved structure of program.
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

        gameplay:
        while (true) {
            System.out.println("Please make a move or instruction: ");
            String userMove = scanner.nextLine().toLowerCase().trim(); // improve input reading
            switch (userMove) {
                case "rock":
                case "paper":
                case "scissors":
                    game.playMatch(userMove);
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