class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum=0;
        int res=0;
        hm.put(0,1);
        for(int i =0; i < nums.length; i++){
            sum += nums[i];
            int mod = sum % k;
            if(mod < 0){
                mod = mod % k +k;
            }
            if(hm.containsKey(mod)){
                res += hm.get(mod);
            }
                hm.put(mod,hm.getOrDefault(mod,0)+1);
            }
        return res;
    }
}