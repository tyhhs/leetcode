import java.util.ArrayList;
import java.util.Arrays;


public class Permutation_Sequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Permutation_Sequence().getPermutation(4, 11));
	}

    public String getPermutation(int n, int k) {
    	//int[] nums=new int[n];
    	ArrayList<Integer> nums=new ArrayList<Integer>();
    	for(int i=0;i<n;i++){
    		nums.add(i+1);
    	}
    	StringBuilder string=new StringBuilder();
    	helper(string, nums, k);
    	return new String(string);
    }
    public void helper(StringBuilder string,ArrayList<Integer> nums,int k){
    	if(nums.size()==1){
    		string.append(nums.get(0));
    	}
    	else{
    		int size=factorial(nums.size()-1);
    		int group=k/size;
    		int remainder=k%size;
    		if(remainder!=0){
    			string.append(nums.remove(group));
    			helper(string, nums, remainder);
    		}
    		else{
    			string.append(nums.remove(group-1));
    			helper(string, nums, size);
    		}
    		
    		
    	}
    }
    public int factorial(int n){
    	if(n==1){
    		return 1;
    	}
    	else{
    		return n*factorial(n-1);
    	}
    }
}
