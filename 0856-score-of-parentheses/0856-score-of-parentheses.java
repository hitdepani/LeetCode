class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            st.push(0);
            else
            {
                if(st.peek()==0)
                {
                    st.pop();
                    st.push(1);
                }
                else
                {
                    int sum=0;
                    while(st.peek()!=0)
                    {
                        sum+=st.pop();
                    }
                    st.pop();
                    st.push(sum*2);
                }
            }
        }
        int res=0;
        while(!st.isEmpty())
        {
            res+=st.peek();
            st.pop();
        }
        return res;
    }
}
