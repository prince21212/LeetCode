class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] ans= new int[n/3][3];
        int m =0;
        int c =0;
        Arrays.sort(nums);
        for(int i =0; i < n; i +=3){
             
            if( nums[i+2] - nums[i] > k){
                return new int[0][0];
            }
            else{
                
                for(int j=0; j < 3 ; j++)
                {
                    ans[m][j] =nums[c];
                    c++;
                }
                m++;
            }
        }
        return ans;
    }
}