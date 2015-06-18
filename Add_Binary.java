import java.util.Stack;

public class Add_Binary {

	/**
	 * Given two binary strings, return their sum (also a binary string).
	 * 
	 * For example, 
	 * a = "11"
	 *  b = "1"
	 *   Return "100".
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="1111";
		String b="1000";
		System.out.println(addBinary(a,b));

	}
    public static String addBinary(String a, String b) {
        String result="";
        int a_len=a.length();
        int b_len=b.length();
        int max_len=a_len>b_len?a_len:b_len;
        int carry=0;
        // the final length of the result depends on the bigger length between a and b, 
        // (also the value of carry, if carry = 1, add "1" at the head of result, otherwise)
        for(int i=0;i<max_len;i++){
        	// start from last char of a and b
            // notice that left side is int and right side is char
            // so we need to  minus the decimal value of '0'
        	int a_cal=i<a_len?a.charAt(a_len-i-1)-'0':0;
        	int b_cal=i<b_len?b.charAt(b_len-i-1)-'0':0;
        	int bit=a_cal+b_cal+carry;
        	carry=bit/2;
        	bit=bit%2;
        	result=bit+result;
        }
        return (carry==1)?carry+result:result;
    }
}
