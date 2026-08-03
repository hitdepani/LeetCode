class Solution {
    
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int arr[]= new int[n*m];
        int i=0,j=0,c=0;
        boolean check=true;
        
        while(c<(n*m))
        {
           if(check)
            {
                 while(j>=0 &&i>=0&&i<n&&j<m)
                {
                    arr[c++]=mat[i][j];
                    i--;
                    j++;
                    
                }
                if(j<m)
                i++;
                else
                {
                    i+=2;
                    j--;
                }
                check=false;
            }
            
            else
            {
                while(j>=0 &&i>=0&&i<n&&j<m)
                {
                    arr[c++]=mat[i][j];
                    i++;
                    j--;
                }
                if(i<n)//border thay gay
                j++;
                else//niche ni border
                {
                    i--;
                    j+=2;
                }
                check=true;
            }
            
        }
        
        return arr;
        
    }
}