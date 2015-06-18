import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Subsets_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,2,2};
		List<List<Integer>> sets=subsetsWithDup(num);
		System.out.println("#"+sets.size());
		for(int i=0;i<sets.size();i++){
			List<Integer> item=sets.get(i);
			for(int j=0;j<item.size();j++){
				System.out.print(item.get(j));
			}
			System.out.println();
		}
	}
	
    public static List<List<Integer>> subsetsWithDup(int[] num) {
    	List<List<Integer>> sets=new ArrayList<List<Integer>>();
    	List<Integer> addItem=new ArrayList<Integer>();
    	Arrays.sort(num);
    	int len=num.length;
    	if(len==0){
    		return sets;
    	}
    	for(int i=len-1;i>=0;i--){
    		for(int j=sets.size()-1;j>=0;j--){
    			addItem=new ArrayList<Integer>();
    			addItem.add(num[i]);
    			addItem.addAll(sets.get(j));
    			if(!sets.contains(addItem)){
    				sets.add(addItem);
    			}
    		}
    		addItem=new ArrayList<Integer>();
    		addItem.add(num[i]);
			if(!sets.contains(addItem)){
				sets.add(addItem);
			}
    	}
    	addItem=new ArrayList<Integer>();
    	sets.add(addItem);
    	return sets;
    }
}
