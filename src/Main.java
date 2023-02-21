import java.util.Scanner;

/*
* ROCK PAPER SCISSORS: Phase 1
* Single unfair game. Computer always beats the user.
* Take user input and then pick winning move.
* */

public class Main {
    public static void main(String[] args) {
        System.out.println("ROCK PAPER SCISSORS " +
                "\n---------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        // user move
        String userMove = scanner.nextLine().toLowerCase();
        String compMove;

        // pick computer based on user
        if (userMove.equals("paper")) {
            compMove = "scissors";
        } else if (userMove.equals("scissors")) {
            compMove = "rock";
        } else {
            compMove = "paper";
        }

        // output
        System.out.println("Sorry, but the computer chose " + compMove);
        System.out.println("THANK YOU FOR PLAYING!" +
                "\n---------------------------------------------------------------------");
    }
}