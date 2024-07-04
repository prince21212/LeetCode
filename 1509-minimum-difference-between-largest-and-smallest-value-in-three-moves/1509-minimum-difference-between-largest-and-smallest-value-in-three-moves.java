class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length,mini = Integer.MAX_VALUE;
        if(n <= 4) return 0;
        Arrays.sort(nums);
        for(int i =1; i <= 4; i++){
            mini = Math.min(mini,Math.abs(nums[n-i] - nums[4-i]));
        }
        return mini;
        
    }
}