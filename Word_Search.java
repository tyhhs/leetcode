
public class Word_Search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board={
			{'A','B','C','E'},
			{'S','F','C','S'},
			{'A','D','E','E'}
		};
		System.out.println(new Word_Search().exist(board, "ABCESEEDS"));
	}
	
    public boolean exist(char[][] board, String word) {
        if(word.length()==0||board.length==0){
        	return false;
        }
        int row=board.length;
        int col=board[0].length;
        char[] array=word.toCharArray();
        for(int i = 0; i<row; i++){
        	for (int j = 0; j<col; j++){
        		//search start point
        		if(board[i][j]==array[0]){
        			board[i][j]='*';
        			if(search(board, array, 1, i, j)){
        				return true;
        			}
        			else{
        				board[i][j]=array[0];
        			}
        		}
        	}
        }
        return false;
    }
    
    boolean search(char[][] board, char[] array, int index, int row, int col){
    	if(index==array.length){
    		return true;
    	}
    	//up
    	if(row>0){
    		if(board[row-1][col]==array[index]){
    			board[row-1][col]='*';
    			if(search(board, array, index+1, row-1, col)){
    				return true;
    			}
    			board[row-1][col]=array[index];
    		}
    	}
    	//down
    	if(row<board.length-1){
    		if(board[row+1][col]==array[index]){
    			board[row+1][col]='*';
    			if(search(board, array, index+1, row+1, col)){
    				return true;
    			}
    			board[row+1][col]=array[index];
    		}
    	}
    	//left
    	if(col>0){
    		if(board[row][col-1]==array[index]){
    			board[row][col-1]='*';
    			if(search(board, array, index+1, row, col-1)){
    				return true;
    			}
    			board[row][col-1]=array[index];
    		}
    	}
    	//right
    	if(col<board[0].length-1){
    		if(board[row][col+1]==array[index]){
    			board[row][col+1]='*';
    			if(search(board, array, index+1, row, col+1)){
    				return true;
    			}
    			board[row][col+1]=array[index];
    		}
    	}
    	return false;    	
    }

}
