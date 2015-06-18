

public class Find_Peak_Element {

	/**
	 * A peak element is an element that is greater than its neighbors.
	 * 
	 * Given an input array where num[i] ≠ num[i+1], find a peak element and
	 * return its index.
	 * 
	 * The array may contain multiple peaks, in that case return the index to
	 * any one of the peaks is fine.
	 * 
	 * You may imagine that num[-1] = num[n] = -∞.
	 * 
	 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function
	 * should return the index number 2.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,2};
		System.out.println(findPeakElement(num));
	}

	public static int findPeakElement(int[] num) {
		int Length=num.length;
		if(Length==1){
			return 0;
		}
		if(num[0]>num[1]){
			return 0;
		}
		if(num[Length-1]>num[Length-2]){
			return Length-1;
		}
		for(int i=1;i<Length-1;i++){
			if(num[i]>num[i-1]){
				if(num[i]>num[i+1]){
					return i;
				}
			}
		}
		return 0;
	}

}
