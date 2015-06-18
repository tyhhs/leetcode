import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class Contains_Duplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={1,3,5,2,1,3,6,9,3};
		System.out.println(new Contains_Duplicate().containsDuplicate(nums));
	}
	
	
	//brute method
/*    public boolean containsDuplicate(int[] nums) {
    	if(nums.length==0||nums.length==1){
    		return false;
    	}
        Arrays.sort(nums);
        int pre=nums[0];
        for(int i=1;i<nums.length;i++){
        	if(nums[i]==pre){
        		return true;
        	}
        	pre=nums[i];
        }
    	return false;
    }*/
	
	//using hashSet
	//HashSet cant have duplicate
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set=new HashSet<Integer>();
		for(int i:nums){
			if(!set.add(i)){
				return true;
			}
		}
		return false;
	}

}
