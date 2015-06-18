import java.util.Stack;


public class Flatten_Binary_Tree_to_Linked_List {

	
	public static void main(String[] args) {
    	int[] input={1,2,5,3,4,6};
    	TreeNode root=TreeNode.createTree(input);
    	flatten(root);
    	TreeNode.show_preorder(root);
    	System.out.println();
    	TreeNode.show_right(root);
	}
	
    public static void flatten(TreeNode root) {
        Stack<TreeNode> stack=new Stack<TreeNode>();
        TreeNode currentNode=null;
        if(root==null){
        	return;
        }
        stack.push(root);
        while(!stack.empty()){
        	TreeNode temp=stack.pop();
        	if(temp!=null){
	        	if(currentNode==null){
	        		currentNode=root;
	        	}
	        	else{
	        		currentNode.right=temp;
	        		currentNode=currentNode.right;
	        	}
	        	
	        	stack.push(temp.right);
	        	stack.push(temp.left);
	        	currentNode.left=null;
        	}
        }
    }
}
