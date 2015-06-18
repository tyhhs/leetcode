
public class Set_Matrix_Zeroes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] matrix={{1,2,3,4},{1,2,3,4},{1,2,0,4},{1,2,3,4},{1,2,3,4}};
		int[][] matrix={{-4,-2147483648,6,-7,0},{-8,6,-8,-6,0},{2147483647,2,-9,-6,-10}};
		setZeroes(matrix);
		int rows=matrix.length;
        int columns=matrix[0].length;
        for(int i=0;i<rows;i++){
        	for(int j=0;j<columns;j++){
        		System.out.print(matrix[i][j]);
        	}
        	System.out.println();
        }
        	
	}
	
    public static void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int column0=1;
        for(int i=0;i<rows;i++){
        	if(matrix[i][0]==0){
        		column0=0;
        	}
        	for(int j=1;j<columns;j++){
        		
        		if(matrix[i][j]==0){
        			matrix[0][j]=0;
        			matrix[i][0]=0;
        		}
        	}
        }
        for(int i=rows-1;i>=0;i--){
        	for(int j=columns-1;j>0;j--){
        		if(matrix[i][0]==0||matrix[0][j]==0){
        			matrix[i][j]=0;
        		}
        	}
        	if(column0==0){
        		matrix[i][0]=0;
        	}
        }
    }
}
