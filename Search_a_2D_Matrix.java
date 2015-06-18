import javax.sound.midi.MidiChannel;


public class Search_a_2D_Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		int[][] matrix={{1},{3}};
		System.out.println(searchMatrix(matrix, 3));
	}
/*    public static boolean searchMatrix(int[][] matrix, int target) {
        //a m*n matrix, I ideal is: first process binary search on first dimension to find while range the target could in
    	int m=matrix.length;
    	int low=0;
    	int high=m-1;
    	int mid=0;
    	int range=-1;
    	while(low<=high){
    		mid=(low+high)/2;
    		if(matrix[mid][0]==target){
    			return true;
    		}
    		if(matrix[mid][0]>target){
    			if(mid==low){
    				return false;
    			}
    			high=mid-1;
    		}
    		if(matrix[mid][0]<target){
    			if(mid==high){
    				range=mid;
    				break;
    			}
    			if(matrix[mid+1][0]<=target){
    				low=mid+1;
    			}
    			else{
    				range=mid;
    				break;
    			}
    		}
    	}
    	int n=matrix[range].length;
    	low=0;
    	high=n-1;
    	while(low<=high){
    		mid=(low+high)/2;
    		if(matrix[range][mid]==target){
    			return true;
    		}
    		if(matrix[range][mid]>target){
    			
    			high=mid-1;
    		}
    		else{
    			low=mid+1;
    		}
    	}
    	return false;
    	
    }*/
	
	
	//Here is the code that used binary search. The matrix can be viewed as a one-dimensional sorted array. 
	//The value of element i in this array in the matrix is matrix[i/cols][i%cols].
/*	public static boolean searchMatrix(int[][] matrix, int target) {
		//m*n matrix, rows:m, columns:n
		if(matrix==null){
			return false;
		}
		int m=matrix.length;
		int n=matrix[0].length;
		int low=0;
		int high=m*n-1;
		int mid;
		while(low<=high){
			mid=(low+high)/2;
			if(matrix[mid/n][mid%n]==target){
				return true;
			}
			if(matrix[mid/n][mid%n]<target){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return false;
	}*/
	
	//recursive version
	public static boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null){
			return false;
		}
		int m=matrix.length;
		int n=matrix[0].length;
		int low=0;
		int high=m*n-1;
		int mid;
		return recursive_binary(matrix, target, low, high, n);
	}
	public static boolean recursive_binary(int[][] matrix, int target, int low, int high, int n){
		int mid=(low+high)/2;
		if(low>high){
			return false;
		}
		if(matrix[mid/n][mid%n]==target){
			return true;
		}
		if(matrix[mid/n][mid%n]<target){
			return recursive_binary(matrix, target, mid+1, high, n);
		}
		else{
			return recursive_binary(matrix, target, low, mid-1, n);
		}
			
	}
}
