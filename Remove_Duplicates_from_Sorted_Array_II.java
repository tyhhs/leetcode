
public class Remove_Duplicates_from_Sorted_Array_II {

	/**
	 * Follow up for "Remove Duplicates":
	What if duplicates are allowed at most twice?

	For example,
	Given sorted array A = [1,1,1,2,2,3],

	Your function should return length = 5, and A is now [1,1,2,2,3].
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={0,1,2,2,2,3,4};
		System.out.println(removeDuplicates(A));
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]);
		}
	}
    public static int removeDuplicates(int[] A) {
        int n=A.length;
        int k=2;
    	if (n <= k) return n;

        int i = 1, j = 1;
        int cnt = 1;
        while (j < n) {
            if (A[j] != A[j-1]) {
                cnt = 1;
                A[i++] = A[j];
            }
            else {
                if (cnt < k) {
                    A[i++] = A[j];
                    cnt++;
                }
            }
            ++j;
        }
        return i;
    }
}
