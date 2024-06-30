class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length; 
        if (n == 1) return 1; // If there's only one element, we need to delete it, so return 1

        // Initialize variables to find the minimum and maximum elements and their indices
        int minIndex = nums.length; // Initialize minIndex to an out-of-bounds value
        int maxIndex = -1; // Initialize maxIndex to an out-of-bounds value
        int maxElement = Integer.MIN_VALUE; // Initializing maxEle as the smallest possible value for maxElement
        int minElement = Integer.MAX_VALUE; // Initializing minEle as the largest possible value for minElement

        // Iterate through the array to find the minimum and maximum elements and their indices
        for (int i = 0; i < n; i++) {
            if (maxElement < nums[i]) { // If the current element is larger than maxElement
                maxElement = nums[i]; // Update maxElement
                maxIndex = i; // Update maxIndex
            }
            if (minElement > nums[i]) { // If the current element is smaller than minElement
                minElement = nums[i]; // Update minElement
                minIndex = i; // Update minIndex
            }
        }

        // Calculate the number of deletions needed if we remove elements from the front
        int front = Math.max(maxIndex + 1, minIndex + 1);
        // Math.max because we need to make sure both min and max are deleted,
        // so we take the larger index + 1 (since index is 0-based and we need the count)

        // Calculate the number of deletions needed if we remove elements from the back
        int back = Math.max(n - maxIndex, n - minIndex);
        // Math.max because we need to make sure both min and max are deleted,
        // so we take the larger distance from the end

        // Calculate the number of deletions needed if we remove elements from both ends
        int middle = Math.min(minIndex + 1, n - minIndex) + Math.min(maxIndex + 1, n - maxIndex);
        // Math.min because we find the closest end for min and max respectively and sum them

        // Return the minimum deletions required among the three strategies
        return Math.min(back, Math.min(front, middle));
    }
}
