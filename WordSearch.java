class Solution {
    public boolean exist(char[][] board, String word) {
        for(int r=0;r<board.length;r++){
             for(int c=0;c<board[0].length;c++){
                if(word.charAt(0)==board[r][c]){
                    boolean found=dfs(board,word,r,c,0);
                    if(found) return true;
                }
             }
        }
        return false;
    }
    public static boolean dfs(char[][]board,String word,int r,int c,int wordindex){
        if(wordindex==word.length()) return true;
        if(r<0||r>=board.length||c<0||c>=board[0].length) return false;
        if(board[r][c]==' '||board[r][c]!=word.charAt(wordindex)) return false;
        char ch=board[r][c];
        board[r][c]=' ';
        if(dfs(board,word,r-1,c,wordindex+1)||
        dfs(board,word,r,c-1,wordindex+1)||
        dfs(board,word,r+1,c,wordindex+1)||
        dfs(board,word,r,c+1,wordindex+1)){
            return true;
        }
        board[r][c]=ch;
        return false;
    }
}
