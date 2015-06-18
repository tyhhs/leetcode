import java.util.*;

public class Binary_Tree_Preorder_Traversal {

	/**
	 * Given a binary tree, return the preorder traversal of its nodes' values.

	For example:
	Given binary tree {1,#,2,3},
   		1
    	\
     	 2
    	/
   		3
		return [1,2,3].

		Note: Recursive solution is trivial, could you do it iteratively?
	 */
	//definition of the tree 
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> order=new ArrayList<Integer>();
		Stack<TreeNode> traversal=new Stack<TreeNode>();
		if(root==null){
			return order;
		}
		else{
			traversal.push(root);
			while(!traversal.empty()){
				TreeNode n=traversal.pop();
				if(n!=null){
					order.add(n.val);
					traversal.push(n.right);
					traversal.push(n.left);
				}
			}
		}
		return order;
		
    }

}
