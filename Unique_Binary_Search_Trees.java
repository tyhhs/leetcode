import java.util.Vector;

public class Unique_Binary_Search_Trees {

	/**
	 * Given n, how many structurally unique BST's (binary search trees) that
	 * store values 1...n?
	 * 
	 * For example, Given n = 3, there are a total of 5 unique BST's.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTrees(5));
	}
	
/*	dynamic programming
	dp[0]=1
	dp[1]=1
	dp[2]=d[0]d[1]+d[1]d[0];(possible combinations of left tree times possible combinations of right tree)
	dp[i]=d[0][i-1-0]+d[1]d[i-1-1]+....+d[i-1]d[0]*/
/*	public static int numTrees(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int num = 0;
		for (int i = 0; i < n; i++) {
			num = num + numTrees(i) * numTrees(n - i - 1);
		}
		return num;
	}*/
	
	//not recursive solution,uses array to store numbers of trees of each tree
	//use 0...i trees to calculate i+1
	public static int numTrees(int n) {
		int[] trees=new int[n+1];
		trees[0]=1;
		trees[1]=1;
		for(int i=2;i<n+1;i++){
			for(int j=0;j<i;j++){
				trees[i]=trees[i]+trees[j]*trees[i-j-1];
			}
		}
		return trees[n];
	}
	

}
