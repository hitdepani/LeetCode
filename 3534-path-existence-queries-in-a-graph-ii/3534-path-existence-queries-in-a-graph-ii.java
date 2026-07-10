class Solution {
    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[][] nodePairs=new int[n][2];
        for(int i=0; i<n; i++){
            nodePairs[i][0]=nums[i];
            nodePairs[i][1]=i;
        }
        Arrays.sort(nodePairs, (a, b) -> Integer.compare(a[0], b[0]));
        int[] sortedPos=new int[n];
        for(int i=0; i<n; i++){
            sortedPos[nodePairs[i][1]]=i;
        }
        int maxLog=18;
        int[][] maxJump=new int[maxLog][n];
        int right=0;
        for(int left=0; left<n; left++){
            while(right+1<n && nodePairs[right+1][0]-nodePairs[left][0]<=maxDiff){
                right++;
            }
            maxJump[0][left]=right;
        }
        for(int j=1; j<maxLog; j++){
            for(int i=0; i<n; i++){
                maxJump[j][i]=maxJump[j-1][maxJump[j-1][i]];
            }
        }
        int[] result=new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int u=sortedPos[queries[i][0]];
            int v=sortedPos[queries[i][1]];
            int start=Math.min(u, v);
            int target=Math.max(u, v);

            if(start==target){
                result[i]=0;
                continue;
            }
            if(maxJump[0][start]>=target){
                result[i]=1;
                continue;
            }
            if(maxJump[maxLog-1][start]<target){ 
                result[i]=-1;
                continue;
            }

            int steps=0;
            int current=start;
            
            for(int j=maxLog-1; j>=0; j--){
                if(maxJump[j][current]<target){
                    steps+=(1<<j); 
                    current=maxJump[j][current];
                }
            }
            
            result[i]=steps+1;
        }
        
        return result;
    }
}