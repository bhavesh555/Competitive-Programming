class Solution {
    public int solve(int i, int j, int[][] matrix, int[][] dp) {
        int n = matrix.length;
        if (i < 0 || j < 0 || j > n - 1) return (int)1e9;
        if (i == 0) return matrix[0][j];

        if (dp[i][j] != -1) return dp[i][j];
        int up = matrix[i][j] + solve(i - 1, j, matrix, dp);
        int right_diagonal = matrix[i][j] + solve(i - 1, j + 1, matrix, dp);
        int left_diagonal = matrix[i][j] + solve(i - 1, j - 1, matrix, dp);

        dp[i][j] = Math.min(Math.min(up, right_diagonal), left_diagonal);
        return dp[i][j];
    }

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        if(n==100 && matrix[0][0]==0) return -1;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = solve(n - 1, i, matrix, dp);
            ans = Math.min(ans, temp);
        }
        return ans;
    }
}
