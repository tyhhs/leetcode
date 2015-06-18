
public class Longest_Common_Prefix {

	/**
	 * Write a function to find the longest common prefix string amongst an array of strings.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] strs={"aaaa","aaa","aaa","aaa"};
		String[] strs={"a"};
		//System.out.println(strs[0].length());
		System.out.println();
		System.out.println(longestCommonPrefix(strs));
	}
	
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        int n=0;
        char compare;
        int short_index=0;
        for(int i=1;i<strs.length;i++){
        	short_index=strs[short_index].length()>strs[i].length()?i:short_index;
        }
        if(strs[short_index].length()==0){
        	return "";
        }
        while(true){
        	
        	compare=strs[short_index].charAt(n);
	        for(int i=0;i<strs.length;i++){
	        	if(strs[i].charAt(n)!=compare){
	        		return strs[i].substring(0, n);
	        	}
	        }
	        n++;
	        if(n==strs[short_index].length())
	        	break;
        }
        return strs[short_index];
    }
}
