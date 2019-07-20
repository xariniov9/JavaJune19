package thirteenthLecture;

import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{

		// TODO Auto-generated method stub
		int cases = 0;
		int H,W;

		Scanner sc = new Scanner(System.in);
		try {
			H = sc.nextInt();
			W = sc.nextInt();

			while (H!=0&&W!=0) {
				cases++;

				char[][] grid = new char[H][W];
				int startItr = 0;
				for (int i = 0; i < grid.length; i++) {
					String str = sc.next();
					for (int j = 0; j < grid[i].length; j++) {
						grid[i][j] = str.charAt(j);
						dpABCPATH[i][j] = -1;
					}
				}
				int longest_path = 0;
				int[][] possibilities = { { -1, -1 }, { 0, -1 }, { 1, -1 }, { 1, 0 }, { 1, 1 }, { 0, 1 }, { -1, 1 },
						{ -1, 0 } };
				for (int i = 0; i < H; i++) {
					for(int j=0; j<W; j++) {
						if(grid[i][j] == 'A')
							longest_path = Math.max(longest_path, gridPathABC(grid, i, j, possibilities));
					}
				}
				System.out.println("Case " + cases + ": " + longest_path);
				H = sc.nextInt();
				W = sc.nextInt();
			}
			sc.close();
		} catch (Exception e) {
			return;
		}
	}
	/*
	 * 4 5 ABCDE JIHGF KJIGH MLKJI
	 */

	public static int[][] dpABCPATH = new int[51][51];

	private static int gridPathABC(char[][] grid, int x, int y, int[][] possiblities) {
		// TODO Auto-generated method stub
		if (x == grid.length || y == grid[x].length || x < 0 || y < 0)
			return 0;

		if (dpABCPATH[x][y] != 0) {
			return dpABCPATH[x][y];
		}

		int length = 1;
		for (int i = 0; i < possiblities.length; i++) {

			if ((x + possiblities[i][0] >= 0 && x + possiblities[i][0] < grid.length)
					&& (y + possiblities[i][1] >= 0 && y + possiblities[i][1] < grid[x].length)
					&& grid[x][y] + 1 == grid[x + possiblities[i][0]][y + possiblities[i][1]]) {
				// System.out.println("i'm called");
				length = Math.max(length,
						1 + gridPathABC(grid, x + possiblities[i][0], y + possiblities[i][1], possiblities));
			}

		}
		return dpABCPATH[x][y] = length;

	}
}
