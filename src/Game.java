import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

// Game logic
class Game {
    protected final String[] arrMoves = {"rock", "paper", "scissors"};
    protected int rating;

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
            System.out.printf("Tie! (%s)%n%n", compMove);
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

    // Getter / Setter for Rating
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // SEARCH: "ratings.txt" for specified player rating
    public void historicalPlayerRating(String userName) throws IOException {
        int histRating = rating; // default 0 rating
        // checking file
        File file = new File("ratings.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            String input = br.readLine();
            String[] split = input.split(" ");
            if (split[0].equals(userName)) {
                //br.close();
                histRating = Integer.parseInt(split[1]); // historical rating
            }
        }
        setRating(histRating); // update rating (default OR historical)
    }

    // UPDATES RATING FILE
    //public void updateRecords() {}
}
