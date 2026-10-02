class Solution {
    List<String> list= new ArrayList<>();
    void help(int n,int i,int j,int m,String s)
    {
        if(2*n==m)
        {
            list.add(s);
            return ;
        }
        if(i<n)
        help(n,i+1,j,m+1,s+'(');
        if(j<n&&i>j)
        help(n,i,j+1,m+1,s+')');
    }
    public List<String> generateParenthesis(int n) {
        help(n,0,0,0,"");
        return list;
    }
}