class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        int st[]= new int[n];
        int top=0;
        for(int i=0;i<n;i++)
        {
                    if(tokens[i].equals("+"))
                    {                        
                        st[top-2]=st[top-2]+st[top-1];
                        top--;
                    }
                    else if(tokens[i].equals("-"))
                    {                        
                        st[top-2]=st[top-2]-st[top-1];
                        top--;
                    }
                    else if(tokens[i].equals("*"))
                    {                        
                        st[top-2]=st[top-2]*st[top-1];
                        top--;
                    }
                    else if(tokens[i].equals("/"))
                    {                        
                        st[top-2]=st[top-2]/st[top-1];
                        top--;
                    }
                    else
                    {
                        st[top++]=Integer.parseInt(tokens[i]);
                    }          
                
            
        }
        return st[0];
    }
}