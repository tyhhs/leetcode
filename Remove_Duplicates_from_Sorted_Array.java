public class Remove_Duplicates_from_Sorted_Array {

	/**
	 * Given a sorted array, remove the duplicates in place such that each
	 * element appear only once and return the new length.
	 * 
	 * Do not allocate extra space for another array, you must do this in place
	 * with constant memory.
	 * 
	 * For example, Given input array A = [1,1,2],
	 * 
	 * Your function should return length = 2, and A is now [1,2].
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(A));
	}
	//first version
/*    public static int removeDuplicates(int[] A) {
    	if(A.length==0){
    		return 0;
    	}
    	else{
        int index=0;
        int temp;
    	for(int i=1;i<A.length;i++){
        	if(A[i]>A[index]){
        		temp=A[index+1];
        		A[index+1]=A[i];
        		A[i]=temp;
        		index++;
        	}
        }
    	for(int i=0;i<A.length;i++){
    		System.out.println(A[i]);
    	}
    	return index+1;
    	}
    }*/
	
	//second version
	public static int removeDuplicates(int[] A) {
	  if(A.length==0) return 0;

        int i=0, j=0;
        while(j < A.length)  {
            if(A[j] == A[i]) j++;
            else             A[++i] = A[j++];
        }
    	for(int k=0;k<A.length;k++){
    		System.out.println(A[k]);
    	}
        return i+1;
	}

}
