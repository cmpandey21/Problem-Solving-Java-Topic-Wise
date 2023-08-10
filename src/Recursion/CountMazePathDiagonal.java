package Recursion;

import java.util.ArrayList;

public class CountMazePathDiagonal {

	public static void main(String[] args) {
		

		int Result = printMazePathD(0, 0, 2, 2);
		System.out.println(Result);
	}

	public static int printMazePathD(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec)

		{
			return 1;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return 0;
		}

		int dr = +printMazePathD(cr, cc + 1, er, ec);
		int dc = +printMazePathD(cr + 1, cc, er, ec);
		int dd = +printMazePathD(cr + 1, cc + 1, er, ec);

		return dr + dc + dd;
	}
}
