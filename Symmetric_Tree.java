import java.util.Stack;


public class Symmetric_Tree {

	/**
	 * @param args
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
	
    public static boolean isSymmetric(TreeNode root) {
    	if(root==null)
    		return true;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root.left);
        stack.push(root.right);
      
        while(!stack.isEmpty()){
        	TreeNode n1=stack.pop();
        	TreeNode n2=stack.pop();
        	if(n1==null&&n2==null)
        		continue;
        	if(n1==null||n2==null)
        		return false;
        	if(n1.val!=n2.val)
        		return false;
        	stack.push(n1.left);
        	stack.push(n2.right);
        	stack.push(n1.right);
        	stack.push(n2.left);
        }
        return true;
    }

}
