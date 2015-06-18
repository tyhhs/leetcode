
public class Count_and_Say {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(7));		
	}
    public static String countAndSay(int n) {
        String string="11";
        if(n==0){
        	return "";
        }
        if(n==1){
        	return "1";
        }
        if(n==2){
        	return "11";
        }

        for(int i=3;i<=n;i++){
        	String temp="";
        	int count=1;
        	char previous=string.charAt(0);
        	char a=' ';
        	//System.out.println(previous);
        	for(int j=1;j<string.length();j++){
        		a=string.charAt(j);
        		if(a!=previous){
        			temp+=Integer.toString(count)+previous;
        			previous=a;
        			count=1;
        		}
        		else{	
        			count++;
        		}
        	}
        	temp+=Integer.toString(count)+a;
        	string =temp;
        }
        return string;
    }
}
