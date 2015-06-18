
public class Unique_Paths_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int obstacleGrid[][]={{0,0,0,0},{0,0,1,0},{0,0,0,0},{0,0,0,0}};
		int obstacleGrid[][]={{1},{0}};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}
	
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //cause a robot can only move down and right, initial the first row and column
    	
    	int x=obstacleGrid[0].length;
    	int y=obstacleGrid.length;
    	if(x>0&&y>0){
	    	for(int i=0;i<x;i++){
	    		if(obstacleGrid[0][i]!=1){
	    			obstacleGrid[0][i]=1;
	    		}
	    		else{
	    			for(int j=i;j<x;j++){
	    				obstacleGrid[0][j]=0;
	    			}
	    			i=x;
	    		} 		
	    	}
	    	
	    	for(int i=1;i<y;i++){
	    		if(obstacleGrid[i][0]!=1&&obstacleGrid[i-1][0]!=0){
	    			obstacleGrid[i][0]=1;
	    		}
	    		else{
	    			for(int j=i;j<y;j++){
	    				obstacleGrid[j][0]=0;
	    			}
	    			i=y;
	    		}
	    	}
	    	for(int i=1;i<y;i++){
	    		for(int j=1;j<x;j++){
	    			if(obstacleGrid[i][j]!=1){
	    				obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
	    			}
	    			else{
	    				obstacleGrid[i][j]=0;
	    			}
	    		}
	    	}
	    	return obstacleGrid[y-1][x-1];
    	}
    	else{
    		return 0;
    	}
    }

}
