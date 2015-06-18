import java.util.ArrayList;

public class Remove_Element {

	/**
	 * Given an array and a value, remove all instances of that value in place
	 * and return the new length.
	 * 
	 * The order of elements can be changed. It doesn't matter what you leave
	 * beyond the new length.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1};
		System.out.println(A.length);
		System.out.println(removeElement(A,1));
	}
    public static int removeElement(int[] A, int elem) {
    	int count=0;
    	int temp;
    	for(int i=0;i<A.length-count;i++){
    		if(A[i]==elem){
    			while(A[A.length-1-count]==elem&&i!=A.length-1-count){
    				count++;
    			}
    			temp=A[i];
    			A[i]=A[A.length-1-count];
    			A[A.length-1-count]=temp;
    			count++;
    		}
    		
    	}
    	return A.length-count;
    }

}
