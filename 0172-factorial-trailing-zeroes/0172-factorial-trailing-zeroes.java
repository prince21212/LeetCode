class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        int powOf5 = 5;
        
        while(n >= powOf5){
            res = res + (n / powOf5);
             powOf5 = powOf5 * 5;
        }
        return res;
    }
}