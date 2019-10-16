package 算法;

public class 有障碍不同路径 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m =obstacleGrid[0].length;
        int[][] dp =new int[n][m];

        for (int i = 0; i < n; i++) {
            if(obstacleGrid[i][0]==0){
                dp[i][0]=1;
            }else{
                break;
            }
        }

        for (int j = 0; j < m; j++) {
            if(obstacleGrid[0][j]==0){
                dp[0][j]=1;
            }else{
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m ; j++) {
                if(obstacleGrid[i][j]==0){
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[n-1][m-1];
    }

    public int uniquePathsWithObstacles1(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m =obstacleGrid[0].length;


        if(obstacleGrid[0][0]==1){
            return 0;
        }else{
            obstacleGrid[0][0]=1;
        }

        boolean flag=true;
        for (int i = 1; i < n; i++) {
            if(flag&&obstacleGrid[i][0]==0){
                obstacleGrid[i][0]=1;
            }else{
                flag=false;
                obstacleGrid[i][0]=0;
            }
        }

        flag=true;
        for (int j = 1; j < m; j++) {
            if(flag&&obstacleGrid[0][j]==0){
                obstacleGrid[0][j]=1;
            }else{
                flag=false;
                obstacleGrid[0][j]=0;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m ; j++) {
                if(obstacleGrid[i][j]==0){
                    obstacleGrid[i][j]=obstacleGrid[i][j-1]+obstacleGrid[i-1][j];
                }else {
                    obstacleGrid[i][j]=0;
                }
            }
        }
        return obstacleGrid[n-1][m-1];
    }
}
