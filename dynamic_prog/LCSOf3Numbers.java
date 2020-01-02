package dynamic_prog;

public class LCSOf3Numbers {

	static String X = "AGGT12";
	static String Y = "12TXAYB";
	static String Z = "12XBA";

	static int[][][] dp = new int[100][100][100];

	static int lcsOf3(int i, int j, int k) {
		if (i == 0 || j == 0 || k == 0) {
			return 0;
		}
		if (dp[i][j][k] != -1) {
			return dp[i][j][k];
		}

		if (X.charAt(i-1) == Y.charAt(j-1) && Y.charAt(j-1) == Z.charAt(k-1)) {
			return dp[i][j][k] = 1 + lcsOf3(i - 1, j - 1, k - 1);
		} else {
			return dp[i][j][k] = Math.max(Math.max(lcsOf3(i - 1, j, k), lcsOf3(i, j - 1, k)), lcsOf3(i, j, k - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = X.length();
		int n = Y.length();
		int o = Z.length();

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				for (int k = 0; k < 100; k++) {
					dp[i][j][k] = -1;
				}
			}
		}

		System.out.print("Length of LCS is " + lcsOf3(m, n, o));

	}

}
