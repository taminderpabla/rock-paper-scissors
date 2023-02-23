import java.util.Random;

// Game logic
class Game {
    static final String[] arrMoves = {"rock", "paper", "scissors"};

    // RULEBOOK
    public void printRulebook() {
        System.out.println("RULEBOOK: \nMoves: rock, paper, scissors \nEnd Game Instruction: !exit \n");
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
