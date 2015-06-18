public class Minimum_Path_Sum {

	/**
	 * Given a m x n grid filled with non-negative numbers, find a path from top
	 * left to bottom right which minimizes the sum of all numbers along its
	 * path.
	 * 
	 * Note: You can only move either down or right at any point in time.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] grid={{1,2,3,1},{4,5,6,1},{7,8,9,1},{99,99,99,99}};
		int[][] grid={{1,2},{1,1}};
		System.out.println(minPathSum(grid));
	}
/*	DP
 * Here is the idea:

		f[m][n] is a matrix store the min value of every location we can get.
		f[0][0] =grid[0][0], f[i][0]=f[i-1][0]+grid[i][0], f[0][j]=f[0][j-1]+grid[0][j]
		f[i][j]=min(f[i-1][j],f[i][j-1])+grid[i][j].
		at last return the f[m-1][n-1]*/
	public static int minPathSum(int[][] grid) {
		int m=grid.length;
    	int n=grid[0].length;
    	if(m==0||n==0){
    		return 0;
    	}
    	for(int i=1;i<m;i++){
    		grid[i][0]+=grid[i-1][0];
    	}
    	for(int i=1;i<n;i++){
    		grid[0][i]+=grid[0][i-1];
    	}
    	for(int i=1;i<m;i++){
    		for(int j=1;j<n;j++){
    			grid[i][j]+=grid[i][j]+grid[i-1][j]<grid[i][j]+grid[i][j-1]?grid[i-1][j]:grid[i][j-1];
    		}
    	}
    	return grid[m-1][n-1];
	}
/*	//use bellman_ford algorithm, it works, but time complexity is high
    public static int minPathSum(int[][] grid) {
        //use bellman_ford algorithm
    	int m=grid.length;
    	int n=grid[0].length;
    	if(m==0||n==0){
    		return 0;
    	}
    	//distance is the distance from source 
    	int[][] distance=new int[m][n];
    	for(int j=0;j<m;j++){
			for(int k=0;k<n;k++){
				distance[j][k]=99999;
			}
		}
    	distance[0][0]=grid[0][0];
    	//pi keep the predecessor of each node
    	//int[][] pi=new int[m][n];
    	for(int i=1;i<m*n-1;i++){
    		for(int j=0;j<m;j++){
    			for(int k=0;k<n;k++){
    				if(j+1<m){
    					if(distance[j+1][k]>distance[j][k]+grid[j+1][k]){
    						distance[j+1][k]=distance[j][k]+grid[j+1][k];
    					}
    				}
    				if(k+1<n){
    					if(distance[j][k+1]>distance[j][k]+grid[j][k+1]){
    						distance[j][k+1]=distance[j][k]+grid[j][k+1];
    					}
    				}
    				
    			}
    		}
    	}
    	return distance[m-1][n-1];
    	
    }	*/
}
