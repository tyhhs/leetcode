import java.util.ArrayList;
import java.util.List;


public class Summary_Ranges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,4,5,7};
		List<String> res = new Summary_Ranges().summaryRanges(nums);
		for(String s:res){
			System.out.println(s);
		}
	}
	
    public List<String> summaryRanges(int[] nums) {
    	int length = nums.length;
    	List<String> res=new ArrayList<String>();
    	if(length==0){
    		return res;
    	}
    	int start = 0;
    	int end = 0;	
    	while(++end<length){
    		if(nums[end]-nums[end-1]==1){
    			//the number is still continuous
    			continue;
    		}
    		else{
    			//gap appeared, add range
    			res.add(getRange(nums[start], nums[end-1]));
    			start=end;
    		}
    	}
    	
    	//add last range
    	res.add(getRange(nums[start], nums[end-1]));
		
    	return res;
    }
    
    public String getRange(int start, int end){
    	if(start==end){
    		return Integer.toString(start);
    	}
    	else{
        	StringBuilder sb = new StringBuilder();
        	sb.append(start).append("->").append(end);
        	return sb.toString();
    	}
    }
}
