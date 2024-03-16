class Solution {
    public int findMaxLength(int[] arr) {
        
        int n = arr.length;
        Map<Integer, Integer> Count_map = new HashMap<>();
        int ans =0;
        int sum = 0;
        Count_map.put(0,-1);
        
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                sum += -1;
            }
            else if(arr[i] == 1)
            {
                sum += 1;
            }
            if(Count_map.containsKey(sum)){
                int idx = Count_map.get(sum);
                int len = i - idx;
                if(len > ans){
                    ans = len;
                }
            }
            else Count_map.put(sum,i);
            }
        
        return ans;
    }
}