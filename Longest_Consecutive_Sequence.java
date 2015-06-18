import java.util.HashMap;


public class Longest_Consecutive_Sequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num ={0,3,7,2,5,8,4,6,0,1};
		System.out.println(longestConsecutive(num));
	}
	
    public static int longestConsecutive(int[] num) {
        HashMap<Integer, Integer> array=new HashMap<Integer, Integer>();
        int longest=0;
        int right;
        int left;
        for(int i=0;i<num.length;i++){
        	if (array.get(num[i])!=null) {
				continue;
			}
        	else if(array.get(num[i]-1)!=null&&array.get(num[i]+1)!=null){
        		int value=array.get(num[i]-1)+array.get(num[i]+1)+1;
        		array.put(num[i], value);
        		right=array.get(num[i]+1);
        		left=array.get(num[i]-1);
        		array.put(num[i]+1, value);
        		array.put(num[i]+right, value);
        		array.put(num[i]-1, value);
        		array.put(num[i]-left, value);
        	}
        	else if(array.get(num[i]-1)!=null){
        		int value=array.get(num[i]-1)+1;
        		array.put(num[i], value);
        		left=array.get(num[i]-1);
        		array.put(num[i]-1, value);
        		array.put(num[i]-left, value);
        	}
        	else if(array.get(num[i]+1)!=null){
        		int value=array.get(num[i]+1)+1;
        		array.put(num[i], value);
        		right=array.get(num[i]+1);
        		array.put(num[i]+1, value);
        		array.put(num[i]+right, value);
        	}
        	else{
        		array.put(num[i], 1);
        	}
        	
        	if(array.get(num[i])>longest){
        		longest=array.get(num[i]);
        	}
        }
        return longest;
    }

}
