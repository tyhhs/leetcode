
public class Same_Tree {

	/**
	 * Given two binary trees, write a function to check if they are equal or
	 * not.
	 * 
	 * Two binary trees are considered equal if they are structurally identical
	 * and the nodes have the same value.
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
	 public static boolean isSameTree(TreeNode p, TreeNode q){
		 if(p==null&&q!=null){
			 return false;
		 }
		 if(p!=null&&q==null){
			 return false;
		 }
		 if(p!=null&&q!=null){
			 if(p.val!=q.val){
				 return false;
			 }
			 if(isSameTree(p.left,q.left)==false){
				 return false;
			 }
			 if(isSameTree(p.right,q.right)==false){
				 return false;
			 }
			
		 }
		 return true;
    }

}
