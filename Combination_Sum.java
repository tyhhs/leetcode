import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Combination_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates={3,2,7,6};
		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		lists=combinationSum(candidates, 13);
		for(List<Integer> temp:lists){
			for(int i:temp){
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        Arrays.sort(candidates);//sort the candidates to ensure the increment order
        for(int i=0;i<candidates.length;i++){
        	if(target<candidates[i]){
        		return list;
        	}
        	else if(target==candidates[i]){
        		List<Integer> add=new ArrayList<Integer>();
        		add.add(candidates[i]);
        		list.add(add);
        	}
        	else{
        		//copy the array without elements before i
        		int[] subArray=Arrays.copyOfRange(candidates, i, candidates.length);
        		//create a new 2D lists to receive the new lists
        		List<List<Integer>> temp=new ArrayList<List<Integer>>();
        		temp=combinationSum(subArray, target-candidates[i]);
        		for(List<Integer> addItem:temp){
        			addItem.add(0, candidates[i]);
        			list.add(addItem);
        		}
        	}
        }
        return list;
    }
}
