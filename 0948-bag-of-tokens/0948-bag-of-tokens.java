class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
       // if(tokens[0]<power) return 0;
        int i=0;
        
        int j=tokens.length-1;
        while(i<=j){
        if(tokens[i]<=power){
            power-=tokens[i];
            score++;
            i++;
         }
         else if(score>=1 && i<j){
            power+=tokens[j];
            score--;
            j--;
        }
         else {
            break;
          }  
        
        }
        
        return score;
    }
}