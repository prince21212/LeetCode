class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum =0;
        int c =0;
        for(int i = happiness.length-1; i >=0 && k > 0; i--){
            if(happiness[i] - c > 0){
                sum = sum + (happiness[i]-c);
            }
            c++;
            k--;
        }
        return sum;
    }
}