import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Minimum_Window_Substring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC";
		String t = "ABC";
/*		String s = "a";
		String t = "a";*/
		System.out.println(new Minimum_Window_Substring().minWindow(s, t));
	}
	
	public String minWindow(String s, String t) {
		if(s.length()==0||t.length()==0||s.length()<t.length()){
			return "";
		}
		int[] sMap = new int[256];
		int[] tMap = new int[256];
		String res = "";
		int length = Integer.MAX_VALUE;
		int found = 0;
		//store characters in t String into a Map, index represents character, value means number of 
		for(Character c : t.toCharArray()){
			tMap[c]++;
		}
		int start=0, end = 0;
		while(end < s.length()){
			if(found<t.length()){//found a minimum window from start
				if(tMap[s.charAt(end)]!=0){
					sMap[s.charAt(end)]++;
					if(sMap[s.charAt(end)]<=tMap[s.charAt(end)]){
						found++;						
					}
				}
				end++;
			}
			while(found==t.length()){
				if(end-start<length){
					length = end - start;
					res = s.substring(start,end);
				}
				if(tMap[s.charAt(start)]>0){
					sMap[s.charAt(start)]--;
					if(sMap[s.charAt(start)]<tMap[s.charAt(start)]){
						found--;
					}
				}
				start++;
			}
		}
		return res;
		
	}
	
/*	public String minWindow(String s, String t) {
		Map<Character, Integer> matched = new HashMap<Character, Integer>();
		Set<Character> set = new HashSet<Character>();
        for(Character character : t.toCharArray()){
        	set.add(character);
        }
        String res = "";
        int length = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        for(int i = 0; i <= s.length()-t.length(); i++){
        	if(matched.size()==0){//find start
        		if(set.contains(s.charAt(i))){
        			matched.put(s.charAt(i),i);
        			start = i;
        			end = i+1;
        		}else{
        			continue;
        		}        		
        	}
        	if(matched.size()==t.length()-1&&!set.contains(s.charAt(i))){//move the start to next start
        		continue;
        	}
        	else if(matched.size()==t.length()-1&&set.contains(s.charAt(i))){
        		start = i;
        		end = i+1;
        	}
        	while(matched.size()!=t.length()&&end<s.length()){ 
        		if(set.contains(s.charAt(end))){
        			matched.put(s.charAt(end), end);
        		}
        		end++;
        	}
        	if(matched.size()==t.length()){
        		if(end-start<length){
        			length=end-start;
        			res= s.substring(start,end);
        		}
        		matched.remove(s.charAt(start));
        	}
        	else if(matched.size()!=t.length()&&end==s.length()){
        		break;
        	}
        }
        return res;
	}*/
	//time limit exceeded
	//two pointers, for each index i< s.length, found minimum window [i,j] contains
	//all characters in T if existed 
/*    public String minWindow(String s, String t) {
        int[] range = {0,s.length()};
        char[] arrayS = s.toCharArray();
        Set<Character> set = new HashSet<Character>();
        for(Character character : t.toCharArray()){
        	set.add(character);
        }
        Set<Character> match = new HashSet<Character>();
        int startIndex;
        int endIndex;
        for(int i=0; i <= s.length()-t.length();i++){
        	startIndex = endIndex = i;
        	while(match.size()!=t.length()&&endIndex< s.length()){
        		if(set.contains(s.charAt(endIndex))){
        			match.add(s.charAt(endIndex));
        		}
        		endIndex++;
        	}	
        	if(match.size()==t.length()){
        		if(endIndex-startIndex-1<range[1]-range[0]){
        			range[0]=startIndex;
        			range[1]=endIndex-1;
        		}
        	}
        	match.removeAll(match);
        }
        if(range[1]!=s.length()){
        	return s.substring(range[0],range[1]+1);
        			
        }
        else{
        	return null;
        }
    }*/

}
