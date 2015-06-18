import java.util.Arrays;


public class House_Robber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,2,3,4,5,6,7,8,9,10,11};
		House_Robber a=new House_Robber();
		System.out.println(a.rob(num));
	}
    public int rob(int[] num) {
    	//solution 1, dynamic programming, time exceeded
/*      int len=num.length;
        if(len==0){
        	return 0;
        }
        else if(len==1){
        	return num[0];
        }
        else if(len==2){
        	return Math.max(num[0], num[1]);
        }
        else{
        	int preNoRob[]=Arrays.copyOfRange(num, 0, len-2);
        	int preYesRob[]=Arrays.copyOfRange(num, 0, len-1);
            return Math.max(num[len-1]+rob(preNoRob),rob(preYesRob));	
        }*/
    	//solution 2,iteration   
    	int len=num.length;
    	int noRob=0;
    	int rob=0;
    	for(int i=0;i<len;i++){
    		int temp=noRob;
    		noRob=Math.max(rob, noRob);
    		rob=temp+num[i];
    	}
    	return Math.max(rob, noRob);

    }
}
