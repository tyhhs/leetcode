public class Unique_Paths {

	/**
	 * A robot is located at the top-left corner of a m x n grid (marked 'Start'
	 * in the diagram below).
	 * 
	 * The robot can only move either down or right at any point in time. The
	 * robot is trying to reach the bottom-right corner of the grid (marked
	 * 'Finish' in the diagram below).
	 * 
	 * How many possible unique paths are there? Note: m and n will be at most
	 * 100.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePaths	(3,7));
	}
	//从左上角走到右下角，每次只能向下或者向右走一步，不管怎么走都需要m+n-2步才能走到，
	//而这其中有m-1步是向下走，有n-1是向右走，只用从这m+n-2个位置中选择m-1个位置，则剩余的位置表示向右走。容易求得值是Cm-1m+n-2,利用杨辉三角即可。
    public static int uniquePaths(int m, int n) {
        return combination(m + n - 2, n - 1);
    }
    
    private static int combination(int m, int n){
        if(n > m / 2)   return combination(m, m - n);
        else{
            double result = 1;
            for(int i = 1; i <= n; i++){
                result *= m - n + i;
                result /= i;
            }
            return (int)result;
        }
    }
    
		
	//由于只能往下或者往右走，因此(i, j)只会由(i - 1, j)或者(i, j - 1)到达。
	//假设，到达(i - 1, j)有f[i - 1, j]种走法，到达(i, j - 1)有f[i, j - 1]种走法，那么到达(i, j)有f[i, j] = f[i - 1, j] + f[i, j - 1]中走法。
/*	public static int uniquePaths(int m, int n) {
		int[][] matrix=new int[m][n];
		for(int i=0;i<m;i++){
			matrix[i][0]=1;
		}
		for(int i=0;i<n;i++){
			matrix[0][i]=1;
		}
		for(int i=1;i<n;i++){
			for(int j=1;j<m;j++){
				matrix[j][i]=matrix[j-1][i]+matrix[j][i-1];
			}
		}
		return matrix[m-1][n-1];
	}*/
}
