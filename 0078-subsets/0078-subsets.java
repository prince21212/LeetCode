class Solution {
     public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>(); 

        solution(nums, result, list, nums.length, 0);
        return result; 
    }

    private void solution(int[] nums, List<List<Integer>> result, List<Integer> list, int n, int start){
        result.add(new ArrayList(list));

        for(int i=start; i<n; i++){
            list.add(nums[i]);
            solution(nums, result, list, n, i+1);
            list.remove(list.size()-1);
        }
    }
}