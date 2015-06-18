import java.util.Arrays;


public class Scramble_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="rgtae";
		String s2="great";
		System.out.println(new Scramble_String().isScramble(s1, s2));
	}
	
	public boolean isScramble(String s1, String s2) {
		if(s1==null||s2==null||s1.length()!=s2.length()){
			return false;
		}
		if(s1.equals(s2)){
			return true;
		}
		if(!isAnagram(s1, s2)){
			return false;
		}
		for(int i=1;i<s1.length();i++){
			if(isScramble(s1.substring(0,i), s2.substring(0,i))&&isScramble(s1.substring(i), s2.substring(i))){
				return true;
			}
			if(isScramble(s1.substring(0, i), s2.substring(s2.length()-i))&&isScramble(s1.substring(i), s2.substring(0, s2.length()-i))){
				return true;
			}
		}
		return false;
	}
	
	public boolean isAnagram(String s1,String s2){
		char[] char1=s1.toCharArray();
		char[] char2=s2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		if(Arrays.equals(char1, char2)){
			return true;
		}
		else {
			return false;
		}
	}

/*    public boolean isScramble(String s1, String s2) {
        if(s1==null || s2==null || s1.length()!=s2.length()) return false;
        if(s1.equals(s2)) return true;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(!Arrays.equals(c1, c2)) return false;
        for(int i=1; i<s1.length(); i++)
        {
            if(isScramble(s1.substring(0,i), s2.substring(0,i)) && isScramble(s1.substring(i), s2.substring(i))) return true;
            if(isScramble(s1.substring(0,i), s2.substring(s2.length()-i)) && isScramble(s1.substring(i), s2.substring(0, s2.length()-i))) return true;
        }
        return false;
    }*/
}
