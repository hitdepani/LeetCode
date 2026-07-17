class Solution {
    boolean check=false;
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0)&&dfs(board,i,j,word,0))
                {
                    return true;
                }
                // if(check)
                // return true;
            }
        }
        return false;

    }
    boolean dfs(char[][] board,int i,int j,String word,int a)
    {
        if(a==word.length())
        {
            return true;
        }
        if(i<0||i>=board.length||j<0||j>=board[0].length)
        return false;
        
        if(a<word.length() && board[i][j]==word.charAt(a))
        {
            char c=board[i][j];
            board[i][j]='*';
            //visited[i][j]=true;
           boolean found= dfs(board,i+1,j,word,a+1)||
            dfs(board,i,j+1,word,a+1)||
            dfs(board,i-1,j,word,a+1)||
            dfs(board,i,j-1,word,a+1);
            //visited[i][j]=false;
            board[i][j]=c;
            return found;
        }
        return false;
        
    }
}