
public class Find_Minimum_in_Rotated_Sorted_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={4, 5, 6, 7, 0, 1, 2};
		System.out.println(findMin(num));
	}
	
    public static int findMin(int[] num) {
        int left=0;
        int right=num.length-1;
        int middle;
        while(left<right){
        	middle=left+(right-left)/2;
        	if(num[middle]<num[right]){
        		right=middle;
        	}
        	else if(num[middle]>num[right]){
        		left=middle+1;
        	}
        }
        return num[left];
    }
}
