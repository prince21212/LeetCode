class Solution {
    public int minDifference(int[] nums) {
//         int n = nums.length,mini = Integer.MAX_VALUE;
//         if(n <= 4) return 0;
//         Arrays.sort(nums);
//         for(int i =1; i <= 4; i++){
//             mini = Math.min(mini,Math.abs(nums[n-i] - nums[4-i]));
//         }
//         return mini;
        

        if(nums.length < 5)
            return 0;

        int ans = Integer.MAX_VALUE;
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        int d = Integer.MAX_VALUE;

        int e = Integer.MIN_VALUE;
        int f = Integer.MIN_VALUE;
        int g = Integer.MIN_VALUE;
        int h = Integer.MIN_VALUE;

        for(int i : nums)
        {
            if(i <= a)
            {

                d =c;
                c = b;
                b = a;
                a = i;

            }
            else if(i <= b)
            {
                d =c;
                c = b;
                b = i;
            }
            else if(i <= c)
            {
                d =c;
                c = i;
            }
            else if(i <= d)
            {
                d = i;
            }

            if(i >= h)
            {
                e = f;
                f = g;
                g = h;
                h = i;
            }
            else if(i >= g)
            {
                e = f;
                f = g;
                g = i;
            }
            else if(i >= f)
            {
                e = f;
                f = i;
            }
            else if(i >= e)
            {
                e = i;
            }
        }

        ans = Math.min(ans, h - d);
        ans = Math.min(ans, g - c);
        ans = Math.min(ans, f - b);
        ans = Math.min(ans, e - a);
        
        return ans;
    }
}