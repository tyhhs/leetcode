public class Search_in_Rotated_Sorted_Array_II {

	/**
	 * Follow up for "Search in Rotated Sorted Array": What if duplicates are
	 * allowed?
	 * 
	 * Would this affect the run-time complexity? How and why?
	 * 
	 * Write a function to determine if a given target is in the array.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 3, 1, 1, 1 };
		System.out.println(search(A, 3));
	}

	public static boolean search(int[] A, int target) {
		/*
		 * Yes, when there could be duplicates in the array, the worst case is
		 * O(n).
		 * 
		 * To explain why, consider this sorted array 1111115, which is rotated
		 * to 1151111.
		 * 
		 * Assume left = 0 and mid = 3, and the target we want to search for is
		 * 5. Therefore, the condition A[left] == A[mid] holds true, which
		 * leaves us with only two possibilities:
		 * 
		 * All numbers between A[left] and A[right] are all 1's. Different
		 * numbers (including our target) may exist between A[left] and
		 * A[right]. As we cannot determine which of the above is true, the best
		 * we can do is to move left one step to the right and repeat the
		 * process again. Therefore, we are able to construct a worst case input
		 * which runs in O(n), for example: the input 11111111...115.
		 * 
		 * Below is a pretty concise code (thanks to bridger) for your reference
		 * which I found from the old discuss.
		 */
		int low = 0;
		int high = A.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (A[mid] == target) {
				return true;
			}
			if (A[low] < A[mid]) {// first part in order
				if (A[low] <= target && target < A[mid]) {
					// target in first part
					high = mid - 1;
				} else {
					// in second part
					low = mid + 1;
				}
			} else if (A[low] > A[mid]) {
				// second condition, the second part is in order
				if (A[mid] < target && target <= A[high]) {
					low = mid + 1;
				} else {
					// in first part
					high = mid - 1;
				}
			} else {
				low++;
			}
		}
		return false;
	}
}
