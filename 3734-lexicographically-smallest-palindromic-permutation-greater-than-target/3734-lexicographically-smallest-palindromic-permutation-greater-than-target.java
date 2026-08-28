class Solution
{
    int[]f=new int[26];
    char[]r;
    String t;
    int n;
    
    public String lexPalindromicPermutation(String s,String target)
    {
        n=s.length();
        t=target;
        r=new char[n];
        
        for(int i=0;i<n;i++)
        {
            f[s.charAt(i)-'a']++;
        }
        
        int o=0;
        for(int i=0;i<26;i++)
        {
            if(f[i]%2!=0)
            {
                o++;
            }
        }
        
        if(o>1)
        {
            return "";
        }
        
        if(d(0,false))
        {
            return new String(r);
        }
        
        return "";
    }
    
    boolean d(int i,boolean g)
    {
        if(i==n/2)
        {
            if(n%2!=0)
            {
                for(int j=0;j<26;j++)
                {
                    if(f[j]>0)
                    {
                        r[i]=(char)(j+'a');
                        break;
                    }
                }
            }
            return new String(r).compareTo(t)>0;
        }
        
        for(int j=0;j<26;j++)
        {
            if(f[j]>=2)
            {
                char c=(char)(j+'a');
                if(!g&&c<t.charAt(i))
                {
                    continue;
                }
                
                f[j]-=2;
                r[i]=c;
                r[n-1-i]=c;
                
                if(d(i+1,g||c>t.charAt(i)))
                {
                    return true;
                }
                
                f[j]+=2;
            }
        }
        return false;
    }
}