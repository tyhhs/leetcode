
public class Minimum_Size_Subarray_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={2,3,1,2,4,3,7};
		int s=7;
		System.out.println(new Minimum_Size_Subarray_Sum().minSubArrayLen(s, nums));
	}
	
    public int minSubArrayLen(int s, int[] nums) {
    	int length=nums.length;
    	if(length==0){
    		return 0;
    	}
        int start=0;
        int end=0;
        int sum=nums[0];
        int min=length;
        boolean hasAnswer=false;
        while(end<length){
        	if(sum>=s){	
        		hasAnswer=true;
        		min=Math.min(end-start+1, min);
        		if(start<end){
        			sum-=nums[start];
        			start++;
        		}
        		else{//start=end, must be minimum length
        			return 1;
        		}
        	}
        	else if(end<length-1){
        		end++;
        		sum=sum+nums[end];
        	}
        	else{
        		break;
        	}
        }
        if(hasAnswer){
        	return min;
        }
        else{
        	return 0;
        }
    }

}
