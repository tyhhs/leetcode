
public class Minimum_Depth_of_Binary_Tree {

	/**
	 * Given a binary tree, find its minimum depth.
	 * 
	 * The minimum depth is the number of nodes along the shortest path from the
	 * root node down to the nearest leaf node.
	 */
	
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	 public int minDepth(TreeNode root) {
	        if(root==null){
	        	return 0;
	        }
	        int left=minDepth(root.left);
	        int right=minDepth(root.right);
	        if(left==0){
	        	return right+1;
	        }
	        if(right==0){
	        	return left+1;
	        }
	        return left<right?left+1:right+1;
	    }

}
