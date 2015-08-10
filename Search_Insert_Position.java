
public class Search_Insert_Position {

	/**
	 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
	 */
	public static void main(String[] args) {
		int[] A={1,3,5,6};
		System.out.println(searchInsert(A,0));
	}
	
    public static int searchInsert(int[] A, int target) {
    	if(A.length==0){
    		return 0;
    	}
        int low=0;
        int high=A.length-1;
        int mid;
        while(low<=high){
        	mid=low+(high-low)/2;
        	if(target<A[mid]){
        		high=mid-1;
        	}
        	else if(target>A[mid]){
        		low=mid+1;
        	}
        	else
        		return mid;
        }
        if(high<low){
        	return low;
        }
        else
        	return high;
        
    }

}
