import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] strs={"abc","cba","bac","xyz","xzy","aaaaaa"};
		String[] strs={"",""};
		List<String> res=new Anagrams().anagrams(strs);
		for(String s:res){
			System.out.println(s);
		}
	}
	
    public List<String> anagrams(String[] strs) {
        List<String> res=new ArrayList<String>();
        HashMap<String, String> map=new HashMap<String, String>();
        String s;
        //for each string in the strs sort it first in alphabetic order
        for(int i=0;i<strs.length;i++){
        	s=strs[i];
        	String str[]=s.split("");
        	Arrays.sort(str);
        	String s2="";
        	for(String temp:str)
        		s2+=temp;
        	if(map.containsKey(s2)){//if an Anagram in the hashmap, add this string to res
        		if(map.get(s2)!="!"){//add the anagram in hashmap into the res
            		res.add(s);
            		String s3=map.get(s2);
            		res.add(s3);
            		map.put(s2, "!");//set the value to "!" to indicate that the value has already insert into the res list 
        		}
        		else{//only add current string
        			res.add(s);
        		}
        		
        	}
        	else{//put the current string to hashmap<sorted string, original string>, but don't insert it now, because we don't if it has anagram
        		map.put(s2, s);
        	}
        }
        return res;
    }

}
