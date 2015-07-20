
public class Regular_Expression_Matching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aa";
		String p = ".*";
		System.out.println(new Regular_Expression_Matching().isMatch(s, p));
	}

    public boolean isMatch(String s, String p) {
        if(p.length()==0){
        	return s.length()==0;
        }
        if(p.length()==1||p.charAt(1)!='*'){
        	if(s.length()<1||(s.charAt(0)!=p.charAt(0)&&p.charAt(0)!='.')){
        		return false;
        	}
        	else{
        		return isMatch(s.substring(1), p.substring(1));
        	}
        }
        else{
        	int len = s.length();
        	int i = -1;
        	while(i<len&&(i<0||s.charAt(i)==p.charAt(0)||p.charAt(0)=='.')){
        		if(isMatch(s.substring(i+1), p.substring(2))){
        			return true;
        		}
        		i++;
        	}
        	return false;
        }
        
    }
}
