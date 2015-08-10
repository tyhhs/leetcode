import java.util.Arrays;


public class Valid_Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "nagaram";
		System.out.println(new Valid_Anagram().isAnagram(s, t));
	}

    public boolean isAnagram(String s, String t) {
        if(s == null || t ==null || s.length() != t.length()){
        	return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        for(int i = 0; i < s.length(); i++){
        	if(sChars[i] != tChars[i]){
        		return false;
        	}
        }
        return true;
    }
}
