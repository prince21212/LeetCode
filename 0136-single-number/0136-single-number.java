class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
      int n = nums.length;
      int ans = 0;
      for(int i = 0; i < n ; i++)
      {
          if(i == n-1)
          {
              ans = nums[i];
              return ans;
          }
          else if(nums[n-1] != nums[n-2])
          {
              ans = nums[n-1];
              return ans;
          }
          if(nums[i] == nums[i+1])
          {
              i++;
          }
            else 
            ans = nums[i];

      }
      return ans;
    }
}
    