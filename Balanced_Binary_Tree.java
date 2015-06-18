


public class Balanced_Binary_Tree {

	/**
	 * Given a binary tree, determine if it is height-balanced.
	 * 
	 * For this problem, a height-balanced binary tree is defined as a binary
	 * tree in which the depth of the two subtrees of every node never differ by
	 * more than 1.
	 */
	public static boolean res=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(2);
		root.left=new TreeNode(1);
		root.right=new TreeNode(3);
		//root.right.right=new TreeNode(3);
		System.out.println(isBalanced(root));
	}
	public static boolean isBalanced(TreeNode root) {
		isBalanced_helper(root);
		return res;
	}
	public static int isBalanced_helper(TreeNode root){
		if(root==null){
			return 0;
		}else{
			int left_height=isBalanced_helper(root.left);
			int right_height=isBalanced_helper(root.right);
			if(Math.abs(right_height-left_height)>1){
				res=false;
			}
			return Math.max(left_height, right_height)+1;
		}

		
	}
}
