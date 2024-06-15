class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int end = 0,start =0,n = nums.length,maxLength =0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        while(end < n){
            freq.put(nums[end],freq.getOrDefault(nums[end],0)+1);
            
            while(freq.get(nums[end]) > k){
                freq.put(nums[start],freq.get(nums[start])-1);
                start++;
            }
            maxLength = Math.max(maxLength,end-start+1);
            end++;
        }
        return maxLength;
    }
}