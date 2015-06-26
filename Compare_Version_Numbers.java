
public class Compare_Version_Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version1="0.0.0.0.1";
		String version2="0.0.0.0.1.1";
		System.out.println(new Compare_Version_Numbers().compareVersion(version1, version2));
	}
	//use recursion method,compare each sectio
	public int compareVersion(String version1, String version2) {
		//base case: have already compared all sections of two version Strings, but all same
		if(version1.equals("0")&&version2.equals("0")){
			return 0;
		}
		int version1point = version1.indexOf('.');
		int version2point = version2.indexOf('.');
		String sub1;
		String sub2;
		//contains '.', got current section
		if(version1point!=-1){
			sub1=version1.substring(0,version1point);
			version1=version1.substring(version1point+1);
		}
		else{//no '.', current section is the whole string
			sub1=version1;
			version1="0";//assume the next section is "0", in case of, the other version still has sections to compare
		}
		if(version2point!=-1){
			sub2=version2.substring(0,version2point);
			version2=version2.substring(version2point+1);
		}
		else{
			sub2=version2;
			version2="0";
		}
		//compare current two sections
		if(Integer.parseInt(sub1)>Integer.parseInt(sub2)){
			return 1;
		}
		else if(Integer.parseInt(sub1)<Integer.parseInt(sub2)){
			return -1;
		}
		else{//current two are equal to each other, go to next
			return compareVersion(version1, version2);
		}
	}

/*    public int compareVersion(String version1, String version2) {
    	int version1point=version1.indexOf('.');
    	int version2point=version2.indexOf('.');
    	String version1sub1;
		String version1sub2;
		String version2sub1;
		String version2sub2;
    	//get two sections
    	if(version1point!=-1){
    		version1sub1=version1.substring(0, version1point);
    		version1sub2=version1.substring(version1point+1);
    	}
    	else{
    		version1sub1=version1;
    		version1sub2="0";
    		
    	}
    	if(version2point!=-1){
        	version2sub1=version2.substring(0, version2point);
        	version2sub2=version2.substring(version2point+1);
    	}
    	else{
    		version2sub1=version2;
    		version2sub2="0";
    	}

    	//compare first-level reversion
    	if(Integer.parseInt(version1sub1)>Integer.parseInt(version2sub1)){
    		return 1;
    	}
    	else if(Integer.parseInt(version1sub1)<Integer.parseInt(version2sub1)){
    		return -1;
    	}    	
    	//else, compare second section
    	if(Integer.parseInt(version1sub2)>Integer.parseInt(version2sub2)){
    		return 1;
    	}
    	else if(Integer.parseInt(version1sub2)<Integer.parseInt(version2sub2)){
    		return -1;
    	}
    	return 0;
    	
    }*/
}
