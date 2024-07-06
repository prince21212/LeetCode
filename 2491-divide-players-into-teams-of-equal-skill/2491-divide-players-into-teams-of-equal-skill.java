class Solution {
    public long dividePlayers(int[] skillz) {
        int sum = 0;
        for(int skill : skillz) sum += skill;

        int averageSkill = sum / (skillz.length / 2);
        int[] map = new int[1001];
        long chemistry = 0;
        for(int skill : skillz){
            if(map[skill] != 0){
                chemistry += skill * (averageSkill - skill);
                map[skill] --;
            }
            else if((averageSkill - skill) < 0 ||
                    (averageSkill - skill) > 1000) return -1;
            else map[averageSkill - skill]++; 
        }

        for(int entry : map) if(entry != 0) return -1;
        return chemistry;
    }
}