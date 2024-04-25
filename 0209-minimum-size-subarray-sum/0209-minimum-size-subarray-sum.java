class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(j<nums.length) {
            sum += nums[j];
            if(sum < target){
            j++;
            }
            else {
                while(sum >= target) {
                    min = Math.min(min,(j-i+1));
                    sum -= nums[i];
                    i++;
                }
                j++;
            }
        }
        if(i==0) {
            return 0;
        }
        return min;
    }
}