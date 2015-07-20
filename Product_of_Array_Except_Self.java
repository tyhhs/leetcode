
public class Product_of_Array_Except_Self {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		int[] res = new Product_of_Array_Except_Self().productExceptSelf(nums);
		for(int i: res){
			System.out.println(i);
		}
	}
	
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        res[0] = 1;
        for (int i = 1; i<length; i++){
        	res[i] = res[i-1]*nums[i-1];
        }
        
        int right = nums[length-1];
        for(int i = length-2; i>=0; i--){
        	res[i] *= right;
        	right *= nums[i];
        }
        
        return res;
    }

}
