class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
       HashMap<Integer,Integer>mp=new HashMap<>();
        int[]ans=new int[arr1.length];

        for(int num:arr1){
            int count=mp.getOrDefault(num,0);
            mp.put(num,count+1);
        }
        
        int i=0;
        for(int num:arr2){
            int val=mp.get(num);
            while(val!=0){
                ans[i]=num;
                i++;
                val--;
            }
            mp.remove(num);
        }
        int[]remaining=new int[arr1.length-i];
        int index=0;
        for(int num:arr1){
            if(mp.containsKey(num)){
                int val=mp.get(num);
                while(val!=0){
                    remaining[index]=num;
                    val--;
                    index++;
                }
            }
            mp.remove(num);
        }
        
        Arrays.sort(remaining);
        for(int k:remaining){
            ans[i++]=k;
        }

        return ans;
    }
}