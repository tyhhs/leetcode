import java.util.ArrayList;


public class Validate_Binary_Search_Tree {

	/**
	 * @param args
	 */
	static int previous=Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] input={10,5,15,3,12,6,26};
		//TreeNode root=tree_function.buildTree(input);
		TreeNode root=new TreeNode(0);
		root.left=new TreeNode(-1);
		System.out.println(new Validate_Binary_Search_Tree().isValidBST(root));
	}

/*    public boolean isValidBST(TreeNode root) {
    	//use inorder traverse, if previous number is great than current, return false
    	if(root==null){
    		return true;
    	}
	
    	return inorderTraverse(root);

    }
    boolean inorderTraverse(TreeNode root){
    	boolean left=true;
    	boolean right=true;
    	if(root.left!=null){
    		left = inorderTraverse(root.left);
    	}
    	if(previous>=root.val){
    		return false;
    	}
    	else{
    		previous=root.val;
    	}
    	if(root.right!=null){
    		right=inorderTraverse(root.right);
    	}
    	
    	return left&&right;
    }*/
    
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> pre = new ArrayList<Integer>();
        pre.add(null);
        return helper(root, pre);
    }
    private boolean helper(TreeNode root, ArrayList<Integer> pre){
        if(root == null)
        return true;
        boolean left = helper(root.left,pre);
        if(pre.get(0)!=null && root.val<=pre.get(0))
        return false;
        pre.set(0,root.val);
        return left && helper(root.right,pre);
    }
    
}
