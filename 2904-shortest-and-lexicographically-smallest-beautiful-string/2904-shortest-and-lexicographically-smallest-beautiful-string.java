class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String res="";
        int min=1000;
        for(int i=0;i<s.length();i++)
        {
            int c=0;
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(j)=='1')
                {
                    c++;
                }
                if(c==k)
                {
                    int a=j-i+1;
                    String ss=s.substring(i,j+1);
                    if(a<min)
                    {
                        min=a;
                        res=ss;
                    }
                    else if(a==min)
                    {
                        if(ss.compareTo(res)<0)
                        {
                            res=ss;
                        }
                    }
                    break;
                }
            }
        }
        return res;
    }
}