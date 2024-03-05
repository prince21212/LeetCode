class Solution {
    public int minimumLength(String s) {
       int i = 0, j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j))
                return j - i + 1;

             char curr = s.charAt(i);

            while(i < s.length() && s.charAt(i) == curr)
                i++;

            while(j >= 0 && s.charAt(j) == curr)
                j--;
        }

        return i == j ? 1 : 0; 
    }
}