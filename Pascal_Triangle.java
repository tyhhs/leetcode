import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {

	/**
	 * Given numRows, generate the first numRows of Pascal's triangle.
	 * 
	 * For example, given numRows = 5, Return
	 * 
	 * [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int rows = 5;
		list = generate(rows);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((Integer) list.get(i).get(j));

			}
			System.out.println();
		}
		System.out.println(list.size());
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (numRows == 0) {
			return list;
		}
		// initial first line
		List<Integer> first = new ArrayList<Integer>();
		first.add(1);
		list.add(first);
		if (numRows == 1) {
			return list;
		}
		for (int i = 1; i < numRows; i++) {
			List<Integer> row = new ArrayList<Integer>();
			row.add(1);
			for (int j = 1; j <= i - 1; j++) {
				row.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
			}
			row.add(1);
			list.add(row);
		}
		return list;

	}

}
