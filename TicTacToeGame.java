package game;

public class TicTacToeGame {
	
	 int board[];    
	 public static void main(String[] args) {
		 createBoard();
		
	}


	    public static void createBoard() {
	        board = new int[10];   

	        
	        for (int i = 1; i <= board.length; i++) {
	            board[i] = ' ';
	        }
	    }
