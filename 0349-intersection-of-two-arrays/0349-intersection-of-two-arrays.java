class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
                Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        ArrayList <Integer> ans = new ArrayList<> ();
        int i;

        func(nums1);
        func(nums2);
         for( i = 0 ; i < n ; i++ )
         {
             for(int j = 0 ; j < m ; j++)
             {
                 if(nums1[i] != -1 || nums2[j] != -1)
                 {
                        if(nums1[i] == nums2[j])
                        {
                            ans.add(nums1[i]);
                        }
                 }
             }
         }
        int[] res = covertListToArray(ans);
        return res;
    }

    public void func(int[] arr){
        int i = 0;
        int n = arr.length;
        while(i < n)
        {
            int j = i+1;
             
             while(j < n && arr[i] == arr[j])
             {
                 arr[j] = -1;
                 j++;
             }
             i = j;
        }
        for(int x : arr){
            System.out.println(x);
        }
    }

    public int[] covertListToArray(ArrayList<Integer> list){
        int size = list.size();
         int i;
         int[] res = new int[size];
         if(size == 0)
         {
             return res;
         }
         else
         {
             i = 0;
            for(int ans1 : list)
           {
               res[i++] = ans1; 
           }
         }
         return res;
    }
}