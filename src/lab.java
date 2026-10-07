import java.util.Scanner;
public class lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerAMove;
        String playerBMove;
        String playNewGame;
        boolean continueGame = false;
        boolean playerAValidMove;
        boolean playerBValidMove;
        boolean bigValid = false;
        do {
            System.out.println("Welcome to a game of Rock Paper Scissors");
            System.out.println("Player A, please enter r for rock, p for paper, or s for scissors");
            do {
                playerAMove = scan.nextLine();
                if (playerAMove.equalsIgnoreCase("r")) {
                    System.out.println("Player A has chosen");
                    playerAValidMove = true;
                } else if (playerAMove.equalsIgnoreCase("p")) {
                    System.out.println("Player A has chosen");
                    playerAValidMove = true;
                } else if (playerAMove.equalsIgnoreCase("s")) {
                    System.out.println("Player A has chosen");
                    playerAValidMove = true;
                } else {
                    System.out.println("Please enter a valid input");
                    playerAValidMove = false;
                }
            } while (!playerAValidMove);
            System.out.println("Player B, please enter r for rock, p for paper, or s for scissors");
            do {
                playerBMove = scan.nextLine();
                if (playerBMove.equalsIgnoreCase("r")) {
                    System.out.println("Player B has chosen");
                    playerBValidMove = true;
                } else if (playerBMove.equalsIgnoreCase("p")) {
                    System.out.println("Player B has chosen");
                    playerBValidMove = true;
                } else if (playerBMove.equalsIgnoreCase("s")) {
                    System.out.println("Player B has chosen");
                    playerBValidMove = true;
                } else {
                    System.out.println("Please enter a valid input");
                    playerBValidMove = false;
                }
            } while (!playerBValidMove);
            if (playerAMove.equalsIgnoreCase("r")) {
                if (playerBMove.equalsIgnoreCase("r")) {
                    System.out.println("Both players played rock: Tie");
                }
                else if (playerBMove.equalsIgnoreCase("p")) {
                    System.out.println("A played rock, B played paper: B Wins");
                }
                else if (playerBMove.equalsIgnoreCase("s")) {
                    System.out.println("A played rock, B played scissors: A wins");
                }
                else {
                    System.out.println("Please enter a valid input");
                }
            } else if (playerAMove.equalsIgnoreCase("p")) {
                if (playerBMove.equalsIgnoreCase("r")) {
                    System.out.println("A played paper, B played rock: A wins");
                }
                else if (playerBMove.equalsIgnoreCase("p")) {
                    System.out.println("Both players played paper: Tie");
                }
                else if (playerBMove.equalsIgnoreCase("s")) {
                    System.out.println("A played paper, B played scissors: B wins");
                }
                else {
                    System.out.println("Please enter a valid input");
                }
            } else if (playerAMove.equalsIgnoreCase("s")) {
                if (playerBMove.equalsIgnoreCase("r")) {
                    System.out.println("A played scissors, B played rock: B wins");
                }
                else if (playerBMove.equalsIgnoreCase("p")) {
                    System.out.println("A played scissors, B played paper: A Wins");
                }
                else if (playerBMove.equalsIgnoreCase("s")) {
                    System.out.println("Both players played scissors: Tie");
                }
                else {
                    System.out.println("Please enter a valid input");
                }
            } else {
                System.out.println("Please enter a valid input");
            }
            System.out.println("Continue? [Y/N]");
            do {
                playNewGame = scan.nextLine();
                if (playNewGame.equalsIgnoreCase("y")) {
                    System.out.println("Starting new game");
                    continueGame = true;
                } else if (playNewGame.equalsIgnoreCase("n")) {
                    System.out.println("Thanks for playing");
                    scan.nextLine();
                    bigValid = false;
                } else {
                    System.out.println("Please enter a valid input");
                }
            } while (!continueGame);
        }while (!bigValid);

    }
}
