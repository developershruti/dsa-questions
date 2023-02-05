package backtracking;

public class N_Queen {
    static int getcount(boolean[][] board , int currentrow ){
        int count = 0;
       if(currentrow==board.length){
         return 1;
       }
        for(int col= 0;col<board.length;col++){
            if(issafearea(board, currentrow, col)){
                board[currentrow][col] = true;
                count += getcount(board, currentrow+1);
                 board[currentrow][col] = false;  // this statemets to perform backtracting 
            }
        }
        return count;

    }
     static boolean issafearea(boolean[][] board,int row,int col){
         // check if there is a queen in same column
         for(int i=row;i>=0;i--){
            if(board[i][col]==true){ // board[i][col]==true mean agar upper kisi column me queen hai  tho return false krdo
                return false;
            }
         }
         // check  if there is a queen in upper left diagonal
         for(int i=row,j=col;i>=0 && j>=0; i--,j--){
            if(board[i][j]==true){   //board[i][j]==true mean agar upar kisi diagonal col row me queen hai tho return false krdo
                return false;
            }
         }
         // check if there is a queen in upper right diagnol
         for(int i=row,j=col;i>=0 && j<board.length;i--,j++){
            if(board[i][j]==true){
                return false;
            }
         }
         return true;

     }
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        int count = getcount(board, 0);
        System.out.println(" total ways = " + count);
    }
}
