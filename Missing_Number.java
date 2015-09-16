
public class Missing_Number {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,5};
		System.out.println(new Missing_Number().missingNumber(nums));
	}
    public int missingNumber(int[] nums) {
    	int length = nums.length;
    	long sum = 0;
    	for(int num : nums){
    		sum += num;
    	}
    	long expectedSum = (long)((1+length) * (length/2.0));
    	return (int)(expectedSum - sum);
    }
}
