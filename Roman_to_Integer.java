import java.util.HashMap;
import java.util.Map;


public class Roman_to_Integer {

	/**
	 * Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MCMLXXXIV";
		System.out.println(romanToInt(s));
	}
	 public static int romanToInt(String s) {
		 Map<String, String> charMap=new HashMap<String, String>();
		 charMap.put("M","1000");
		 charMap.put("D","500");
		 charMap.put("C","100");
		 charMap.put("L","50");
		 charMap.put("X","10");
		 charMap.put("V","5");
		 charMap.put("I","1");
		 int length=s.length();
		 int current=0;
		 int previous=0;
		 int result=0;
		 for(int i=length-1;i>=0;i--){
			 current=Integer.parseInt(charMap.get(String.valueOf(s.charAt(i))));
			 if(current>=previous){
				 result+=current;
			 }
			 else{
				 result-=current;
			 }
			 previous=current;
		 }
		 return result;
		 
	 }
}
