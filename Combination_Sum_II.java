import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Combination_Sum_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={10,1,2,7,6,1,5};
		int target=8;
		List<List<Integer>> combinationsList=combinationSum2(num, target);
		list.printIntegerList(combinationsList);
	}

    public static List<List<Integer>> combinationSum2(int[] num, int target) {
        
        if(num.length==0){
        	return new ArrayList<List<Integer>>();
        }
        Arrays.sort(num);
        return new ArrayList<List<Integer>>(helper(num, target));

    }
    public static Set<List<Integer>> helper(int[] num, int target) {
    	Set<List<Integer>> combinations=new HashSet<List<Integer>>();
        for(int i=0;i<num.length;i++){
        	if(target<num[i]){
        		break;
        	}
        	if(target==num[i]){
        		List<Integer> add=new ArrayList<Integer>();
        		add.add(num[i]);
        		combinations.add(add);
        		break;
        	}
        	else{
        		int[] subArray=Arrays.copyOfRange(num, i+1, num.length);
        		Set<List<Integer>> temp=new HashSet<List<Integer>>();
        		temp=helper(subArray,target-num[i]);
        		for(List<Integer> addItem:temp){
        			addItem.add(0,num[i]);
        			combinations.add(addItem);
        		}
        	}
        }
        return combinations;
    }
    
}
