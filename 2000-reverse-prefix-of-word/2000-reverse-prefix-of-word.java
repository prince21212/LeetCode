class Solution {
    public String reversePrefix(String word, char ch) {
        char[] c=word.toCharArray();
        
        for(int i =0; i <word.length(); i++)
        {
            if(word.charAt(i) == ch){
                int j=0;
                while(j < i){
                    swap(c,j++,i--);
                }
                return new String(c);
            }
        }
        return word;
    }
    public void swap(char[] c,int idx1,int idx2){
        char temp = c[idx2];
        c[idx2] = c[idx1];
        c[idx1] = temp;
    }
    
}