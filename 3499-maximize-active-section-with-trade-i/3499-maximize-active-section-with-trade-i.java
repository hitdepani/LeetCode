class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n=s.length();
        if(n==1)
        return s.charAt(0)-48;
        char[] arr = s.toCharArray();
        int max=Integer.MIN_VALUE;
        int base=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            base++;
        }
       
       
        int i=0;
        while(i<n)
        {
            if(arr[i]=='1')
            {
                int k=i-1;
                
                int j=i+1;
                int newz=0;
                while(j<n&&arr[j]=='1'){
                     j++;
                }
                
                int l=j;
                //lesft
                while(k>=0&&arr[k]=='0')
                {
                    k--;
                    newz++;
                }
                
                //right
                while(l<n&&arr[l]=='0')
                {
                    l++;
                    newz++;
                }
                if(l!=j&&k!=i-1)
                {
                    max=Math.max(max,newz+base);
                    i=j;
                }
                i=j;
            }
            else
            i++;

        }
        return Math.max(base,max);

    }
}