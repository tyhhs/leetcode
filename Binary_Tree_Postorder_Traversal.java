import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;



public class Binary_Tree_Postorder_Traversal {

	/**
	 * Given a binary tree, return the postorder traversal of its nodes' values.

	For example:
	Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
	return [3,2,1].

	Note: Recursive solution is trivial, could you do it iteratively?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree=new TreeNode(1);
		tree.left=new TreeNode(2);
		List<Integer> list=new ArrayList<Integer>();
		list=postorderTraversal(tree);
		
	}
	/*	pre-order traversal is root-left-right, and post order is left-right-root. modify the code for pre-order to make it root-right-left, and then reverse the output so that we can get left-right-root .

	Create an empty stack, Push root node to the stack.
	Do following while stack is not empty.

	2.1. pop an item from the stack and print it.

	2.2. push the left child of popped item to stack.

	2.3. push the right child of popped item to stack.

	reverse the ouput.*/
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        if(root==null){
        	return list;
        }
        else {
			stack.push(root);
		}
        while(!stack.isEmpty()){
        	TreeNode temp=stack.pop();
        	if(temp!=null){
        		list.add(temp.val);
        		stack.push(temp.left);
        		stack.push(temp.right);
        	}
        }
        Collections.reverse(list);
        return list;
    }

}
