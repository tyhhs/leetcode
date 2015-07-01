import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Majority_Element_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Majority_Element_II majority_Element_II=new Majority_Element_II();
		//int[] nums={1,2,3,1,2,3,1,2,3,1,2,3,1,2,4};
		int[] nums={1};
		List<Integer> res=majority_Element_II.majorityElement(nums);
		for(int i:res){
			System.out.println(i);
		}
	}
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        int n=nums.length;
        //use Boyer-Moore Majority vote algorithm
        int candidate1=0,candidate2=0,counter1=0,counter2=0;
        for(int i:nums){
        	if(i==candidate1){
        		counter1++;
        	}
        	else if(i==candidate2){
        		counter2++;
        	}
        	else if(counter1==0){
        		candidate1=i;
        		counter1++;
        	}
        	else if(counter2==0){
        		candidate2=i;
        		counter2++;
        	}
        	else{
        		counter1--;
        		counter2--;
        	}
        }
        
        //verify
        counter1=0;
        counter2=0;
        for(int i:nums){
        	if(i==candidate1){
        		counter1++;
        	}
        	else if(i==candidate2){
        		counter2++;
        	}
        }
        int check=n/3;
        if(counter1>check){
        	list.add(candidate1);
        }
        if(counter2>check){
        	list.add(candidate2);
        }
        return list;
    }

}
