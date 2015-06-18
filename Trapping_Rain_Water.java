
public class Trapping_Rain_Water {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(4^4^5^5^6);
	}
    public static int trap(int[] A) {
    	int l=0;
    	int r=A.length-1;
    	int res=0;
    	//find the two side
    	while(l<r&&A[l]<=A[l+1]) l++;
    	while(l<r&&A[r]<=A[r-1]) r--;
    	
    	while(l<r){
    		int left=A[l];
    		int right=A[r];
    		if(left<=right){
    			//add volume left to right until an edge larger than the left
    			l++;
    			while(left>A[l]){
    				res=res+(left-A[l]);
    				l++;
    			}
    			left=A[l];
    		}
    		else{
    			//add volume right to left until an edge larger than the right
    			r--;
    			while(right>A[r]){
    				res=res+(right-A[r]);
    				r--;
    			}
    			right=A[r];
    		}
    	}
    	return res;
    }
}
