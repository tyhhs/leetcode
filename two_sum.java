public class two_sum {

	/**
	 * Given an array of integers, find two numbers such that they add up to a
	 * specific target number.
	 * 
	 * The function twoSum should return indices of the two numbers such that
	 * they add up to the target, where index1 must be less than index2. Please
	 * note that your returned answers (both index1 and index2) are not
	 * zero-based.
	 * 
	 * You may assume that each input would have exactly one solution.
	 * 
	 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={2,7,11,15,3,12};
		int target=15;
		int index[]=new int[2];
		index=twoSum(input,target);
		System.out.println(index[0]+"@"+index[1]);
	}
		public static int[] twoSum(int[] numbers, int target) {
			int index[]=new int[2];
			int find;
			for(int i=0;i<numbers.length;i++){
				find=target-numbers[i];
				for(int j=i+1;j<numbers.length;j++){
					if(numbers[j]==find){
						index[0]=i+1;
						index[1]=j+1;
						return index;
					}
				}
			}
			return null;
		}
	}

