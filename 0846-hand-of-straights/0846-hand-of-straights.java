class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n % groupSize != 0){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i <n; i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
            
        }
        for(int currCard : hand){
            if(!map.containsKey(currCard)){
                continue;
            }
            while(map.containsKey(currCard -1)){
                currCard--;
            }
            for(int i =0; i <groupSize ; i++){
                int card = currCard+i;
                if(!map.containsKey(card)){
                    return false;
                }
                map.put(card,map.get(card)-1);
                if(map.get(card) == 0){
                    map.remove(card);
                }
            }
        }
        return true;
    }
}