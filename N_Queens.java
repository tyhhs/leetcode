import java.util.ArrayList;
import java.util.List;


public class N_Queens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String[]> list=solveNQueens(8);
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.get(i).length;j++){
				System.out.println(list.get(i)[j]);
			}
			System.out.println();
		}

	}
    public static List<String[]> solveNQueens(int n) {
        List<String[]> list=new ArrayList<String[]>();
        if(n<=0){
        	return list;
        }
        int[] coordinate=new int[n];
        helper(list,n,0,coordinate);
        return list;
    }
    
    public static void helper(List<String[]> list, int nQueens, int row, int[] coordinate){
    	if(row==nQueens){
    		String[] unit=new String[nQueens];
    		for(int i=0;i<nQueens;i++){
    			StringBuilder s=new StringBuilder();
    			for(int j=0;j<nQueens;j++){
    				if(j==coordinate[i]){
    					s.append('Q');
    				}
    				else{
    					s.append('.');
    				}
    			}
    			unit[i]=s.toString();
    		}
    		list.add(unit);
    	}
    	else{
    		for(int i=0;i<nQueens;i++){
    			coordinate[row]=i;
    			if(isValid(coordinate,row)){
    				helper(list, nQueens, row+1, coordinate);
    			}
    		}
    	}
    }
    
    public static boolean isValid(int[] coordinate, int row){
    	for(int i=0;i<row;i++){
    		if(coordinate[i]==coordinate[row]||Math.abs(coordinate[row]-coordinate[i])==row-i){
    			return false;
    		}
    	}
    	return true;
    }
}
