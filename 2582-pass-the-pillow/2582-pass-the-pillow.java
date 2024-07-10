class Solution {
    public int passThePillow(int n, int time) {
        int total = n*2 - 2;
        int rem = time % total;
        if(rem < n)
        {
            return rem + 1;
        }
        else
        {
            return n - (rem - n + 1);
        }
    }
}