class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int ans = 0;
        int c = 1;
        int ct =0;
        while (n > 0) {
            if(ct == 8){
                c +=1;
                ct = 0;
             }
            ct +=1;
            ans += c;
            n--;
        }
      return ans;
    }
}