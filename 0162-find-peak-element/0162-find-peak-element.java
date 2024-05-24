class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int left =0,right=n-1;
        while(left < right){
            int mid = left+(right-left)/2;
            System.out.println(mid);
            if (nums[mid] < nums[mid + 1]) {
            left = mid + 1;
          //  System.out.println(left);

            }
            else {
                right=mid;
              //  System.out.println(right);

            }
    }
      //  System.out.println(left);

        return left;
    }
}