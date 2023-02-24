# Rock Paper Scissors
[![Author](https://img.shields.io/badge/author-taminderpabla-9cf.svg)](https://github.com/taminderpabla)
![Build Date Feb2023](https://img.shields.io/badge/build_date-Feb2023-brightgreen.svg)
![Project Java](https://img.shields.io/badge/project-Java-red.svg)
[![Repo Link](https://img.shields.io/badge/repo-TicTacToe-lightgrey.svg)](https://github.com/taminderpabla/rock-paper-scissors)

Rock Paper Scissors is a play-vs-computer game. Each individual match outcome is based on tie and win conditions.

The score is tracked on an external file as a scoreboard and able to be displayed through user prompt.
The player has the opportunity to continue gameplay or stop which displays the cumulative score historical 
score for the player.

## Requirements
Requires no specification.

## Running From Command Line
### RockPaperScissors Execution
Basic GamePlay Operations:
- Initializing each player's name
- Determining result (Tie or Win) after each move
- Tracking player score after each match
- Option to replay or stop gameplay based on user input
- Displaying historical score for current player

### Gameplay Results (via Terminal)
*insert figure images*

### Execution Procedure
Instructions to play the game through command line:
1. Clone the repository to specified location (shown using SSH):
```
    $ git clone git@github.com:taminderpabla/rock-paper-scissors.git
```
2. Compile all Java files (found in 'src' folder):
```
    % javac *.java
```
3. Execute the program (game will start by running Main):
```
    % java Main
```