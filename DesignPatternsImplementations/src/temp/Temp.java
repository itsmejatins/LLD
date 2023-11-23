package temp;

public class Temp
{
	public static void main(String[] args)
	{
		int mat[][] = { { 47,30,35,8,25 }, { 6,36,19,41,40 }, { 24,37,13,46,5 }, {3,43,15,50,19 },
				{ 6,15,7,25,18 } };
		System.out.println(new Solution().findPeakGrid(mat));

	}

}

class Solution
{
	public int[] findPeakGrid(int[][] mat)
	{
		int m = mat.length, n = mat[0].length;
		int low[] = { 0, 0 }, high[] = { m - 1, n - 1 };
		while (true)
		{
			int mid[] = { (low[0] + high[0]) / 2, (low[1] + high[1]) / 2 };
			if (isPeak(mid, mat))
				return mid;
			char dir = move(mid, mat);
			if (dir == 'l')
				high[1] = mid[1] - 1;
			else if (dir == 'r')
				low[1] = mid[1] + 1;
			else if (dir == 't')
				high[0] = mid[0] - 1;
			else if (dir == 'd')
				low[0] = mid[0] + 1;
			else
				throw new RuntimeException("Invalid direction received");
		}
	}

	private char move(int[] mid, int[][] mat)
	{
		int x = mid[0], y = mid[1], m = mat.length, n = mat[0].length;
		// try moving left
		if (y > 0 && mat[x][y - 1] > mat[x][y])
			return 'l';
		else if (y + 1 < n && mat[x][y + 1] > mat[x][y])
			return 'r';
		else if (x > 0 && mat[x - 1][y] > mat[x][y])
			return 't';
		else if (x + 1 < m && mat[x + 1][y] > mat[x][y])
			return 'd';
		return 'x';
	}

	private boolean isPeak(int mid[], int mat[][])
	{
		int x = mid[0], y = mid[1], m = mat.length, n = mat[0].length;
		boolean left = y > 0 ? mat[x][y - 1] < mat[x][y] : true;
		boolean right = y + 1 < n ? mat[x][y + 1] < mat[x][y] : true;
		boolean up = x > 0 ? mat[x - 1][y] < mat[x][y] : true;
		boolean down = x + 1 < m ? mat[x + 1][y] < mat[x][y] : true;

		return left && right && up && down;
	}
}