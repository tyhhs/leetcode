
public class Binary_Tree_Maximum_Path_Sum {

	/**
	 * @param args
	 */
	int max;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        nodeMax(root);
        return max;
    }
    
    int nodeMax(TreeNode root){
    	if(root==null){//base case
    		return 0;
    	}
    	//max sum of left sum, if less than 0, set it as 0
    	int left=Math.max(0, nodeMax(root.left));
    	int right=Math.max(0, nodeMax(root.right));
    	//compare current max value to max value of path which through current node, renew max
    	max=Math.max(max, left+right+root.val);
    	//return the max path value from this node
    	return Math.max(root.val+left, root.val+right);
    }

}
