package application;

import boardgame.Board;
import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board board = new Board(8,8);
		System.out.println(board.getPieces().length);
		
		
		
		for(int i = 0; i < board.getPieces().length; i++) 
		{
			for(int j = 0; j < board.getPieces()[i].length; j++)
			{
				
				System.out.print(board.getPieces()[i][j] + " ");
			
			}
			System.out.println("");
		}
		
	}
	
}
