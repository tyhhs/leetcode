import java.util.zip.Inflater;


public class Factorial_Trailing_Zeroes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(factorial(19));
		System.out.println(trailingZeroes(25));
	}
    public static int trailingZeroes(int n) {
    	return n==0?0:n/5+trailingZeroes(n/5);
    }
    
    public static long factorial(int n){
    	if(n==1){
    		return 1;
    	}
    	else{
    		return n*factorial(n-1);
    	}
    }
}
