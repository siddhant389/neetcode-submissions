class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0; i < 9; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();
            for(int j=0; j < 9; j++){
                if(row.contains(board[i][j]) || col.contains(board[j][i])) return false;
                if(board[i][j] != '.') row.add(board[i][j]);
                if(board[j][i] != '.') col.add(board[j][i]);
            }
        }

        for(int i=0; i < 9; i= i+3) {
            for(int j=0; j < 9; j=j+3){
                Set<Character> grid = new HashSet<>();
                for(int a=i; a < i+3; a++){
                    for(int b=j; b < j+3; b++){
                        if(grid.contains(board[a][b])) return false;
                        if(board[a][b] != '.') grid.add(board[a][b]);

                    }
                }

            }
        }


        return true;
        
    }
}
