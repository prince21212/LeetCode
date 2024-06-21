class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
    int sat=0;
     int n=grumpy.length;
     for(int i=0;i<n;i++)
     {
        if(grumpy[i]==0)
        sat+=customers[i];
     }  

     int l=0;
     int r=0;
     int gp=0;
     int max=0;
     while(r<n)
     {
        if(grumpy[r]==1)
        gp+=customers[r];

        if(r-l>=minutes)
        {
           while(r-l>=minutes ) 
             {
                if(grumpy[l]==1)
                {
                    gp-=customers[l];
                }
                
                  l++;
            }
        }
      
        max=Math.max(gp,max);
        r++;

     }
     return sat+max;
    }
}