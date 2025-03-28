package TicTacToe;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        //set up the board
        char[][]board=new char[3][3];
        for (int row = 0; row < board.length ; row++) {
            for (int col = 0; col <board[row].length ; col++) {
                board[row][col]=' ';
            }
        }

        char player='X';
        boolean gameOver=false;

        Scanner in= new Scanner(System.in);

        while(!gameOver){
            printBoard(board);
            System.out.println("Player " + player + " enter: ");
            int row=in.nextInt();
            int col=in.nextInt();

            if(board[row][col]==' '){
              board[row][col]=player;  //place the element
              gameOver=hasWon(board,player);
              if(gameOver){
                  System.out.println("Player "+ player + " has won:");
              }else{
                  if(player=='X'){
                      player='O';
                  }else {
                      player='X';
                  }
              }
            }else System.out.println("Invalid move");

        }
        printBoard(board);
    }

    private static boolean hasWon(char[][] board, char player) {
        //check rows
        for (int row = 0; row < board.length ; row++) {
         if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
             return true;
         }
        }
        //check for columns
        for (int col = 0; col < board.length ; col++) {
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        //check for diagonal
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player ){
            return true;
        }
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player ){
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for (int row = 0; row < board.length ; row++) {
            for (int col = 0; col <board[row].length ; col++) {
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }
}
