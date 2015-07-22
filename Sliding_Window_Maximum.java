import java.util.Deque;
import java.util.LinkedList;


public class Sliding_Window_Maximum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {7, 2, 4};
		int k = 2;
		int[] res = new Sliding_Window_Maximum().maxSlidingWindow(nums, k);
		for(int i : res){
			System.out.println(i);
		}
	}
	
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length<k||nums==null||k<=0){
        	return new int[0];
        }
        int[] res = new int[nums.length-k+1];
        Deque<Integer> deque = new LinkedList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
        	
        	//remove elements out of bound 
        	if(!deque.isEmpty()&&deque.peek()<i-k+1){
        		deque.pollFirst();
        	}
        	
        	//remove useless elements
        	while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
        		deque.pollLast();
        	}
        	
        	//insert new index
        	deque.offer(i);
        	
        	//record maximum element of current sliding window
        	if(i >= k-1){//if i<k-1, there is not an integrated window
        		res[i-k+1] = nums[deque.peek()];
        	}
        }
        return res;
    }

}
