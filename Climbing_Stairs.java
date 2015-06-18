public class Climbing_Stairs {

	/**
	 * You are climbing a stair case. It takes n steps to reach to the top.
	 * 
	 * Each time you can either climb 1 or 2 steps. In how many distinct ways
	 * can you climb to the top?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(1));
	}
	/*	recursive answer right, but time limited exceed
	 * public static int climbStairs(int n) {
        if(n==0){
        	return 0;
        }	
        if(n==1){
        	return 1; 
        }
        if(n==2){
        	return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }*/
	
	//this dynamic solution just keep f(n-1)and f(n-2), avoid repeated calculate 
	public static int climbStairs(int n) {
		 if(n==0){
	        	return 0;
	        }	
	        if(n==1){
	        	return 1; 
	        }
	        if(n==2){
	        	return 2;
	        }
		int[] f=new int[n+1];
		f[0]=0;
		f[1]=1;
		f[2]=2;
		for(int i=3;i<f.length;i++){
			f[i]=f[i-1]+f[i-2];
		}
		return f[n];
    }
}
