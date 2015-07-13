
public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,1};
		TreeNode root = TreeNode.createTree(num);
		new Lowest_Common_Ancestor_of_a_Binary_Search_Tree().lowestCommonAncestor(root, new TreeNode(2), new TreeNode(1));
	}

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	int low = Math.min(p.val, q.val);
    	int high = Math.max(p.val,q.val);
    	return findLCA(root, low, high);
    }
    
    TreeNode findLCA(TreeNode root, int low, int high){
    	if(root.val==low||root.val==high){
    		return root;
    	}
    	else if(root.val>low&&root.val<high){
    		return root;
    	}
    	else if(root.val>high){
    		return findLCA(root.left, low, high);
    	}
    	else{
    		return findLCA(root.right, low, high);
    	}
    }
}
