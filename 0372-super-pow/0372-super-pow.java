class Solution {
private static final int MOD = 1337;
    public int superPow(int a, int[] b) {
        int result = 1;
        for (int digit : b) {
            result = pow(result, 10) * pow(a, digit) % MOD;
        }
        return result;
    }
    private int pow(int x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x % MOD;
        return pow(x % MOD, n / 2) * pow(x % MOD, n - n / 2) % MOD;
    }
}
