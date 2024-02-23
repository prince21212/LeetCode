class Solution {
    public String longestPalindrome(String s) {
     int n = s.length();
        int max_len = 0;
        String longestPalindrome = "";

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPal(s, i, j)) {
                    int len = j - i + 1;
                    if (len > max_len) {
                        max_len = len;
                        longestPalindrome = s.substring(i, j + 1);
                    }
                }
            }
        }

        return longestPalindrome;
    }

    boolean isPal(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}