class Solution {
    public int magicalString(int n) {
        if(n==0)return 0;
        if (n<=3)return 1;
        if(n==4)return 2;
        if(n<=6)return 3;
        int k=5,i=5,j=3;
        StringBuilder a=new StringBuilder("122112");
        
        int c=3;
        int last=2;
        while(a.length()<n)
        {
            if(last==1)
            {
                int x=a.charAt(j+1)-'0';
                if(x==1)
                {
                    a.append("2");
                    i++;
                }                
                else
                {
                    a.append("22");
                    i+=2;
                }
                j++;
            }
            else
            {
                int x=a.charAt(j+1)-'0';
                if(x==1)
                {
                    a.append("1");
                    i++;
                    c++;
                }                
                else
                {
                    a.append("11");
                    i+=2;
                    if(a.length()>n)
                    c++;
                    else
                    c+=2;
                }
                j++;
            }
            last=a.charAt(i)-'0';
        }
        return c;
    }
}