public class soduko {
    public static void main(String[] args) {
        char[][] board = {{'.','.','2','.','.','9','.','1','4'}
                         ,{'.','.','.','8','2','.','.','.','.'}
                         ,{'3','.','4','.','.','.','.','.','2'}
                         ,{'.','.','.','5','.','.','9','.','.'}
                         ,{'.','7','.','8','.','.','.','5','.'}
                         ,{'.','.','3','.','.','6','.','.','.'}
                         ,{'1','.','.','.','.','.','7',',','9'}
                         ,{'.','.','.','.','1','7','.','.','.'}
                         ,{'5','8','.','4','.','.','1','.','.'}};
       System.out.println(solve(board));
       for (int i = 0; i < board.length; i++) {
           for (int j = 0; j < board[0].length; j++) {
               System.out.print(board[i][j] + " ");
           }
           System.out.println();
       }

    }
    
//     public static boolean isValidSudoku(char[][] board)
//     {
        
//         for(int i=0; i<board.length; i++)
//         {
//            for(int j=0; j<board[0].length; j++)
//            {
               
//                if(board[i][j]!='.')
//                {
//                      if(isValid(board,board[i][j],i,j)==false)
//                      {
//                          return false;
//                      }
//                }
                  
//            }
//         }
//         return true;
//     }
    
// public static boolean isValid(char[][] board, char c, int row, int col){
//         int count = 0;
//         for(int i = 0; i < board.length; i++){
//             if(board[i][col] == c)
//                 count++;

//             if(board[row][i] == c)
//                 count++;

//             if(board[3 * (row/3) + i/3][3*(col/3) + i%3] == c)
//                 count++;
//         }
        
//         return (count == 3) ? true : false;
//     }
    public static boolean solve(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    
                    for(char c = '1'; c <= '9'; c++){
                        
                        if(isValid(board, i, j, c)){
                            //if it is valid than put the c there
                            board[i][j] = c;
                            
                            //after putting call recursion
                            if(solve(board)){
                            //if we solve the board than return true;
                                return true;
                            }else{
                            //if we not able to solve put back the '.'
                            //backtrack    
                                board[i][j] = '.';
                            }
                        }  
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean isValid(char board[][], int row, int col, char c){
        for(int i = 0; i < 9; i++){
            
            //for checking in the row
            if(board[i][col] == c){
                return false;
            }
            
            //for checking in the col
            if(board[row][i] == c){
                return false;
            }
            
            //for checking in the 3 * 3 box
            if(board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3 ] == c){
                return false;
            }
        }
        return true;
    }
}    
    

   
    


