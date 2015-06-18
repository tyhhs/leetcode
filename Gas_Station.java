import javax.print.CancelablePrintJob;


public class Gas_Station {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas={5,1,9,1};
		int[] cost={6,2,2,3};
		System.out.println(canCompleteCircuit(gas, cost));
	}
	
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int len=gas.length;
		int[] remainder=new int[len];
		for (int i = 0; i <len; i++) {
			remainder[i]=gas[i]-cost[i];
		}
		
		//if the car cant from i to k, it also cant from any point from i+1 to k-1 to k, so we start again from k
		//Simulate a cycle by an array, such as: 0,1,2...n-1,0,1,2....n-2 total 2n-1 elements.
		int sum=0;
		int start=0;
		for(int i=0;i<2*len-1;i++){
			sum+=remainder[i%len];
			if(sum<0){
				start=i+1;
				if(start>len-1){
					return -1;
				}
				sum=0;
			}		
		}
		return start;
		
	}

/*    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int[] remainder=new int[gas.length];
    	for(int i=0;i<gas.length;i++){
        	remainder[i]=gas[i]-cost[i];
        }
    	
    	int can=0;
    	for(int i=0;i<gas.length;i++){
    		can=remainder[i];
    		int firstPart=1;
    		int success=0;
    		if(can<0){
    			continue;
    		}
    		
    		for(int j=i+1;j<gas.length;j++){
    			can=can+remainder[j];
        		if(can<0){
        			firstPart=0;
        			break;	
        		}
    		}
    		if(firstPart==1){
        		for(int j=0;j<i;j++){
        			can=can+remainder[j];
            		if(can<0){
            			break;
            		}
        		}
        		success=1;
    		}
    		if(success==1){
    			return i;
    		}
    		
    	}
    	return -1;
    }*/
}
