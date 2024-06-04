class Solution {
    public int longestPalindrome(String s) {
       int[] arr = new int[58]; // Array to store character frequencies
        int sum = 0;
        boolean hasOdd = false;  // Flag for odd character presence

        for (char c : s.toCharArray()) {
            arr[c - 'A']++; // Increment count for each character
        }

        for (int count : arr) {
            if (count % 2 == 0) {
                sum += count; // Add even counts to total length
            } else {
                sum += count - 1; // Exclude single center character
                hasOdd = true;     // Set flag for odd character
            }
        }

        return sum + (hasOdd ? 1 : 0); // Add center character if needed
    }
}