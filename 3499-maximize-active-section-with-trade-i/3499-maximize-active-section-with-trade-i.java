class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n=s.length();
        if(n==1)
        return s.charAt(0)-48;
        char[] arr = s.toCharArray();
        int max=0;
        int base=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]=='1')
            base++;
        }
       
       int pz=0;
        int i=0;
        while (i<n&&arr[i]=='0') {
            pz++;
            i++;
        }
        while(i<n)
        {
            while(i<n&&arr[i]=='1')
            i++;
            int cz=0;
            while(i<n&&arr[i]=='0')
            {
                cz++;
                i++;
            }
            if(pz>0&&cz>0)
            max=(Math.max(max,pz+cz));

            pz=cz;
            
        }
        return base+max;

    }
}