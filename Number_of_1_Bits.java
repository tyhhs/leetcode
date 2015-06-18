
public class Number_of_1_Bits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(15));
	}

    public static int hammingWeight(int n) {
    	int count=0;
    	for(long i=31;i>=0;i--){
    		if(((n>>i)&1)>0){
    			count++;
    		}
    	}
    	return count;
    }
}
