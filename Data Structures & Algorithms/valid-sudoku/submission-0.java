class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9; i++){
        Set<Character> values = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(values.contains(board[i][j]) && Character.isDigit(board[i][j])){
                    return false;
                }
                values.add(board[i][j]);
            }
        }

        for(int j = 0; j < 9; j++){
        Set<Character> values = new HashSet<>();
            for(int i = 0; i < 9; i++){
                if(values.contains(board[i][j]) && Character.isDigit(board[i][j])){
                    return false;
                }
                values.add(board[i][j]);
            }
        }

        for(int x = 0; x < 9; x = x+3){
            for(int y = 0; y < 9; y = y+3){
                Set<Character> values = new HashSet<>();
                for(int i = x; i < x+3; i++){
                    for(int j = y; j < y+3; j++){
                        if(values.contains(board[i][j]) && Character.isDigit(board[i][j])){
                        return false;
                    }
                    values.add(board[i][j]);
                    }
                }
            }
        }

        return true;

    }
}
