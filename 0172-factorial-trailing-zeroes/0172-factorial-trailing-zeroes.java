class Solution {
    public int trailingZeroes(int n) {
        int ct=0;
        for(int i=5;i<=n;i*=5)
            ct=ct+n/i;
        return ct;
    }
}