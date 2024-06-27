class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum=0;
        int res=0;
        hm.put(0,1);
        for(int i =0; i < nums.length; i++){
            //sum of all the elemets with its prefix element
            sum += nums[i];
            //finding the mod value to compare and put into hashmap if not present
            int mod = sum % k;
            // handling the the case were mod becomes -ve number 
            if(mod < 0){
                mod = mod % k +k; // converting the mod into positive number
            }
            // if mod is present into map increamrnt the result by one 
            // we can say that there a subarray which is divisible by k present in map
            if(hm.containsKey(mod)){
                res += hm.get(mod);
            }
                // storing the mod value and the frequency of that element in map
                hm.put(mod,hm.getOrDefault(mod,0)+1);
            }
        return res;
    }
}