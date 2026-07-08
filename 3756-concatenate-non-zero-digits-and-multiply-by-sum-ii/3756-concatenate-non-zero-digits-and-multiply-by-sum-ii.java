class Solution {
    public int[] sumAndMultiply(String s,int[][] q) {
        int mod=1000000007;
        int n=s.length();

        long[] p=new long[n+1];
        p[0]=1;
        for(int i=1;i<=n;i++){
            p[i]=(p[i-1]*10)%mod;
        }

        long[] a=new long[n+1];
        long[] b=new long[n+1];
        int[] c=new int[n+1];

        for(int i=0;i<n;i++){
            int d=s.charAt(i)-'0';
            a[i+1]=a[i]+d;

            if(d>0){
                b[i+1]=(b[i]*10+d)%mod;
                c[i+1]=c[i]+1;
            }else{
                b[i+1]=b[i];
                c[i+1]=c[i];
            }
        }

        int[] ans=new int[q.length];

        for(int i=0;i<q.length;i++){
            int l=q[i][0];
            int r=q[i][1];

            long sum=a[r+1]-a[l];
            int cnt=c[r+1]-c[l];
            long x=(b[l]*p[cnt])%mod;
            long num=(b[r+1]-x+mod)%mod;

            ans[i]=(int)((num*sum)%mod);
        }

        return ans;
    }
}