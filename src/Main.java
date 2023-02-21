import java.util.*;

/*
* ROCK PAPER SCISSORS: Phase 2
* Single fair game. Computer picks move at random
* */

public class Main {
    public static void main(String[] args) {
        System.out.println("ROCK PAPER SCISSORS " +
                "\n---------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        // gameplay
        String userMove = scanner.nextLine().toLowerCase();
        String compMove = computerMove();
        gameWinner(userMove, compMove);

        // game over output
        System.out.println("THANK YOU FOR PLAYING!" +
                "\n---------------------------------------------------------------------");
    }
    // RANDOMLY SELECT COMPUTER MOVE
    public static String computerMove() {
        String[] arrMoves = {"rock", "paper", "scissors"};
        Random random = new Random();
        int randomNum = random.nextInt(3); // randomly generates int 0-2
        return arrMoves[randomNum];
    }

    // DETERMINE THE WINNER
    public static void gameWinner(String userMove, String compMove) {
        // DRAW
        if (userMove.equals(compMove)) {
            System.out.println("There is a draw (" + userMove + ")");
        }
        // USER WINS
        else if (((userMove.equals("rock") && compMove.equals("scissors")) ||
                userMove.equals("paper") && compMove.equals("rock")) ||
                (userMove.equals("scissors") && compMove.equals("paper"))) {
            System.out.println("Well done. The computer chose " + compMove + " and failed");
        }
        // COMP WINS
        else {
            System.out.println("Sorry, but the computer chose " + compMove);
        }
    }
}