class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> l= new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
              int idx=-1;
              int min=Integer.MAX_VALUE;
             int max=Integer.MIN_VALUE;
            for(int j=0;j<c;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    idx=j;
                }
            }
            for(int j=0;j<r;j++){
                if(max<matrix[j][idx]){
                    max=matrix[j][idx];
                }
            }
            if(min==max){
                l.add(min);
            }
        }
        return l;
    }
}