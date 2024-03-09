class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int a=0,b=0,n=0;
        while(a<nums1.length&&b<nums2.length)
        {
            if(nums1[a]==nums2[b])
            {
                return nums1[a];
            }
            else if(nums1[a]<nums2[b])
            {
              a++;
            }
            else
            {
            b++;
            }
            n++;

        }
        return -1;
    }
}