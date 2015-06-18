import java.util.HashSet;
import java.util.Set;


public class Word_Break {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaaaaa";
		Set<String> wordDict=new HashSet<String>();
		wordDict.add("aaaa");
		wordDict.add("aaa");
		System.out.println(new Word_Break().wordBreak(s, wordDict));
	}
	public boolean wordBreak(String s, Set<String> wordDict) {
		if(s.length()==0){
			return true;
		}
		if(wordDict.isEmpty()){
			return false;
		}
		int n = s.length();
		boolean[] breaker=new boolean[n+1];
		breaker[0]=true;
		for(int i=1;i<n+1;i++){
			breaker[i]=false;//this array holds if the substring s(0,j) can break in to segments
		}
		
		for(int i=1;i<n+1;i++){
			for(int j=0;j<i;j++){
				if(breaker[j]&&wordDict.contains(s.substring(j, i))){
					breaker[i]=true;
					break;
				}
			}
		}
		return breaker[n];
	}
/*    public boolean wordBreak(String s, Set<String> wordDict) {
        int start=0;
        String subString="";
    	for(int i=0;i<s.length();i++){
        	subString=s.substring(start, i+1);
        	if(wordDict.contains(subString)){
        		start=i+1;
        	}
        }
    	if(start==s.length()){
    		return true;
    	}
    	else{
    		return false;
    	}
    }*/
}
