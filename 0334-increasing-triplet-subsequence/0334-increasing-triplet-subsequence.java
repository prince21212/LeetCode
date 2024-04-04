class Solution {
    public boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int num : nums){
            if(max1 >= num){
                max1 = num;
            }
            else if(max2 >= num){
                max2 = num;
            }
            else{
                return true;
            }
        }
        return false;
    }
}