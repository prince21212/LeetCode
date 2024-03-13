class Solution {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        int totalSum = (n * (n + 1)) / 2;
        int currentSum = 0;
        for(int i = n; i >= 0; i--) {
            currentSum += i;
            if (currentSum == totalSum) {
                return i;
            }
            totalSum -= i;
        }
        return -1;
    }
}