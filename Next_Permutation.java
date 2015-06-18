import java.lang.reflect.Array;
import java.util.Arrays;


public class Next_Permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,2,3};
		nextPermutation(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}
    public static void nextPermutation(int[] num) {
        int point=-1;
        for(int i=num.length-2;i>=0;i--){
        	if(num[i]<num[i+1]){
        		point=i;
        		break;
        	}
        }
        if(point==-1){
        	Arrays.sort(num);
        }
        else{
        	int minIndex=point+1;
        	for(int i=point+2;i<num.length;i++){
        		if(num[i]<num[minIndex]&&num[i]>num[point]){
        			minIndex=i;
        		}
        	}
        	//swap two numbers use bit manipulate
    		num[point]^=num[minIndex];
    		num[minIndex]^=num[point];
    		num[point]^=num[minIndex];
    		Arrays.sort(num, point+1, num.length);
        }
    }
}
