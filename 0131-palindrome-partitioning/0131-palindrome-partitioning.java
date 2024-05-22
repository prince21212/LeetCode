class Solution {
   List<List<String>> ans = new ArrayList<>();
    List<String> curr = new ArrayList<>();
    boolean isPalindrome(String s, int low, int high) {
        while (low < high)
            if (s.charAt(low++) != s.charAt(high--)) return false;

        return true;
    }
    void genrate(String s,int start)
    {
        if(start >=s.length())
            ans.add(new ArrayList<>(curr));
        for(int i=start;i<s.length();i++)
        {
            if(isPalindrome(s,start,i))
            {
                curr.add(s.substring(start,i+1));
                genrate(s,i+1);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        genrate(s,0);
        return ans;
    }
}