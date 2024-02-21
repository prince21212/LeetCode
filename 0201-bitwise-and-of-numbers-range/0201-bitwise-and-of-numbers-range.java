class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int rightShiftcnt = 0;
        while (left != right) {
            left =left >> 1;
            right =right >> 1;
            rightShiftcnt++;
        }
        return (left << rightShiftcnt);
    }
}