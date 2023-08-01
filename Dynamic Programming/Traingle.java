class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n = triangle.size();

        int[][] dp = new int[n][triangle.get(n-1).size()];

        Arrays.stream(dp).forEach(a -> Arrays.fill(a, Integer.MAX_VALUE));

        return rec(triangle, 0, 0, dp);
    }

    public int rec(List<List<Integer>> arr, int i, int row, int[][] dp){
        if(row >= arr.size() || i >= arr.get(row).size()){
            return 0;
        }

        if(dp[row][i] != Integer.MAX_VALUE){
            return dp[row][i];
        }

        int choice_1 = rec(arr, i, row+1, dp);
        int choice_2 = rec(arr, i+1, row+1, dp);

        return dp[row][i] = arr.get(row).get(i)+Math.min(choice_1, choice_2);
    }
}
