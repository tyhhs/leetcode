
public class Invert_Binary_Tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={1,2,3,4,5,6,7};
		TreeNode tree=tree_function.buildTree(input);
		TreeNode.show_preorder(tree);
		System.out.println();
		tree=new Invert_Binary_Tree().invertTree(tree);
		TreeNode.show_preorder(tree);
	}
	//first
/*    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        if(root.right!=null&&root.left!=null){
        	TreeNode temp=root.right;
        	root.right=root.left;
        	root.left=temp;
        	
        }
        else if(root.right!=null){
        	root.left=root.right;
        	root.right=null;
        }
        else if(root.left!=null){
        	root.right=root.left;
        	root.left=null;
        }
        else{
        	return root;
        }
        root.left=invertTree(root.left);
        root.right=invertTree(root.right);
    	return root;
    }*/
	
	//second
	public TreeNode invertTree(TreeNode root) {
		if(root!=null){
			TreeNode tempNode=root.right;
        	root.right=root.left;
        	root.left=tempNode;
        	invertTree(root.right);
        	invertTree(root.left);
		}
		return root;
	}

}
