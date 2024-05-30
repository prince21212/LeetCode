class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] prefixXOR = new int[n + 1];
        
        // Build prefix XOR array
        for (int i = 0; i < n; i++) {
            prefixXOR[i + 1] = prefixXOR[i] ^ arr[i];
        }
        
        int count = 0;
        
        // Iterate over each possible k
        for (int k = 0; k < n; k++) {
            for (int i = 0; i <= k; i++) {
                // Check if the condition prefixXOR[i-1] == prefixXOR[k] holds
                if (prefixXOR[i] == prefixXOR[k + 1]) {
                    // All possible j values that satisfy 0 <= i < j <= k are counted
                    count += (k - i);
                }
            }
        }
        
        return count;
    }
}