
public class Jump_Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,0,2};
		System.out.println(canJump(A));
	}
	
    public static boolean canJump(int[] A) {
        int len=A.length;
    	if(len==0){
    		return false;
    	}
    	int current=0;
    	while(current<len-1){
    		if((current+A[current])>=len-1){
    			return true;
    		}
    		else if(A[current]==0){
    			return false;
    		}
    		int max=current+A[current];//max represents the farthest point we can get from current point 
    		int next=current;
    		for(int i=current+1;i<=current+A[current];i++){
    			if(max<=i+A[i]){//find the next start point 'next', 1:it can be reached by current point 2:it can reach the farthest point 
    				max=i+A[i];
    				next=i;
    			}
    			
    		}
    		
    		current=next;
    	}
    	return true;
    }
}
