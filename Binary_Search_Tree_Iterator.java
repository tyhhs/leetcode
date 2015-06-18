import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.RootPaneContainer;

import org.omg.CORBA.PUBLIC_MEMBER;



public class Binary_Search_Tree_Iterator {

	 public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
     Queue<Integer> queue=new LinkedList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public Binary_Search_Tree_Iterator(TreeNode root) {

    	inorder(root);
    }
    public void inorder(TreeNode root){
    	if(root==null){
    		return;
    	}
    	inorder(root.left);
    	queue.offer(root.val);
    	inorder(root.right);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
    	if(queue.isEmpty()){
    		return false;
    	}
    	else {
			return true;
		}
    }

    /** @return the next smallest number */
    public int next() {
        return queue.remove();
    }
    
    /**
     * Your BSTIterator will be called like this:
     * BSTIterator i = new BSTIterator(root);
     * while (i.hasNext()) v[f()] = i.next();
     */
}
