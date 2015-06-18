import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Combination_Sum_III {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> l=new Combination_Sum_III().combinationSum3(3, 12);
		list.printIntegerList(l);
	}
	//backtracking
	public List<List<Integer>> combinationSum3(int k, int n) {
		return helper(k, n, 9, new ArrayList<List<Integer>>(), new ArrayList<Integer>());
	}
	
	public List<List<Integer>> helper(int k, int n, int max, List<List<Integer>> res, List<Integer> list){
		if(k<=0||n<=0){
			if(k==0&&n==0){
				res.add(new ArrayList<Integer>(list));
			}
			return res;
		}
		for(int i=max;i>=1;i--){
			list.add(0, i);
			helper(k-1, n-i, i-1, res, list);
			list.remove(0);
		}
		return res;
	}
	
/*	public List<List<Integer>> combinationSum3(int k, int n) {
	    return combinationSum3Int(k, n, 9, new ArrayList<List<Integer>>(), 
	            new LinkedList<Integer>());
	}

	private List<List<Integer>> combinationSum3Int(int k, int n, int max, 
	        List<List<Integer>> result, LinkedList<Integer> list){
	    if(k <= 0 || n <= 0){
	        if(k == 0 && n == 0)
	            result.add(new ArrayList<Integer>(list));
	        return result;
	    }
	    for(int i = max; i >= 1; i--){
	        list.addFirst(i);
	        combinationSum3Int(k - 1, n - i, i - 1, result, list);
	        list.removeFirst();
	    }
	    return result;
	}*/

}
