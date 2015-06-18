import java.util.ArrayList;
import java.util.List;


public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		List<Integer> add=new ArrayList<Integer>();
		add.add(-1);
		lists.add(add);
		
		List<Integer> add2=new ArrayList<Integer>();
		add2.add(2);
		add2.add(3);
		lists.add(add2);
		
		List<Integer> add3=new ArrayList<Integer>();
		add3.add(1);
		add3.add(-1);
		add3.add(-3);
		lists.add(add3);
		
		System.out.println(minimumTotal(lists));
	}
	
    public static int minimumTotal(List<List<Integer>> triangle) {
        int size=triangle.size();
    	if(size==0){
        	return 0;
        }
    	int sum=triangle.get(0).get(0);
    	int pre=0;
    	for(int i=1;i<size;i++){
    		if(triangle.get(i).get(pre)>triangle.get(i).get(pre+1)){
    			sum+=triangle.get(i).get(pre+1);
    			pre=pre+1;
    		}
    		else{
    			sum+=triangle.get(i).get(pre);
    			pre=pre;
    		}
    	}
    	return sum;
        
    }

}
