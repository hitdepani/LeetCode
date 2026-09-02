class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long sumMin=0;
        long sumMax=0;
        Stack<Integer> st= new Stack<>();
        int l[]= new int[n];
        int r[]= new int[n];
        
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty()&&nums[st.peek()]>nums[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                l[i]=i+1;
            }
            else
            {
                l[i]=i-st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty()&&nums[st.peek()]>=nums[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                r[i]=n-i;
            }
            else
            {
                r[i]=st.peek()-i;
            }
            st.push(i);
        }
        for(int i=0;i<n;i++)
        {
            sumMin=sumMin+(long)nums[i]*l[i]*r[i];
        }
        
        st.clear();
        
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty()&&nums[st.peek()]<nums[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                l[i]=i+1;
            }
            else
            {
                l[i]=i-st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty()&&nums[st.peek()]<=nums[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                r[i]=n-i;
            }
            else
            {
                r[i]=st.peek()-i;
            }
            st.push(i);
        }
        for(int i=0;i<n;i++)
        {
            sumMax=sumMax+(long)nums[i]*l[i]*r[i];
        }
        
        return sumMax-sumMin;
    }
}