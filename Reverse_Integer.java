public class Reverse_Integer {

	/**
	 * Reverse digits of an integer.
	 * 
	 * Example1: x = 123, return 321 
	 * Example2: x = -123, return -321
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=(int)(Math.log10(1234));
		System.out.println(reverse(-1000));
	}
    public static int reverse(int x) {
    	int flag=0;
    	if(x<0){
    		x=-x;
    		flag=1;
    	}
        int digital=(int)(Math.log10(x));
        int remainder=0;
        int result=0;
        for(int i=digital;i>=0;i--){
        	remainder=x%10;
        	result=result+remainder*(int)Math.pow(10, i);
        	x=x/10;
        }
        if(flag==1)
        	result=-result;
    	return result;
    }
}
