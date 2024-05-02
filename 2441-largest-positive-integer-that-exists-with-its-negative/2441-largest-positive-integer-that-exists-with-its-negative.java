class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int res = -1;
        for(int num : nums){
            hs.add(num);
            int k = num*(-1);
            if(hs.contains(k)){
                res = Math.max(res,Math.abs(num));
            }
        }
        return res;
    }
}