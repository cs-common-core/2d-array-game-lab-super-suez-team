package src;
import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        BoardGame game = new BoardGame();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Battleship!");
        
        while (!game.isGameOver()) {
            game.displayBoard();
            System.out.print("Enter your move: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            game.guessPlayer(row, col);

            //cannot have comma between****

      


            
            
           

            
         
            }
            
            
        }
        
     
    }
