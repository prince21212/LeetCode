class Solution {
    public int trap(int[] arr) {
        int sum = 0;
    int n = arr.length;
    int[] left_max = leftmax(arr);
    int[] right_max = rightmax(arr);
    int min = 0;
    int area = 0;
    for (int i = 0; i < n; i++) {
         
            min = Math.min(left_max[i], right_max[i]);
            area = (min - arr[i]) * 1;
            sum += area;
        
    }
    return sum;
}

public static int[] leftmax(int[] height) {
    int n = height.length;
    int[] leftMax = new int[n];
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(leftMax[i - 1], height[i]);
    }
    return leftMax;
}

public static int[] rightmax(int[] height) {
    int n = height.length;
    int[] rightMax = new int[n];
    rightMax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        rightMax[i] = Math.max(rightMax[i + 1], height[i]);
    }
    return rightMax;
    }
}