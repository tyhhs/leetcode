
public class Sudoku_Solver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board={{'5','3','.','.','7','.','.','.','.'},
						{'6','.','.','1','9','5','.','.','.'},
						{'.','9','8','.','.','.','.','6','.'},
						{'8','.','.','.','6','.','.','.','3'},
						{'4','.','.','8','.','3','.','.','1'},
						{'7','.','.','.','2','.','.','.','6'},
						{'.','6','.','.','.','.','2','8','.'},
						{'.','.','.','4','1','9','.','.','5'},
						{'.','.','.','.','8','.','.','7','9'}};
		new Sudoku_Solver().solveSudoku(board);
		for(char[] i:board){
			for(char j:i){
				System.out.print(j);
			}
			System.out.println();
		}
	}
		
    public void solveSudoku(char[][] board) {
        if(board==null||board.length!=9||board[0].length!=9){
        	return;
        }
    	helper(board, 0, 0);
    }
    
    public boolean helper(char[][] board, int row, int col){
    	//end of a row
    	if(col>=9){
    		return helper(board, row+1, 0);
    	}
    	//have scan all the board
    	if(row==9){
    		return true;
    	}
    	
    	//'.' represents this grid needs input a number
    	if(board[row][col]=='.'){
        	for(int i=1;i<10;i++){
        		board[row][col]=(char)(i+'0');
        		if(isValid(board, row, col)){
        			if(helper(board, row, col+1)){        				
        				return true;
        			}
        		}
        		board[row][col]='.';
        	}
    	}
    	//this grid is occupied
    	else{
    		return helper(board, row, col+1);
    	}
    	return false;
    }
    
    public boolean isValid(char[][] board, int row, int col){
    	//judge is the row valid
    	for(int i = 0; i<9;i++){
    		if(board[row][i]==board[row][col]&&i!=col){
    			return false;
    		}
    	}
    	
    	//judge is the column valid
    	for(int i=0;i<9;i++){
    		if(board[i][col]==board[row][col]&&i!=row){
    			return false;
    		}
    	}
    	
    	//check subboard
    	int subRowStart=(row/3)*3;
    	int subColStart=(col/3)*3;
    	for(int i=subRowStart;i<subRowStart+3;i++){
    		for(int j=subColStart;j<subColStart+3;j++){
    			if(board[i][j]==board[row][col]&&i!=row&&j!=col){
    				return false;
    			}
    		}
    	}
    	
    	//all checks pass
    	return true;
    }
}
