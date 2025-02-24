package src;
public class BoardGame {
    private int[][] board;
    private int playerRow;
    private int playerCol;



    public BoardGame() {
        board = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                  
                board[1][1] = 1;
                board[1][2] = 1;
                board[1][3] = 1;
                
                
                board[5][2] = 1;
                board[4][2] = 1;
                board[3][2] = 1;

                board[9][1] = 1;
                board[9][2] = 1;
                board[9][3] = 1;
                board[9][4] = 1;
                board[9][5] = 1;
            

            }
        }
    }
    
    public void displayBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Students will implement these methods
    public void guessPlayer(int playerRow, int playerCol) {
        if(board[playerRow][playerCol] == 1){
            System.out.println("it is a hit");
            board[playerRow][playerCol] = 2;

        }else if(board[playerRow][playerCol] == 2){
            System.out.println("you have already hit");
        }else if(board[playerRow][playerCol] == 0){
            System.out.println("you missed");
            board[playerRow][playerCol] = 3;
        }
        
    }

    public boolean isGameOver() {
            
        int numOfOnes = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j< 10; j++){
                if(board[i][j] == 1){
                    numOfOnes++;
                }

            }
        }
        
 
        return false;
    }
} 