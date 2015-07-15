
public class Interleaving_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 = "aadbbbaccc";
		System.out.println(new Interleaving_String().isInterleave(s1, s2, s3));
	}
	
    public boolean isInterleave(String s1, String s2, String s3) {
    	int size1 = s1.length();
    	int size2 = s2.length();
    	int size3 = s3.length();
    	
    	if(size1+size2!=size3){
    		return false;
    	}
    	//initialize the matrix
    	boolean[][] matrix = new boolean[size1+1][size2+1];
    	matrix[0][0] = true;
    	for(int i = 0; i < size1; i++){
    		if(s1.charAt(i) == s3.charAt(i)){
    			matrix[i+1][0] = true;
    		}
    		else{
    			break;
    		}
    	}
    	
    	for(int i = 0; i < size2; i++){
    		if(s2.charAt(i)==s3.charAt(i)){
    			matrix[0][i+1] = true;
    		}
    		else{
    			break;
    		}
    	}
    	
    	//DP
    	for(int i= 1; i <= size1; i++){
    		for(int j = 1; j <= size2; j++){
    			int k = i + j - 1;
    			if(s1.charAt(i-1) == s3.charAt(k)){
    				matrix[i][j] = matrix[i][j] || matrix[i-1][j];
    			}
    			if(s2.charAt(j-1) == s3.charAt(k)){
    				matrix[i][j] = matrix[i][j] || matrix[i][j-1];
    			}
    		}
    	}
    	
    	return matrix[size1][size2];
    }

}
