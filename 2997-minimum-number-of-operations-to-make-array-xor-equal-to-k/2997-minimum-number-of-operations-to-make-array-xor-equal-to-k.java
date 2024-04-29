class Solution {
    public int minOperations(int[] nums, int k) {
       int xor = nums[0];
        for (int i=1; i < nums.length; i++) {
            xor ^= nums[i];
        }
        
        int count = 0;
        
        for (int i=31; i >= 0; i--) {
            int xorBit = (xor >> i) & 1;
            int kBit = (k >> i) & 1;
            
            if (xorBit != kBit) count++;
        }
        
        return count; 
    }
}