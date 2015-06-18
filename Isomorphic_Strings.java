import java.util.Hashtable;




public class Isomorphic_Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="paper";
		String t="tiale";
		System.out.println(new Isomorphic_Strings().isIsomorphic(s, t));
	}
	
    public boolean isIsomorphic(String s, String t) {
    	Hashtable<Character, Integer> table1=new Hashtable<Character, Integer>();
    	Hashtable<Character, Integer> table2=new Hashtable<Character, Integer>();
    	char[] a1=s.toCharArray();
    	char[] a2=t.toCharArray();
    	char c1;
    	char c2;
    	int length=a1.length;
    	if(length==0){
    		return true;
    	}
    	for(int i=0;i<length;i++){
    		c1=a1[i];
    		c2=a2[i];
    		if(!table1.containsKey(c1)&&!table2.containsKey(c2)){
    			table1.put(c1, i);
    			table2.put(c2, i);
    			continue;
    		}
    		else if(table1.containsKey(c1)&&table2.containsKey(c2)){
    			if(table1.get(c1)!=table2.get(c2)){
    				return false;
    			}
    			continue;
    		}
    		else{
    			return false;
    		}
    	}
    	return true;
    }

}
