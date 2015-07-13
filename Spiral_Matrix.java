import java.util.ArrayList;
import java.util.List;


public class Spiral_Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};*/
		int[][] matrix = {{6,9,7}};
		List<Integer> list= new Spiral_Matrix().spiralOrder(matrix);
		for(int i : list){
			System.out.println(i);
		}
	}
	
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
    	if(matrix.length==0){
        	return list;
        }
    	int rows = matrix.length;
    	int cols = matrix[0].length;
    	int bX = 0, eX = cols-1, bY = 0, eY = rows-1;
    	while(bX<=eX){
    		for(int i = bX ;i<=eX; i++){
    			list.add(matrix[bY][i]);
    		}
    		bY++;
    		
    		if(bY>eY) break;
    		for(int i = bY; i<=eY; i++){
    			list.add(matrix[i][eX]);
    		}
    		eX--;
    		
    		if(eX<bX) break;
    		for(int i = eX; i>= bX; i--){
    			list.add(matrix[eY][i]);
    		}
    		eY--;
    		
    		if(eY<bY) break;
    		for (int i = eY; i>=bY; i--){
    			list.add(matrix[i][bX]);
    		}
    		bX++;
    	}
    	return list;
    }

}
