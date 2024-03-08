class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        Map<Integer, Integer> frequencyCount = new HashMap<>();
        for (int num : nums) {
            frequencyCount.put(num, frequencyCount.getOrDefault(num, 0) + 1);
        }

        
        int maxFrequency = 0;
        for (int count : frequencyCount.values()) {
            maxFrequency = Math.max(maxFrequency, count);
        }

        
        int maxFrequencyElements = 0;
        for (int count : frequencyCount.values()) {
            if (count == maxFrequency) {
                maxFrequencyElements++;
            }
        }

        
        int totalFrequency = maxFrequency * maxFrequencyElements;

        return totalFrequency;
    }
}