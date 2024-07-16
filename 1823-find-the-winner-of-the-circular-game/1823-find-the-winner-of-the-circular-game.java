class Solution {
    public int findTheWinner(int n, int k) {
        /* TC :O(N^2)
           SC :O(N)
           solution 1:
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i =1; i <= n; i++){
        //     list.add(i);
        // }
        // int index = 0;
        // while(list.size() > 1){
        //     index = (index + (k - 1)) % list.size();
        //     list.remove(index);
        // }
        // return list.get(0);
        */
        /*
        tc:O(n)
        sc:O(1)
        */
        int ans =0;
        for(int i = 2; i <= n; i++){
            ans = (ans + k) % i;
        }
        return ans+1;
    }
}