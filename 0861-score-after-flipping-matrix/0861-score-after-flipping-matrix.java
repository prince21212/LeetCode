class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = n*(1 <<(m-1-0));
        for(int j= 1; j < m; j++){
            int colCount =0;
            for(int i =0; i < n ;i++){
                if(grid[i][0] == 0){
                    colCount = colCount+(grid[i][j] ^1);
                }
                else{
                    colCount = colCount + grid[i][j];
                }
            }
                if(colCount < n- colCount){
                    ans = ans+ (n-colCount)*(1 <<(m-1-j));
                }
                else{
                    ans = ans+ (colCount ) * (1 <<(m-1-j));
                }
            }
        return ans;
    }
}