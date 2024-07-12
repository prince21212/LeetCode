class Solution {
    String str ;
    
    public int maximumGain(String s, int x, int y) {  
        str =s;
       String firstPair = (x >y) ?"ab":"ba";   // x = "ab"   y = "ba"
        String secPair = (firstPair .equals("ab"))?"ba":"ab";
        
        int score = 0;
        // first pass for removinf firstPair
        score = removeSubString(firstPair,Math.max(x,y));
        
        // second pass for removing SecPair
        score += removeSubString(secPair,Math.min(x,y));
        
        return score;
    }
    int removeSubString(String pair,int score){
        int count =0;
        Stack<Character> stack = new Stack<>();
        char firstChar = pair.charAt(0);
        char secChar = pair.charAt(1);
        
        for(char ch: str.toCharArray()){
            if(ch == secChar && !stack.isEmpty() && stack.peek() == firstChar){
                count +=score;
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        str = sb.toString();
        return count;
    }
    
}