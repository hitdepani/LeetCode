class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int min=1000;
        int i=0,j=0;
        int c=0;
        String res="";
        while(j<n)
        {
            if(s.charAt(j)=='1')
            c++;
            while(c>k||(i<=j&&s.charAt(i)=='0'))
            {
                if(s.charAt(i)=='1')
                c--;
                i++;
            }
            if(c==k)
            {
                int x=j-i+1;
                String ss=s.substring(i,j+1);
                if(x<min)
                {
                    min=x;
                    res=ss;
                }
                else if(x==min)
                {
                    if(ss.compareTo(res)<0)
                    res=ss;
                }
            }
            j++;
        }
        return res;
    }
}