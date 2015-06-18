import java.util.Arrays;


public class Majority_Element {

	/**
	 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,1,8,1,7,1,6,5,1,4,1,3,1,2,1};
		System.out.println(majorityElement(num));
	}
    public static int majorityElement(int[] num) {
        Arrays.sort(num);
        return num[num.length/2];
    }

}
