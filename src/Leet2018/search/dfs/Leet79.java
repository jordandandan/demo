package Leet2018.search.dfs;

/**
 * @author bjxujiayi
 * @create 2018-10-31 13:53
 **/
public class Leet79 {
    public boolean exist(char[][] board, String word) {
        if(word == null || word.length() == 0)
            return true;
        int index = 0;
        for(int i = 0; i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board, index, i, j, word)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int index, int i, int j, String word) {
        if(index == word.length())
            return true;
        if(i<0||i>board.length-1||j<0||j>board[0].length-1)
            return false;
        if(board[i][j]!=word.charAt(index)){
            return false;
        }
        board[i][j] ^= 256;
        boolean exist = false;
        exist= dfs(board,index + 1, i + 1,j, word) ||
                dfs(board,index + 1, i - 1,j, word) ||
                dfs(board,index + 1, i ,j + 1, word) ||
                dfs(board,index + 1, i,j - 1, word);
        board[i][j] ^= 256;
        return exist;
    }
}
