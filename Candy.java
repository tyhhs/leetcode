
public class Candy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] ratings = {1,3,4,6,5,4,3,2,1};
		//int[] ratings = {4,2,3,4,1};
		int[] ratings = {1,2};
		System.out.println(new Candy().candy(ratings));
	}
	
    public int candy(int[] ratings) {
    	int length = ratings.length;
    	if(length==0){
    		return 0;
    	}
    	int candies[] = new int[length];
    	int res = 0;
    	
    	//initialize the array
    	for(int i = 0; i < length; i++){
    		candies[i] = 1;
    	}
    	
    	//left to right scan 
    	for(int i = 1; i < length; i++){
    		if(ratings[i] > ratings[i-1]){
    			candies[i] = candies[i-1] + 1;
    		}
    	}
    	
    	//right to left scan
    	for(int i = length-2; i >= 0; i--){
    		if(ratings[i] > ratings[i+1]){
    			candies[i] = Math.max(candies[i+1]+1, candies[i]);
    		}
    	}
    	
    	//calculate number of candies
    	for(int i : candies){
    		res += i;
    	}
    	
    	return res;   	
    }

}
