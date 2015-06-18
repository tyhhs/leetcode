import java.util.ArrayList;
import java.util.List;

public class Gray_Code {

	/**
	 * The gray code is a binary numeral system where two successive values
	 * differ in only one bit.
	 * 
	 * Given a non-negative integer n representing the total number of bits in
	 * the code, print the sequence of gray code. A gray code sequence must
	 * begin with 0.
	 * 
	 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
	 * 
	 * 00 - 0 
	 * 01 - 1 
	 * 11 - 3 
	 * 10 - 2 
	 * Note: For a given n, a gray code sequence is
	 * not uniquely defined.
	 * 
	 * For example, [0,2,3,1] is also a valid gray code sequence according to
	 * the above definition.
	 * 
	 * For now, the judge is able to judge based on one instance of gray code
	 * sequence. Sorry about that.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=grayCode(3);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
    public static List<Integer> grayCode(int n) {
    	List<Integer> list=new ArrayList<Integer>();
    	if(n==0){
    		list.add(0);
    		return list;
    	}
    	List<Integer> tempList=grayCode(n-1);
    	list=tempList;
    	int addNumber=1<<(n-1);
    	for(int i=tempList.size()-1;i>=0;i--){
    		list.add(tempList.get(i)+addNumber);
    	}
    	return list;
    }
}
