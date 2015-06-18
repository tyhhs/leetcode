
public class Bitwise_AND_of_Numbers_Range {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rangeBitwiseAnd(5,7));
	}

    public static int rangeBitwiseAnd(int m, int n) {
        int res=0;
        int range=n-m;
        int count=0;
        //find how many bits can change in this range
        while(range!=0){
        	range=range>>1;
        	count++;
        }
        //avoid bit carry, so & the remainder bits of m and n
        m=m>>count;
        n=n>>count;
        res=m&n;  
        res=res<<count;
    	return res; 
    }
}
