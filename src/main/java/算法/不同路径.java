package 算法;

public class 不同路径 {
    public int uniquePaths(int m, int n) {
        int[][] dp =new int[n][m];
        for (int i = 0; i <n ; i++) {
            dp[i][0]=1;
        }
        for (int j = 1; j <m ; j++) {
            dp[0][j]=1;
        }

        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < m ; j++) {
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[n-1][m-1];
    }

    public int uniquePaths1(int m, int n) {
        int[] dp = new int[m];
        for (int i = 0; i < m ; i++) {
            dp[i]=1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[j] = dp[j-1]+dp[j];
            }
        }
        return dp[m-1];
    }
}
