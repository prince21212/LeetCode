class Solution {
    public int maximumGap(int[] nums) {
      if(nums.length< 2)
        {
            return 0;
        }
        int maxDiff= Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i= 0; i< nums.length; i++)
        {
            if(i+1 < nums.length)
            {
                int diff= nums[i+ 1]- nums[i]; // sorted - so no need Math.abs
                maxDiff= Math.max(diff, maxDiff);
            }
        }
        return maxDiff;
    }
}