class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] res = new int[k];
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for(int[] log:logs){
            if(!map.containsKey(log[0])){
                Set<Integer> set = new HashSet<>();
                for(int[] log1:logs){
                    if(log1[0]==log[0]){
                        set.add(log1[1]);
                    }
                }
                map.put(log[0],set);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int[] log:logs){
            if(!ans.contains(log[0])){
                ans.add(log[0]);
                Set<Integer> temp = map.get(log[0]);
                res[temp.size()-1]++;
            }
        }
        return res;
    }
}