

public class Single_Number_2 {

	/**
	 * Given an array of integers, every element appears three times except for
	 * one. Find that single one.
	 * 
	 * Note: Your algorithm should have a linear runtime complexity. Could you
	 * implement it without using extra memory?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,1,1,3,3,3,6,6,6,5,5,5,8};
		System.out.println(singleNumber(A));
	}
/*    public static int singleNumber(int[] A) {
        int count=0;
        int result=0;
        for(int i=0;i<32;i++){
        	for(int j=0;j<A.length;j++){
        		if(((A[j]>>i)&1)==1){
        			count++;
        		}
        	}
        	result|=((count%3)<<i);
        	count=0;
        }
        return result;
    }*/
	public static int singleNumber(int[] A) {
	    int ones = 0, twos = 0, threes = 0;
	    for (int i = 0; i < A.length; i++) {
	        twos |= ones & A[i];
	        ones ^= A[i];
	        threes = ones & twos;
	        ones &= ~threes;
	        twos &= ~threes;
	    }
	    return ones;
	}
}
