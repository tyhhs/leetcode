	/**
	 * Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

XOR ^;
e.g:5^5=0
4^4=0;
0^6=6;
	 */
public class single_number {

	/**
	 * @param
	 */
    public static int singleNumber(int[] A) {
        //System.out.println(A.length);
    	int result=0;
    	for(int i=0;i<A.length;i++){
    		result=result^A[i];
    	}
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5,4,3,2,1};
		System.out.println(singleNumber(a)); 	
	}


}
