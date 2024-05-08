class Solution {
    public String[] findRelativeRanks(int[] score) {
        // Create a copy of the original array
        int n=score.length;
        int[] copy = Arrays.copyOf(score,n);
        // Sort the copied array
        Arrays.sort(copy);
        HashMap<Integer,Integer>map=new HashMap<>();
        int idx=0;
        for(int i=n-1;i>=0;i--){
            map.put(copy[i],++idx);
        }
        String ans[]=new String[n];
        for(int i=0;i<n;i++){
            if(map.get(score[i])==1) ans[i]="Gold Medal";
            else if(map.get(score[i])==2) ans[i]="Silver Medal";
            else if(map.get(score[i])==3) ans[i]="Bronze Medal";
            else{
                ans[i]=map.get(score[i])+"";
            }
        }
        return ans;
    }
}