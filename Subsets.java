import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Subsets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] S={1,2,3};
		List<List<Integer>> lists=subsets(S);
		//System.out.println(lists.size());
		for(int i=0;i<lists.size();i++){
			for(int j=0;j<lists.get(i).size();j++){
				System.out.print(lists.get(i).get(j));
			}
			System.out.println();
		}
	}
	
    public static List<List<Integer>> subsets(int[] S) {
    	List<List<Integer>> sets=new ArrayList<List<Integer>>();
    	sets.add(new ArrayList<Integer>());
    	Arrays.sort(S);
    	for(int i=S.length-1;i>=0;i--){
    		for(int j=sets.size()-1;j>0;j--){
    			ArrayList<Integer> add=new ArrayList<Integer>();
    			add.add(S[i]);
    			add.addAll(sets.get(j));
    			sets.add(add);
    		}
    		ArrayList<Integer> add=new ArrayList<Integer>();
    		add.add(S[i]);
    		sets.add(add);
    		
    	}
    	
    	return sets;
    }
}
