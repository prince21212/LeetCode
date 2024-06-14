class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int Count=0,min=nums[0];
       for(int i=1;i<nums.length;i++){
         if(nums[i]<=min) {
             Count += min-nums[i]+1;
             min++;
         }
           else  min=nums[i];
       }
       return Count;
    }
}