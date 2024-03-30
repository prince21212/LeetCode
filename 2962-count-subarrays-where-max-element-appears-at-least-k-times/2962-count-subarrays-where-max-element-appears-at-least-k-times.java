class Solution {
    public long countSubarrays(int[] nums, int k) {
        int count =0;
        int n = nums.length;
        int lt=0,rt=0;
        int max = Integer.MIN_VALUE;
        long ans =0;
        
        for(int i =0; i < n; i++){
            max= Math.max(max,nums[i]);
        
        }
        while(rt < n ){
            if(nums[rt] == max){
                count ++;
            }
            while(count >= k){
                ans += n-rt;
                
                if(nums[lt] == max)
                    count--;
                lt++;
            }
            rt++;
        }
        
        return ans;
    }
}
   