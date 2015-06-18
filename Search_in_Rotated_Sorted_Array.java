import javax.sound.midi.MidiChannel;

public class Search_in_Rotated_Sorted_Array {

	/**
	 * Suppose a sorted array is rotated at some pivot unknown to you
	 * beforehand.
	 * 
	 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
	 * 
	 * You are given a target value to search. If found in the array return its
	 * index, otherwise return -1.
	 * 
	 * You may assume no duplicate exists in the array.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={3,3,1};
		System.out.println(search(A, 1));
	}
    public static int search(int[] A, int target) {
        // check if the target is in the sorted part, if so keep doing the binary search
        // otherwise throw away the sorted part and do the same on the other part of the array
        int low=0;
        int high=A.length-1;
        while(low<=high){
        	int mid=(low+high)/2;
        	if(A[mid]==target){
        		return mid;
        	}
        	if(A[low]<=A[mid]){//first part in order
        		if(A[low]<=target&&target<=A[mid]){
        			//target in first part
        			high=mid-1;
        		}
        		else{
        			//in second part
        			low=mid+1;
        		}
        	}
        	else{
        		//second condition, the second part is in order
        		if(A[mid]<=target&&target<=A[high]){
        			low=mid+1;
        		}
        		else{
        			//in first part
        			high=mid-1;
        		}
        	}
        }
        return -1;
    }
}
