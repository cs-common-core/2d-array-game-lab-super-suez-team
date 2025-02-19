package src;
public class BoardGame {
    private String[][] board;
    private int playerRow;
    private int playerCol;
    
    public BoardGame(int rows, int cols) {
        board = new String[rows][cols];
        // Initialize the board with empty spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = "-";
            }
        }
        // Place player at starting position (0,0)
        playerRow = 0;
        playerCol = 0;
        board[playerRow][playerCol] = "P";
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
    public void movePlayer(String direction) {
        // TODO: Implement player movement (up, down, left, right)
    }
    
    public boolean isGameOver() {
        // TODO: Implement win/lose conditions
        return false;
    }
} 