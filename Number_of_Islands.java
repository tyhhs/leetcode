
public class Number_of_Islands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid={
				{'1','0','1','1','1'},
				{'1','0','1','0','1'},
				{'1','1','1','0','1'}
				//{'0','0','0','1','1'}
				
		};
		Number_of_Islands number_of_Islands=new Number_of_Islands();
		System.out.println(number_of_Islands.numIslands(grid));
	}
	
    public int numIslands(char[][] grid) {
    	int row=grid.length;
    	if(row==0){
    		return 0;
    	}
    	int col=grid[0].length;
    	if(col==0){
    		return 0;
    	}
    	int islands=0;
    	for(int i=0;i<row;i++){
    		for(int j=0;j<col;j++){
    			if(grid[i][j]=='1'){
    				islands++;
    				search(i, j, grid);
    			}
    		}
    	}
    	return islands;
    }
    
    void search(int row, int col, char[][] grid){
    	if(grid[row][col]=='1'){
    		grid[row][col]='2';//marked as searched
    		if(row<grid.length-1){
        		search(row+1, col, grid);
        	}
    		if(col<grid[0].length-1){
    			search(row, col+1, grid);
    		}
    		if(col>0){
    		    search(row,col-1,grid);
    		}
    		if(row>0){
    			search(row-1, col, grid);
    		}
    		else{
    			return;
    		}
    	}
    	else{
    		return;
    	}   	
    }

}
