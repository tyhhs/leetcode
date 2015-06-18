import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Permutations_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,1,2};
		List<List<Integer>> lists=permuteUnique(num);
		list.printIntegerList(lists);
	}

    public static List<List<Integer>> permuteUnique(int[] num) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(num.length==0){
        	return list;
        }
        List<Integer> add=new ArrayList<Integer>();
        list.add(add);
        for(int i=0;i<num.length;i++){
        	Set<List<Integer>> levelLists=new HashSet<List<Integer>>();
        	for(int j=0;j<list.size();j++){
        		for(int k=0;k<=list.get(j).size();k++){
        			List<Integer> temp=new ArrayList<Integer>(list.get(j));
        			temp.add(k, num[i]);
        			levelLists.add(temp);
        		}
        	}
        	list=new ArrayList<List<Integer>>(levelLists);
        }
        return list;
    }
}
