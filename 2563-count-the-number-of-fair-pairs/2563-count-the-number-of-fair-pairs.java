class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
         Arrays.sort(nums);
        return PairsLessThanVal(nums, upper) - PairsLessThanVal(nums, lower - 1);
    }
    
    public long PairsLessThanVal(int[] nums, int val) {
        long count = 0;
        int i = 0, j = nums.length - 1;
        
        while (i < j) {
            if (nums[i] + nums[j] > val) {
                -- j;
            } else {
                count += j - i;
                ++ i;
            }
        }
        
        return count;
    }
}