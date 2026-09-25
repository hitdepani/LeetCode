class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++)
        {
            
                if(st.size()>1){
                    int x=st.pop();
                    int y=st.pop();
                    if(tokens[i].equals("+"))
                    st.push(y+x);
                    else if(tokens[i].equals("-"))
                    st.push(y-x);
                    else if(tokens[i].equals("*"))
                    st.push(y*x);
                    else if(tokens[i].equals("/"))
                    st.push(y/x);
                    else
                    {
                        st.push(y);
                        st.push(x);
                        st.push(Integer.parseInt(tokens[i]));
                        
                    }
                    
                }
                
                else
                st.push(Integer.parseInt(tokens[i]));
            
        }
        return st.pop();
    }
}