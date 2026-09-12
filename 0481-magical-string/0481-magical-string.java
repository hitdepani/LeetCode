class Solution {
    public int magicalString(int n) {
        if(n==0)return 0;
        if (n<=3)return 1;
        int arr[]= new int[n+1];
        int k=1,i=2,j=3;
        arr[0]=1;
        arr[1]=2;
        arr[2]=2;

        int c=1;
        int last=1;
        while(j<n)
        {
            for(int m=0;m<arr[i];m++)
            {
                arr[j]=k;
                if(k==1&&j<n)
                c++;

                j++;
            }
            if(k==1)
            k=2;
            else k=1;
            i++;
        }
        return c;
    }
}