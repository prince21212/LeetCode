class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> row_min=new ArrayList<>();
        List<Integer> col_max=new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        
        for(int i=0; i<matrix.length; i++){
            int min=Integer.MAX_VALUE;
            for(int j=0; j<matrix[0].length; j++){
                min=Math.min(min, matrix[i][j]);
            }
            row_min.add(min);
        }
        for(int i=0; i<matrix[0].length; i++){
            int max=Integer.MIN_VALUE;
            for(int j=0; j<matrix.length; j++){
                max=Math.max(max, matrix[j][i]);
            }
            col_max.add(max);
        }

        for(int i=0; i<row_min.size(); i++){
            if(col_max.contains(row_min.get(i)))
                result.add(row_min.get(i));

        }
        return result;
    }
}