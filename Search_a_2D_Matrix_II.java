
public class Search_a_2D_Matrix_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
		                  {1,   4,  7, 11, 15},
		                  {2,   5,  8, 12, 19},
		                  {3,   6,  9, 16, 22},
		                  {10, 13, 14, 17, 24},
		                  {18, 21, 23, 26, 30}
						};
		//int[][] matrix = {{-1},{-1}};
		System.out.println(new Search_a_2D_Matrix_II().searchMatrix(matrix, 4));
	}
	
	public boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
    	if(rows == 0){
    		return false;
    	}
    	int cols = matrix[0].length;
    	
    	int row = rows-1;
    	int col = 0;
    	while(row >=0 && col < cols){
    		if(matrix[row][col] == target){
    			return true;
    		}
    		else{
    			if(matrix[row][col] < target){
    				col++;
    			}
    			else{
    				row--;
    			}
    		}
    	}
    	return false;
	}
	
	//boolean helper(int[][] matrix, int )
	//method 1, time limit exceeded
/*    public boolean searchMatrix(int[][] matrix, int target) {
    	int rows = matrix.length;
    	if(rows == 0){
    		return false;
    	}
    	int cols = matrix[0].length;
    	return helper(matrix, target, 0, 0, rows, cols);
    	
    }
    
    boolean helper(int[][] matrix, int target, int row, int col, int rows, int cols){
    	if(matrix[row][col] > target){
    		return false;
    	}
    	if(matrix[row][col] == target){
    		return true;
    	}
    	else{
    		if(row + 1 < rows){
    			if(helper(matrix, target, row+1, col, rows, cols)){
    				return true;
    			}
    		}
    		if(col + 1 < cols){
    			if(helper(matrix, target, row, col+1, rows, cols)){
    				return true;
    			}
    		}
    	}
    	return false;
    }*/
}
