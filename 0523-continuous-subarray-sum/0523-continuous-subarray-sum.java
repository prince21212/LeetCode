class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int sum =0;
        for(int i =0; i < nums.length ; i++){
            sum = sum + nums[i];
            
            if(hm.containsKey(sum % k)){
                
                int ind= hm.get(sum % k); //check the size
                
                if(i - ind >= 2){
                    return true;
                }
            }
            else{
                hm.put(sum%k, i); // storing first occurence
            }
        }
        
        return false;
    }
}