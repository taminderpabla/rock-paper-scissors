import java.util.*;

/*
* ROCK PAPER SCISSORS: Phase 3
* Play multiple games.
* */

public class Main {
    public static void main(String[] args) {
        System.out.println("ROCK PAPER SCISSORS " +
                "\n---------------------------------------------------------------------");
        System.out.println("Rulebook: rock, paper, scissor\nEnd Game: !exit \n");
        boolean singleMove;
        while(true) {
            // USER MOVE
            String userMove;
            do {
                System.out.println("Please make a move OR end game: ");
                Scanner scanner = new Scanner(System.in);
                userMove = scanner.nextLine().toLowerCase();
                // validate
                switch (userMove) {
                    case "!exit", "rock", "paper", "scissors" -> singleMove = false;
                    default -> {
                        System.out.println("Invalid input");
                        singleMove = true;
                    }
                }
            } while (singleMove);

            // STOP GAME
            if(userMove.equals("!exit")) {
                break;
            }
            // GAMEPLAY
            String compMove = computerMove();
            gameWinner(userMove, compMove);
        }

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
        // draw
        if (userMove.equals(compMove)) {
            System.out.printf("Draw! (%s)%n%n", compMove);
        }
        // user wins
        else if (((userMove.equals("rock") && compMove.equals("scissors")) ||
                userMove.equals("paper") && compMove.equals("rock")) ||
                (userMove.equals("scissors") && compMove.equals("paper"))) {
            System.out.printf("You Win! Computer(%s)%n%n", compMove);
        }
        // computer wins
        else {
            System.out.printf("Sorry, Computer Wins! Computer(%s)%n%n", compMove);
        }
    }
}