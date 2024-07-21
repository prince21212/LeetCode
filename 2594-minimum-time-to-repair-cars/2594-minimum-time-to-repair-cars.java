class Solution {
    public long repairCars(int[] ranks, int cars) {
       long highestRank = 0;
        long lowestRank = 0;
        for(int rank: ranks){
            highestRank = Math.max(highestRank, rank);
            lowestRank = Math.min(lowestRank, rank);
        }
        
        long low = lowestRank * cars * cars;
        long high = highestRank * cars * cars;

        long minTime = high;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if(canRepair(ranks, cars, mid)){
                minTime = mid; 
                high = mid-1; 
            }else{
                low = mid+1; 
            }
        }
        return minTime;
    }

    boolean canRepair(int[] ranks, int cars, long time){
        for(int rank : ranks){
            int carsCanBeRepaired = (int) Math.sqrt((long)time/ (long)rank);
            cars -= carsCanBeRepaired; 
            if(cars <= 0)
                return true; 
        }
        return cars <= 0; 
    }
}