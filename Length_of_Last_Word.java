
public class Length_of_Last_Word {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello worlda";
		System.out.println(lengthOfLastWord(s));
	}
	
    public static int lengthOfLastWord(String s) {
        String[] list=s.split(" ");
        int length=list.length;
        if(length==0){
            return 0;
        }
        return list[length-1].length(); 
        
    }
}
