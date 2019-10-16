package 算法;

public class 毕业旅行 {

    public static void main(String[] args) {
        int[][] dist= new int[][]{{0,3,6,7},{5,0,2,7},{6,6,0,2},{3,3,5,0}};
        System.out.println(TSP(dist));
    }

    public static int TSP(int[][] dist){
        int m=dist.length;
        int n=1<<(m-1);
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0]=dist[i][0];
        }

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < m; i++) {
                dp[i][j]=Integer.MAX_VALUE;
                if(((j>>(i-1))&1)==0){
                    for (int k = 0; k < m; k++) {
                        if(((j>>(k-1))&1)==1){
                            dp[i][j]=Math.min(dp[i][j], dist[i][k]+dp[k][j^(1<<(k-1))]);
                        }
                    }
                }
            }
        }
        return dp[0][n-1];
    }
}
