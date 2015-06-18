import java.util.List;

public class list {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void printIntegerList(List<List<Integer>> list){
		for(int i=0;i<list.size();i++){
			System.out.print("[");
			for (int j=0;j<list.get(i).size();j++){
				System.out.print(list.get(i).get(j));
				if(j!=list.get(i).size()-1){
					System.out.print(",");
				}
			}
			System.out.println("]");
		}
	}
}
