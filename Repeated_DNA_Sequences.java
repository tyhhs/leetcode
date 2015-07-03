import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Repeated_DNA_Sequences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		List<String> res=new Repeated_DNA_Sequences().findRepeatedDnaSequences(s);
		for(String item:res){
			System.out.println(item);
		}
	}
	//method 1: iteratively go through the String s
	//subString each 10 characters, store it in hash table, when duplicate found, add it to result list
    //result: Right method but Memory limited exceeded
/*	public List<String> findRepeatedDnaSequences(String s) {
        int length=s.length();
        List<String> res=new ArrayList<String>();
        Set<String> set=new HashSet<String>();
        if(length<10){
        	return res;
        }
        //subString(0,10)to subString(length-10,length)
        for(int i=0;i<=length-10;i++){
        	String subString=s.substring(i, i+10);
        	if(set.contains(subString)){
        		res.add(subString);
        	}
        	else{
        		set.add(subString);
        	}
        }
        return res;
    }*/
	
	//method two, bit manipulation
	public List<String> findRepeatedDnaSequences(String s) {
		List<String> res=new ArrayList<String>();
		Set<Integer> set=new HashSet<Integer>();
		Set<Integer> added=new HashSet<Integer>();
		if(s.length()<10){
        	return res;
        }
		//2 bits represents 1 char
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		map.put('A', 0);
		map.put('C', 1);
		map.put('G', 2);
		map.put('T', 3);
		
		int hash=0;
		for(int i = 0; i<s.length(); i++){
			if(i<9){
				hash=(hash<<2)+(map.get(s.charAt(i)));
			}
			else{
				hash=(hash<<2)+(map.get(s.charAt(i)));
				//change the hash to 20 bits long
				hash=hash&((1<<20)-1);
				if(set.contains(hash)&&!added.contains(hash)){
					res.add(s.substring(i-9,i+1));
					added.add(hash);
				}
				else{
					set.add(hash);
				}
			}
		}
		return res;
	}
}
