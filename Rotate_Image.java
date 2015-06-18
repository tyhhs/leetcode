public class Rotate_Image {

	/**
	 * You are given an n x n 2D matrix representing an image.
	 * 
	 * Rotate the image by 90 degrees (clockwise).
	 * 
	 * Follow up: Could you do this in-place?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] A={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int [][] A={{1,2},{3,4}};
		rotate(A);
		int n=A.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(A[i][j]);
			}
			System.out.println();
		}
	}
    public static void rotate(int[][] matrix) {
    	int n=matrix.length;
    	int temp;
        for(int x=0;x<=(n-1)/2;x++){
        	for(int y=x;y<n-x-1;y++){
        		temp=move(matrix,x,y,n,matrix[x][y]);
        		temp=move(matrix,y,n-x-1,n,temp);
        		temp=move(matrix,n-x-1,n-y-1,n,temp);
        		temp=move(matrix,n-y-1,x,n,temp);
        	}
        }
    }
    public static int move(int[][] matrix,int x,int y,int n,int value){
    	int temp=matrix[y][n-x-1];
    	matrix[y][n-x-1]=value;
    	return temp;
    }
}
