package Recursion;

public class CountNQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean [][] board=new boolean[4][4];
		System.out.println(countNQueens(board,0));
	}

	public static int countNQueens(boolean[][] board, int row)
	{
	
		if(row==board.length)
		{
			return 1;
		}
		int count=0;
		for(int col=0;col<board[row].length;col++)
		{
		if(isItSafe(board,row,col))
		{
		board[row][col]=true;
		count= count + countNQueens(board,row+1);
		board[row][col]=false;
		}
		
	}
		return count;
		}

	private static boolean isItSafe(boolean[][] board, int row, int col) {
		if(board[row+1][col] ||board[row][col+1] || board[row+1][col+1])
		return false;
		else
			return true;
	}
}
