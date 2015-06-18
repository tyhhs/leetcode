public class Palindrome_Number {

	/**
	 * Determine whether an integer is a palindrome. Do this without extra
	 * space. Some hints: Could negative integers be palindromes? (ie, -1)
	 * 
	 * If you are thinking of converting the integer to string, note the
	 * restriction of using extra space.
	 * 
	 * You could also try reversing an integer. However, if you have solved the
	 * problem "Reverse Integer", you know that the reversed integer might
	 * overflow. How would you handle such case?
	 * 
	 * There is a more generic way of solving this problem.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(12321));
	}
    public static boolean isPalindrome(int x) {
    	if(x<0){
    		return false;
    	}
        int reverse=reverse(x);
        if(reverse==x){
        	return true;
        }
        else
        	return false;
    }
    public static int reverse(int x) {
       int digits=(int)(Math.log10(x));
       int result=0;
       int remainder=0;
       for(int i=digits;i>0;i--){
    	   remainder=x%10;
    	   result+=remainder*(int)Math.pow(10, i);
    	   x=x/10;
       }
       result+=x;
       return result;
    }

}
