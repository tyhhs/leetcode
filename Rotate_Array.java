import java.util.Arrays;


public class Rotate_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,3,4,5,6,7};
		//int[] nums={1};
		Rotate_Array ra=new Rotate_Array();
		ra.rotate(nums, 3);
		for(int i:nums){
			System.out.println(i);
		}
	}

    public void rotate(int[] nums, int k) {
    	int length=nums.length;
    	if(length==0){
    		return;
    	}
    	int step=k%length;
    	if(step==0){
    		return;
    	}
    	//three steps reverse
    	reverse(nums, 0, nums.length-1);
    	reverse(nums, 0, step-1);
    	reverse(nums, step, nums.length-1);
    }
    
    //reverse detailed range of an array(start-end, both included)
    public void reverse(int[] nums, int start, int end){
    	int[] subArray=Arrays.copyOfRange(nums, start, end+1);
    	for(int i=start;i<=end;i++){
    		nums[i]=subArray[end-i];
    	}
    }
}
