import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle_2 {

	/**
	 * Given an index k, return the kth row of the Pascal's triangle.
	 * 
	 * For example, given k = 3, Return [1,3,3,1].
	 * 
	 * Note: Could you optimize your algorithm to use only O(k) extra space?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> row=new ArrayList<Integer>();
		int rowIndex=13;
		row=getRow(rowIndex);
		for(int i=0;i<=rowIndex;i++){
			System.out.println(row.get(i));
		}
		//System.out.println(combination(21,1));
		//System.out.println(factorial(21));
		//System.out.println(factorial(1));
		//System.out.println(factorial(12));
	}

/*	public static List<Long> getRow(int rowIndex) {
		List<Long> row=new ArrayList<Long>();
		for(int i=0;i<=rowIndex;i++){
			row.add(combination(rowIndex,i));
		}
		return row;
	}
	public static long combination(int n,int m){
		return (Long)(factorial(n)/(factorial(m)*factorial(n-m)));
	}
	public static long factorial(int n){
		if(n==0||n==1){
			return 1;
		}
		else
			return n*factorial(n-1);
		
	}*/
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<Integer>();
        res.add(1);
        if(rowIndex==0){
        	return res;
        }
        for(int i=1;i<=rowIndex;i++){
        	res.add(1);
        	for(int j=0;j<i-1;j++){
        		res.add(res.get(j)+res.get(j+1));
        	}
        	res.add(1);
        	for(int j=0;j<i;j++){
        		res.remove(0);
        	}
        }
        return res;
    }
}
