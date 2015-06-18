
public class N_Queens_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalNQueens(6));
	}

    public static int totalNQueens(int n) {
        int[] coordinate=new int[n];
        int s=0;
        return helper(n, s, 0, coordinate);
    }
    
    public static int helper(int n,int s, int row, int[] coordinate){
    	if(row==n){
    		s++;
    		
    	}
    	else{
    		for(int i=0;i<n;i++){
    			coordinate[row]=i;
    			if(isValid(coordinate, row)){
    				s=helper(n, s, row+1, coordinate);
    			}
    		}
    	}
    	return s;
    }
    
    public static boolean isValid(int[] coordinate, int row){
    	for(int i=0;i<row;i++){
    		if(coordinate[i]==coordinate[row]||Math.abs(coordinate[row]-coordinate[i])==row-i){
    			return false;
    		}
    	}
    	return true;
    }
}
