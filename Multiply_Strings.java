
public class Multiply_Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Multiply_Strings().multiply("123456789", "987654321"));
	}
/*	//naive method, data will flood under a long input string
    public String multiply(String num1, String num2) {
    	long number1=Long.parseLong(num1);
    	long number2=Long.parseLong(num2);
    	long result=number1*number2;
    	return Long.toString(result);
    }*/
	
	//simulate the multiply process digit by digit, notice the carry
	public String multiply(String num1,String num2){
		int length1=num1.length();
		int length2=num2.length();
		if(length1==1||length2==1){
			if(num1.equals("0")||num2.equals("0")){
				return "0";
			}
		}
		int[] resArray=new int[length1+length2];
		for(int i=length1-1;i>=0;i--){
			for(int j=length2-1;j>=0;j--){
				int carry=0;
				int multiplyDigit=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				resArray[i+j+1]+=multiplyDigit;
				resArray[i+j]+=resArray[i+j+1]/10;
				resArray[i+j+1]=resArray[i+j+1]%10;
			}
		}
		
		StringBuilder sb=new StringBuilder();
		int endIndex=resArray[0]==0?1:0;
		for(int i=length1+length2-1;i>=endIndex;i--){
			sb.append(resArray[i]);
		}
		sb.reverse();
		return sb.toString();
	}
}
