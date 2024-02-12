class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
                int max = 0;
				for(int i =0 ; i<nums.length; i++) {
					if(count == 0) {
						max = nums[i];
					}
					if(nums[i] == max) {
						count++;
					} else {
						count--;
					}
				}

				return max;
    }
}