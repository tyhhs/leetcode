
public class Excel_Sheet_Column_Title {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 52;
		System.out.println(new Excel_Sheet_Column_Title().convertToTitle(n));
	}
	//one line solution
	//return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
	
	//my solution
    public String convertToTitle(int n) {
    	if(n==0){
    		return "";
    	}
    	StringBuilder sb=new StringBuilder();
    	while(n>0){
    		n--;
    		sb.append((char)(n%26+'A'));
    		n=n/26;
    	}
    	sb.reverse();
    	return sb.toString();
    }

}
