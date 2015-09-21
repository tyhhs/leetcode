
public class Move_Zeroes {

	public static void main(String[] args) {
		int nums[] = {0, 1, 0, 3, 12};
		new Move_Zeroes().moveZeroes(nums);
		for(int i : nums){
			System.out.println(i);
		}
	}
	
    public void moveZeroes(int[] nums) {
    	if (nums.length < 2) {
			return;
		}
    	int index = 0;
    	for(int num : nums){
    		if(num != 0){
    			nums[index++] = num;
    		}
    	}
    	while(index < nums.length){
    		nums[index++] = 0;
    	}
    }
    
}
