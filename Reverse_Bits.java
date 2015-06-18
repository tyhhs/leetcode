
public class Reverse_Bits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseBits(1));
	}
    public static int reverseBits(int n) {
		int b = 0; 
		int cnt = 0; 
		while (cnt < 32) {
			b = (b << 1) | (n & 1);
			n = n >> 1; 
			cnt++; 
		} 
		return b; 
    }
}
