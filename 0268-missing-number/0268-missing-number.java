class Solution {
    public int missingNumber(int[] nums) {
        int sum =0;
        int sum2 = 0;
        for(int i =0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        for(int i =0; i <= nums.length; i++){
            sum2 = sum2 + i;
        }
        
        return sum2-sum;
    }
}