class Solution {
    public int findMin(int[] nums) {
        int n =nums.length;
        if(n == 1 || nums[0] < nums[n-1]){
            return nums[0];
        }
        int left=0,right = n-1;
        int ans = Integer.MAX_VALUE;
        while(left <= right){
            int mid = left +(right - left)/2;
            
            if(nums[mid] >= nums[0]){
                left = mid+1;
            }
            else{
                ans = nums[mid];
                right = mid-1;
            }
        }
        return ans;
    }
}