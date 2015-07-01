import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Three_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={-1, 0, 1, 2, -1, -4};
		List<List<Integer>> res=new Three_Sum().threeSum(nums);
		list.printIntegerList(res);
	}
	
    public List<List<Integer>> threeSum(int[] nums) {
       	int length=nums.length;
    	if(length<3){
    		return new ArrayList<List<Integer>>();
    	}
    	Arrays.sort(nums);
    	Set<List<Integer>> set = new HashSet<List<Integer>>();
    	for(int i = 0; i<length-2;i++){
    		int target=0-nums[i];
    		int start=i+1;
    		int end = length-1;
    		while(start<end){
    			int sum=nums[start]+nums[end];
    			if(sum<target){
    				start++;
    			}
    			else if(sum>target){
    				end--;
    			}
    			else{
    				List<Integer> addItem=new ArrayList<Integer>();
    				addItem.add(nums[i]);
    				addItem.add(nums[start]);
    				addItem.add(nums[end]);
    				set.add(addItem);
    				start++;
    				end--;
    			}
    		}
    	}
    	return new ArrayList<List<Integer>>(set);
    }

}
