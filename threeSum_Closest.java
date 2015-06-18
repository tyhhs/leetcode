import java.util.Arrays;


public class threeSum_Closest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,1,-1,-1,3};
		int target=3;
		System.out.println(threeSumClosest(num, target));
	}
    public static int threeSumClosest(int[] num, int target) {
    	int len=num.length;
    	int res=num[0] + num[1] + num[len-1];
    	if(len<3){
    		return 0;
    	}
    	Arrays.sort(num);
    	for (int i = 0; i <len-2; i++) {
			int start=i+1;
			int end=len-1;
			while(start<end){
				int sum=num[i]+num[start]+num[end];
				if(sum==target){
					res=sum;
					break;
				}
				if(sum<target){
					start++;
				}
				else{
					end--;
				}
				res=Math.abs(sum-target)<Math.abs(res-target)?sum:res;
			}
		}
    	return res;
    }
}
