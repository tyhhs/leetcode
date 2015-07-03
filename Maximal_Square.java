
public class Maximal_Square {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		char[][] matrix={
				{'1','0','1','0','0'},
				{'1','0','1','1','1'},
				{'1','1','1','1','1'},
				{'1','0','0','1','0'}
		};*/
		char[][] matrix={{'1'}};
		System.out.println(new Maximal_Square().maximalSquare(matrix));
	}
	
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0){
        	return 0;
        }
        int max=0;
        int row=matrix.length;
        int col=matrix[0].length;
        //a integer matrix to keep number that represents the length of square when the point as
        //the lower right corner of a square
        int[][] length=new int[row][col];
        //the topmost row and the leftmost column, length[i][j]=matrix[i][j];
        //topmost
        for(int i=0;i<col;i++){
        	if(matrix[0][i]=='1'){
        		length[0][i]=1;
        		max=1;
        	}
        	else{
        		length[0][i]=0;
        	}
        }
        //leftmost
        for(int i=0;i<row;i++){
        	if(matrix[i][0]=='1'){
        		length[i][0]=1;
        	}
        	else{
        		length[i][0]=0;
        	}
        }
        
        //DP formula length[i][j]=Math.min(length[i-1][j-1], Math.min(length[i-1][j], length[i][j-1]))+1;
        for(int j=1;j<col;j++){
        	for(int i=1;i<row;i++){
        		if(matrix[i][j]=='1'){
        			length[i][j]=Math.min(length[i-1][j-1], Math.min(length[i-1][j], length[i][j-1]))+1;
        			max=Math.max(max, length[i][j]);
        		}
        	}
        }
        
        //maximum square is max^2
        return max*max;
    }
}
