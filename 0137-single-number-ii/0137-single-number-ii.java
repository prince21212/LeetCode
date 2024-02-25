class Solution {
    public int singleNumber(int[] A) {
     int ans =0;
        for(int i =0; i < 32; i++)
        {
           int cnt = 0;
            for(int j = 0; j < A.length ; j++)
            {
                if(chekBit(A[j],i))
                {
                    cnt++;
                }
            }
            if(cnt % 3==1)
            {
                ans += (1<<i);
            }
        }
        return ans;

    }
    boolean chekBit(int n, int i)
    {
        if(((n>>i)&1) == 1)
        {
            return true;
        }
        else
            return false;   
    }
    
}