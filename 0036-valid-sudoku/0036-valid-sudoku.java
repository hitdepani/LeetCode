class Solution {
    public boolean isValidSudoku(char[][] board) {
        //check horizontal
        //vertical
        for (int i = 0; i < 9; i++) {
            int arr[] = new int[10];
            int brr[] = new int[10];

            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (arr[board[i][j] - '0'] != 0) {
                        return false;
                    } else
                        arr[board[i][j] - '0']++;
                }
                if(board[j][i]!='.'){
                    if (brr[board[j][i] - '0'] != 0) {
                        return false;
                    } else
                        brr[board[j][i] - '0']++;
                }

            }
        }
        for (int i = 0; i < 9; i++) {
            int x = (i / 3) * 3;
            int y = (i % 3) * 3;

            int arr[] = new int[10];
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (board[j+x][k+y] != '.') {
                        if (arr[board[j + x][k + y] - '0'] != 0) {
                            return false;
                        } else
                            arr[board[j + x][k + y] - '0']++;
                    }

                }
            }
        }
        return true;

    }
}