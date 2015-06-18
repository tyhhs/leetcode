import java.util.ArrayList;
import java.util.List;


public class Palindrome_Partitioning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aab";
		partition(s);
	}
    public static List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<List<String>>();
        List<String> item=new ArrayList<String>();
        helper(list,item, s);
        return list;
    }
    public static void helper(List<List<String>> list,List<String> item, String s){
    	if(s.length()==0){
    		List<String> add=new ArrayList<String>();
    		add.addAll(item);
    		list.add(add);
    	}
    	for(int i=0;i<s.length();i++){ 
    		String subLeftString=s.substring(0, i+1);
    		if(isPalindrome(subLeftString)){
    			item.add(subLeftString);
    			String subRightString=s.substring(i+1,s.length());
    			helper(list, item, subRightString);
    			item.remove(item.size()-1);
    		}
    	}
    }
    public static boolean isPalindrome(String s){
    	int len = s.length();
    	int i=0;
    	int j=len-1;
    	while(i<j){
    		if(s.charAt(i)==s.charAt(j)){
    			i++;
    			j--;
    		}
    		else{
    			return false;
    		}
    	}
    	return true;
    }
}
