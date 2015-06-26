import java.util.HashSet;


public class Valid_Sudoku {

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
		System.out.println(isValidSudoku(board));
	}
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
        	HashSet<Character> row=new HashSet<Character>();
        	HashSet<Character> column=new HashSet<Character>();
        	HashSet<Character> subBoard=new HashSet<Character>();
        	for(int j=0;j<board[0].length;j++){
        		int subRow=3*(i/3)+j/3;
        		int subCol=3*(i%3)+j%3;
        		//System.out.println(i+""+j+"->"+subRow+""+subCol);
    			if((board[i][j]!='.'&&!row.add(board[i][j]))||(board[j][i]!='.'&&!column.add(board[j][i]))
    					||(board[subRow][subCol]!='.'&&!subBoard.add(board[subRow][subCol]))){
        			return false;
    			}
        	}
        }
        return true;
    }
}
