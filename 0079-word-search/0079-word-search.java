class Solution {
    boolean check=false;
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    boolean[][] visited=new boolean[n][m];
                    dfs(board,i,j,word,0,visited);
                    
                }
                if(check)
                return true;
            }
        }
        return false;

    }
    void dfs(char[][] board,int i,int j,String word,int a,boolean[][] visited)
    {
        if(a==word.length())
        {
            check=true;
        }
        if(i<0||i>=board.length||j<0||j>=board[0].length||visited[i][j])
        return;
        
        if(a<word.length() && board[i][j]==word.charAt(a)&& !visited[i][j])
        {
            visited[i][j]=true;
            dfs(board,i+1,j,word,a+1,visited);
            dfs(board,i,j+1,word,a+1,visited);
            dfs(board,i-1,j,word,a+1,visited);
            dfs(board,i,j-1,word,a+1,visited);
            visited[i][j]=false;
        }
    }
}