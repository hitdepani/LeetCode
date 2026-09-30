class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int c=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(seq.charAt(i)=='(')
            {
                c++;
                if(c%2==1) arr[i]=0;
                else arr[i]=1;
            }
            else
            {
                
                if(c%2==1) arr[i]=0;
                else arr[i]=1;
                c--;
            }
            
            
        }
        return arr;
    }
}