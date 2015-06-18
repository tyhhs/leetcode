public class Median_of_Two_Sorted_Arrays {

	/**
	 * There are two sorted arrays A and B of size m and n respectively. Find
	 * the median of the two sorted arrays. The overall run time complexity
	 * should be O(log (m+n)).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 3, 5, 7, 9 };
		int B[] = { 2, 4, 6, 8, 10};
		double median = findMedianSortedArrays(A, B);
		System.out.println(median);
	}

	public static double findMedianSortedArrays(int A[], int B[]) {
		int size = A.length + B.length;
		int new_array[] = new int[size];
		int j = 0;
		int k = 0;
		for (int i = 0; i < size; i++) {
			if (j < A.length && k < B.length) {
				if (A[j] >= B[k]) {
					new_array[i] = B[k];
					k++;
				} else {
					new_array[i] = A[j];
					j++;
				}
				continue;
			}
			if (j == A.length) {
				new_array[i] = B[k];
				k++;
				continue;
			}
			if (k == B.length) {
				new_array[i] = A[j];
				j++;
				continue;
			}
		}
		if(size%2==0){
			return (double)(new_array[size/2-1]+new_array[size/2])/2;
		}
		else
			return (double)new_array[(size-1)/2];
	}
}
