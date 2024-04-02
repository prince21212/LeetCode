class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (map1[sChar] != map2[tChar]) return false;
            
            map1[sChar] = i + 1;
            map2[tChar] = i + 1;
        }
        
        return true;
    }
}