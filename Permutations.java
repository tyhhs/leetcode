import java.util.ArrayList;
import java.util.List;

public class Permutations {

	/**
	 * Given a collection of numbers, return all possible permutations.
	 * 
	 * For example, [1,2,3] have the following permutations: [1,2,3], [1,3,2],
	 * [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={3,2,1};
		list.printIntegerList(permute(num));
	}
    public static List<List<Integer>> permute(int[] num) {
    	if(num.length==0){
    		return null;
    	}
    	List<List<Integer>> lists=new ArrayList<List<Integer>>();
    	List<Integer> addItem=new ArrayList<Integer>();
    	addItem.add(num[0]);
    	lists.add(addItem);
    	
    	for(int i=1;i<num.length;i++){
    		List<List<Integer>> temp=new ArrayList<List<Integer>>();
    		for(int j=0;j<lists.size();j++){
    			for(int k=0;k<=i;k++){
    				List<Integer> addTemp=new ArrayList<Integer>();
    				addTemp.addAll(lists.get(j));
    				addTemp.add(k,num[i]);
    				temp.add(addTemp);    				
    			}
    		}
    		lists=temp;
    	}
    	return lists;
    }

}
