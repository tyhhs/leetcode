import java.util.HashMap;
import java.util.Map;


public class Contains_Duplicate_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={1,2,3,4,5,6,7,8,9,1};
		System.out.println(new Contains_Duplicate_II().containsNearbyDuplicate(nums, 8));
	}
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	Map<Integer, Integer> map=new HashMap<Integer, Integer>();
    	//map contains number and its index, if we come to a number that already in the map
    	//we check the index, if these two numbers in the gap k, return true
    	//else renew the index to the new one
    	for(int i=0;i<nums.length;i++){
    		if(map.containsKey(nums[i])){
    			if((i-map.get(nums[i]))<=k){
    				return true;
    			}
    			else{
    				map.put(nums[i], i);
    			}
    		}
    		else{
    			map.put(nums[i], i);
    		}
    	}
    	return false;
    }

}
