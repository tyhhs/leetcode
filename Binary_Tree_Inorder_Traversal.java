import java.util.ArrayList;
import java.util.List;


public class Binary_Tree_Inorder_Traversal {

	/**
	 * @param args
	 */
	public List<Integer> list=new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public List<Integer> inorderTraversal(TreeNode root) {
        
        inorder(root);
        return list;
    }
    public void inorder(TreeNode root){
    	if(root==null){
    		return;
    	}
    	inorder(root.left);
    	list.add(root.val);
    	inorder(root.right);
    }
}
