import java.util.ArrayList;
import java.util.List;


public class Letter_Combinations_of_a_Phone_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits="234";
		List<String> list=letterCombinations(digits);
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
    public static List<String> letterCombinations(String digits) {
        List<String> combinations=new ArrayList<String>();
        if(digits.length()==0){
        	return combinations;
        }
        String[] phone={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder insert=new StringBuilder();
        helper(combinations, phone, digits, insert);
        return combinations;
    }
    public static void helper(List<String> combinations, String[] phone, String digits, StringBuilder insert){
    	if(digits.length()!=0){
    		char digit=digits.charAt(0);
    		String charsOfNumber=phone[digit-'2'];
    		for(int i=0;i<charsOfNumber.length();i++){
    			insert.append(charsOfNumber.charAt(i));
    			String subDigits=digits.substring(1, digits.length());
    			helper(combinations, phone, subDigits, insert);
    			insert.deleteCharAt(insert.length()-1);
    		}
    	}
    	else{
    		String oneCombination=insert.toString();
    		combinations.add(oneCombination);
    	}    	
    }

}
