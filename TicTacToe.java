import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class TicTacToe {
    static  String board[];
    static String turn;

    static void printboard(){
        System.out.println("|---|---|---|");
        System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" | ");
        System.out.println("|---|---|---|");
        System.out.println("| "+board[3]+" | "+board[4]+" | "+board[5]+" | ");
        System.out.println("|---|---|---|");
        System.out.println("| "+board[6]+" | "+board[7]+" | "+board[8]+" | ");
        System.out.println("|---|---|---|");

    }

    static String checkwinner(){
        for(int x = 0; x<8; x++){
            String line = null;

            switch(x){
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;

                case 1:
                    line = board[3] + board[4] + board[5];
                    break;

                case 2:
                    line = board[6] + board[7] + board[8];
                    break;

                case 3:
                    line = board[0] + board[3] + board[6];
                    break;

                case 4:
                    line = board[1] + board[4] + board[7];
                    break;

                case 5:
                    line = board[2] + board[5] + board[8];
                    break;

                case 6:
                    line = board[0] + board[4] + board[8];
                    break;

                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }

            if(line.equals("XXX")){
                return "X";
            }

            if(line.equals("OOO")){
                return "O";
            }

        }
        for(int a = 0; a<9; a++){
            if(Arrays.asList(board).contains(String.valueOf(a+1))){
                break;
            }
            else if(a==8){
                return "draw";
            }

        }
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }
    public static void main(String []br){
        Scanner sc = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for(int x = 0; x<9; x++){
            board[x] = String.valueOf(x+1);
        }

        System.out.println("Welcome to Tic-Tac-Toe");
        printboard();
        System.out.println("Let's X Turn will First,Enter a slot number to place X in:");

        while(winner == null){
            int userinput = sc.nextInt();
            try {
                if (userinput > 0 && userinput <= 9) {
                      System.out.println("Invalid Input,Enter Correct Number to get slot");
                }

                if(board[userinput-1].equals(String.valueOf(userinput))){
                    board[userinput-1] = turn;

                    turn = turn.equals("X") ? "O": "X";

                    printboard();
                    winner=checkwinner();

                }
                else {
                    System.out.println("Slot already taken; re-enter slot number:");
                }
            }

            catch(InputMismatchException e){
                System.out.print("Invalid input; re-enter slot number:");
                sc.nextLine();
            }
        }

        if(winner.equalsIgnoreCase("draw")){
            System.out.print("It's a draw! Thanks for playing.");
        }
        else{
            System.out.print("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }


    }
}
