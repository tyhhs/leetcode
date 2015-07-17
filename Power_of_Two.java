
public class Power_of_Two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1<<0);
	}

	public boolean isPowerOfTwo(int n) {
		for(int i=0;i<31;i++){
			if((1<<i)==n){
				return true;
			}
		}
		return false;
    }
}
