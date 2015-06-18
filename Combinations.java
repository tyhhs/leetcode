import java.util.*;
public class Combinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> lists=combine(3, 3);
		for(int i=0;i<lists.size();i++){
			for(int j=0;j<lists.get(0).size();j++){
				System.out.print(lists.get(i).get(j));
			}
			System.out.println();
		}
	}
	
    public static List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> lists=new ArrayList<List<Integer>>();
    	if(n==0||n<k){
    		return lists;
    	}
    	helper(n, k, 1, new ArrayList<Integer>(), lists);
    	return lists;
    }
    
    private static void helper(int n, int k, int start, List<Integer> item, List<List<Integer>> lists)  
    {  
    	if(item.size()==k){
    		lists.add(new ArrayList<Integer>(item));
    		return;
    	}
    	for(int i=start;i<=n;i++){
    		item.add(i);
    		helper(n, k, i+1, item, lists);
    		item.remove(item.size()-1);
    	}
    }
}
