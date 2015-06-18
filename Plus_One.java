public class Plus_One {

	/**
	 * Given a non-negative number represented as an array of digits, plus one
	 * to the number.
	 * 
	 * The digits are stored such that the most significant digit is at the head
	 * of the list.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,0,0};
		int[] b=plusOne(a);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
    public static int[] plusOne(int[] digits) {
    	for(int i=digits.length-1;i>=0;i--){
    		digits[i]+=1;
    		if(digits[i]==10&&i!=0){
    			digits[i]=0;
    		}
    		else
    			break;
    	}
    	if(digits[0]==10){
    		int[] new_digits=new int[digits.length+1];
    		new_digits[0]=1;
    		new_digits[1]=0;
    		for(int i=2;i<new_digits.length;i++){
    			new_digits[i]=digits[i-1];
    		}
    		return new_digits;
    	}
    	return digits;
    }
}
