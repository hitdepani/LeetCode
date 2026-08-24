class Solution {
    public int stoneGameVIII(int[] stones) {
        int n=stones.length; 
        int[] pre=stones.clone(); 
        for(int i=1;i<n;i++) 
        { 
            pre[i]+=pre[i-1]; 
        } 
        int best=pre[n-1]; 
        for(int i=n-2;i>=1;i--) 
        { 
            best=Math.max(best,pre[i]-best); 
        } 
        return best;
    }
}