class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) return -1;
        
        int start = 1;
        int end = Arrays.stream(bloomDay).max().getAsInt();
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (canMakeBouquets(bloomDay, mid, m, k)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        
        return start;
    }
    
    private boolean canMakeBouquets(int[] bloomDay, int day, int m, int k) {
        int bouquets = 0;
        int flowers = 0;
        
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        
        return bouquets >= m;
    }
}