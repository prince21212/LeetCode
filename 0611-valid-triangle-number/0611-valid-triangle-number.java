class Solution {
    public int triangleNumber(int[] A) {
       int n = A.length;
       int count = 0;
        Arrays.sort(A);
        for(int i =2; i < n; i++){
           int left = 0,right=i-1;
            while(left < right){
                if((A[left] + A[right]) > A[i]){
                    count = count +right-left;
                    right--;
                }else{
                    left++;
                }
            }
       }
        return  count;
      }
}