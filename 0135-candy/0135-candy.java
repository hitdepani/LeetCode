class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int arr[] = new int[n];
        int sum=n;
        Arrays.fill(arr,1);
        boolean tryy=true;
        while(tryy)
        {
            boolean changed=false;
            if(n>1 && ratings[0]>ratings[1] && arr[0]<=arr[1])
            {
                arr[0]++;
                sum++;
                changed=true;
            }
            for(int i=1;i<n-1;i++)
            {
                if(ratings[i]>ratings[i+1] && arr[i]<=arr[i+1] ||ratings[i]>ratings[i-1] && arr[i]<=arr[i-1])
                {
                    sum++;
                    arr[i]++;
                    changed=true;
                }
                
            }
            if(n>=2 && ratings[n-1]>ratings[n-2] && arr[n-1]<=arr[n-2])
            {
                arr[n-1]++;
                sum++;
                changed=true;
            }
            
            if(!changed)
            return sum;
        }
        
        return sum;
    }
}