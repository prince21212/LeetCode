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
   /*int max = 0;
        for(int num: nums) {
            max = Math.max(max,num);
        }
        int freq = 0;
        long res = 0;
        int i = 0;
        int j =0;
        while(j<nums.length) {
            if(nums[j]==max)
               freq++;
            while(freq>=k) {
                res+=nums.length-j;
                if(nums[i]==max)
                    freq--;
                i++;
            }
            j++;
        }
        return res;*/