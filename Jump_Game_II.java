import java.util.ArrayList;
import java.util.List;


public class Jump_Game_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={2,3,1,1,8,1,1,1,1,1,1,1,10,1,1,1,1,1,1,1,1};
		List<Integer> nums=new ArrayList<Integer>();
		for(int i:num){
			nums.add(i);
		}
		System.out.println(jump(nums));
	}

    public static int jump(List<Integer> nums) {
        int len=nums.size();
        int furthest=0;//furthest hold the furthest position we can reach now
    	int[] helper=new int[len];
    	//array helper keeps the minimum jumps to related index 
    	for(int i=0;i<len-1;i++){
    		int curr=nums.get(i);
    		//if current position can reach the last one, return jumps to current position plus one
    		if(i+curr>=len-1){
    			return helper[i]+1;
    		}
    		else{
    			if(i+curr>furthest){//if we can jump from the current position to a further one
        			for(int j=furthest+1;j<=i+curr;j++){//update jumps from old furthest to new furthest position
        				helper[j]=helper[i]+1;
        			}
        			furthest=i+curr;
    			}
    		}
    	}
    	//return the jumps recorded in the last index
    	return helper[len-1];
    }
}
