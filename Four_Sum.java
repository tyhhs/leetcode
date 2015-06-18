import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.TabableView;


public class Four_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums={1, 0, -1, 0, -2, 2};
		int[] nums={2,1,0,-1};
		int target=2;
		List<List<Integer>> res=new Four_Sum().fourSum(nums, target);
		list.printIntegerList(res);
	}
	//backtracking time exceeded
/*    public List<List<Integer>> fourSum(int[] nums, int target) {
    	int length=nums.length;
    	if(length<4){
    		return null;
    	}
    	Arrays.sort(nums);
    	Set<List<Integer>> res=helper(nums, target, 4, new HashSet<List<Integer>>(), new ArrayList<Integer>());
    	return new ArrayList<List<Integer>>(res);
    }
    
    public HashSet<List<Integer>> helper(int[] nums, int target,int times, 
    		HashSet<List<Integer>> set, ArrayList<Integer> list){
    	if(target==0&&times==0){
    		set.add(new ArrayList<Integer>(list));
    		return set;
    	}
    	if(times==0){
    		return set;
    	}
    	for(int i=nums.length-1;i>=0;i--){
    		list.add(0,nums[i]);
    		int[] subArray=Arrays.copyOfRange(nums, 0, i);
    		helper(subArray, target-nums[i], times-1, set, list);
    		list.remove(0);
    	}
    	return set;
    }*/
	
	//change to 2sum problem, complicity is O(n^3)
	public List<List<Integer>> fourSum(int[] nums, int target) {
		int length=nums.length;
    	if(length<4){
    		return new ArrayList<List<Integer>>();
    	}
		
		Set<List<Integer>> set = new HashSet<List<Integer>>();		
		Arrays.sort(nums);
		for(int i=length-1;i>=3;i--){
			for(int j=i-1;j>=2;j--){
				//start 2sum problem standard soluntion
				int low=0;
				int high=j-1;
				int restTarget = target-nums[i]-nums[j];
				while(low<high){
					if (nums[low]+nums[high]==restTarget){
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(nums[low]);
						temp.add(nums[high]);
						temp.add(nums[j]);
						temp.add(nums[i]);
						set.add(temp);
						low++;
						high--;
					}
					else if(nums[low]+nums[high]<restTarget){
						low++;
					}
					else{
						high--;
					}
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
	}
	

}
