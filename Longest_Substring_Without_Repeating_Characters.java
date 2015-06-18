public class Longest_Substring_Without_Repeating_Characters {

	/**
	 * Given a string, find the length of the longest substring without
	 * repeating characters. For example, the longest substring without
	 * repeating letters for "abcabcdbb" is "abc", which the length is 3. For
	 * "bbbbb" the longest substring is "b", with the length of 1.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcbbcdefg";
		System.out.println(lengthOfLongestSubstring(s));
	}

/*the variable 'begin' keeps the index of the beginning of the subarray
 * array index[ch] keep the index of this ch last time appeared
 * max is the length of the longest subarray without repeating 
 * 
 * 
 * */

	public static int lengthOfLongestSubstring(String s) {
		int index[]=new int[256];
		int begin=0;
		int max=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(index[ch]>begin){
				begin=index[ch];
			}
			max=Math.max(max, i-begin+1);
			index[ch]=i+1;
			System.out.println(index[ch]);
		}
		return max;
	}


}
