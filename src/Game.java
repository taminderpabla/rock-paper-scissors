import java.io.*;
import java.util.Random;

// Game logic
class Game {
    static final String[] arrMoves = {"rock", "paper", "scissors"};
    static int rating = 0;

    // RULEBOOK
    public void printRulebook() {
        System.out.println("RULEBOOK (Instructions): " +
                "\n---------------------------------------------------------------------");
        System.out.println("Playable Move: rock, paper, scissors \nGet Rating: !rating \nEnd Game: !exit \n");
    }

    public void matchBanner(String userName) {
        System.out.println("\nLET'S PLAY: " + userName + " VS COMPUTER\n" +
                "---------------------------------------------------------------------");
    }

    // RANDOMLY SELECT COMPUTER MOVE
    public String computerMove() {
        Random random = new Random();
        int randomNum = random.nextInt(3); // randomly generates int 0-2
        return arrMoves[randomNum];
    }

    // DETERMINE THE WINNER
    public void playMatch(String userMove) {
        // determine computer move
        String compMove = computerMove();
        // draw
        if (userMove.equals(compMove)) {
            System.out.printf("Draw! (%s)%n%n", compMove);
            rating += 5;
        }
        // user wins
        else if (((userMove.equals("rock") && compMove.equals("scissors")) ||
                userMove.equals("paper") && compMove.equals("rock")) ||
                (userMove.equals("scissors") && compMove.equals("paper"))) {
            System.out.printf("You Win! Computer(%s)%n%n", compMove);
            rating += 10;
        }
        // computer wins
        else {
            System.out.printf("Sorry, Computer Wins! Computer(%s)%n%n", compMove);
        }
    }

    // RETURNS RATING
    public static int getRating() {
        return rating; // updated rating
    }

    // SEARCH: "ratings.txt" for specified player rating
    public int historicalPlayerRating(String userName) {
        return 0;  // default return
    }

    // UPDATES RATING FILE
    public void updateRecords() {

    }
}
