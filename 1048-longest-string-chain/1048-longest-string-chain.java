class Solution {
    boolean help(String a,String b)
    {
        if(a.length()+1!=b.length())return false;
        int i=0,j=0;
        while(i<a.length()&&j<b.length())
        {
            if(a.charAt(i)==b.charAt(j))
            i++;
            j++;
        }
        return i==a.length();
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int n=words.length;
        int dp[]= new int[words.length];
        Arrays.fill(dp,1);
         int max=1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(help(words[j],words[i]))
                {
                    if(dp[i]<(dp[j]+1))
                    {
                        dp[i]=dp[j]+1;
                    }
                    
                }
                max=Math.max(max,dp[i]);
            }
        }
       
        
        return max;
    }
}