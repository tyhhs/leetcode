



public class Sort_Colors {

	/**
	 * Given an array with n objects colored red, white or blue, sort them so
	 * that objects of the same color are adjacent, with the colors in the order
	 * red, white and blue.
	 * 
	 * Here, we will use the integers 0, 1, and 2 to represent the color red,
	 * white, and blue respectively.
	 * 
	 * Note: You are not suppose to use the library's sort function for this
	 * problem.
	 * 
	 * click to show follow up.
	 * 
	 * Follow up: A rather straight forward solution is a two-pass algorithm
	 * using counting sort. First, iterate the array counting number of 0's,
	 * 1's, and 2's, then overwrite array with total number of 0's, then 1's and
	 * followed by 2's.
	 * 
	 * Could you come up with an one-pass algorithm using only constant space?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A={0,1,2,2,2,0,1,1,1,0,2,0,1};
		int[] A={0,1,2,0,1,2,0,1,2};
		sortColors(A);
		for(int i=0;i<A.length;i++){
			System.out.println(A[i]);
		}
	}
	//first version(two pass)
/*	public static void sortColors(int[] A) {
		int count0=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<A.length;i++){
			if(A[i]==0){
				count0++;
			}
			else if(A[i]==1){
				count1++;
			}
			else {
				count2++;
			}
		}
		for(int i=0;i<count0;i++){
			A[i]=0;
		}
		for(int i=count0;i<count0+count1;i++){
			A[i]=1;
		}
		for(int i=count0+count1;i<A.length;i++){
			A[i]=2;
		}
	}*/
	//second version(one pass with constant space)
	public static void sortColors(int[] A) {
		int length=A.length;
		int index0=0;
		int index2=length-1;
		int i=0;
		while(i<=index2){
			//System.out.println("1");
			if(A[i]==0){
				A[index0]=0;
				if(index0!=i){
					A[i]=1;
				}
				index0++;
				i++;
			}
			else if(A[i]==2){
				int temp=A[index2];
				A[index2]=2;
				A[i]=temp;
				index2--;
			}
			else{
				i++;
			}
		}
	}
}
