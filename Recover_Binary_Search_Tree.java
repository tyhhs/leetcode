
public class Recover_Binary_Search_Tree {

	/**
	 * @param args
	 */
    TreeNode pre;
    TreeNode node1;
    TreeNode node2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int[] nums={2,1,1};
		TreeNode treeNode=TreeNode.createTree(nums);
		treeNode.show_inorder(treeNode);*/
		TreeNode treeNode=new TreeNode(2);
		treeNode.right=new TreeNode(1);
		new Recover_Binary_Search_Tree().recoverTree(treeNode);
		TreeNode.show_inorder(treeNode);
		
	}
	
    public void recoverTree(TreeNode root) {
    	pre=null;
    	node1=null;
    	node2=null;
        helper(root);
        int temp=node1.val;
        node1.val=node2.val;
        node2.val=temp;
        System.out.println(node1.val);
        System.out.println(node2.val);
    }
    public void helper(TreeNode root){
    	if(root==null){
    		return;
    	}
    	if(root.left!=null){
    		helper(root.left);
    	}
    	if(pre!=null&&root.val<pre.val){
    		if(node1!=null){
    			node2=root;
    		}
    		else{
    			node1=pre;
    			node2=root;
    		}
    	}
    	pre=root;
    	if(root.right!=null){
    		helper(root.right);
    	}
    }

}
