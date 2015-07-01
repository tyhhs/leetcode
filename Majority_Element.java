import java.util.Arrays;

public class Majority_Element {

	/**
	 * Given an array of size n, find the majority element. The majority element
	 * is the element that appears more than ⌊ n/2 ⌋ times.
	 * 
	 * You may assume that the array is non-empty and the majority element
	 * always exist in the array.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 1, 8, 1, 7, 1, 6, 5, 1, 4, 1, 3, 1, 2, 1 };
		System.out.println(majorityElement(num));
	}

	/*
	 * public static int majorityElement(int[] num) { Arrays.sort(num); return
	 * num[num.length/2]; }
	 */

	// use Boyer-Moore Majority vote algorithm
	public static int majorityElement(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		/*
		 * 1. Eliminate all elements except one.
		 * 
		 * Iterating through the array of numbers, maintain a current candidate
		 * and a counter initialized to 0. With the current element x in
		 * iteration, update the counter and (possibly) the candidate:
		 * 
		 * If the counter is 0, set the current candidate to x and the counter
		 * to 1. If the counter is not 0, increment or decrement the counter
		 * based on whether x is the current candidate.
		 */
		int candidate = nums[0];
		int counter = 1;
		for (int i = 1; i < nums.length; i++) {
			if (candidate == nums[i]) {
				counter++;
			} else {
				counter--;
				if (counter == 0) {
					candidate = nums[i];
					counter = 1;
				}
			}
		}
		/*
		 * 2. Determine if the remaining element is a valid majority element.
		 * 
		 * With the candidate acquired in step 1, iterate through the array of
		 * numbers and count its occurrences. Determine if the result is more
		 * than half of the sequence's length. If so, the candidate is the
		 * majority. Otherwise, the sequence doesn't contain a majority.
		 */
		//verify if the candidate is the Majority, not necessary in this question
		counter=0;
		for(int i:nums){
			if(i==candidate){
				counter++;
			}
		}
		
		if(counter>(nums.length/2)){
			return candidate;
		}
		else{
			return 0;
		}

		
	}

}
