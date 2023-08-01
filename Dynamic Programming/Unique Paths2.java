class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }

        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[rows - 1][cols - 1] == 1) {
            return 0;
        }
        if (rows == 1 && cols == 1) {
            return 1;
        }

        if (rows >= cols) {
            return uniquePathHelper(obstacleGrid, rows, cols, true);
        } else {
            return uniquePathHelper(obstacleGrid, cols, rows, false);
        }
    }

    private int uniquePathHelper(int[][] obstacleGrid, int big, int small, boolean isColsSmall) {
        int[] dp = new int[small];
        dp[0] = 1;
        for (int i = 0; i < big; i++) {
            if ((isColsSmall && obstacleGrid[i][0] == 1) || (!isColsSmall && obstacleGrid[0][i] == 1)) {
                dp[0] = 0;
            }
            for (int j = 1; j < small; j++) {
                if ((isColsSmall && obstacleGrid[i][j] == 1) || (!isColsSmall && obstacleGrid[j][i] == 1)) {
                    dp[j] = 0;
                    continue;
                }
                dp[j] += dp[j - 1];
            }
        }
        return dp[small - 1];
    }
}
