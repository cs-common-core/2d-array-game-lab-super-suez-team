package src;
import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        BoardGame game = new BoardGame(5, 5);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Board Game!");
        System.out.println("Use W(up), S(down), A(left), D(right) to move");
        
        while (!game.isGameOver()) {
            game.displayBoard();
            System.out.print("Enter your move: ");
            String move = scanner.nextLine().toUpperCase();
            game.movePlayer(move);
        }
        
        System.out.println("Game Over!");
        scanner.close();
    }
} 