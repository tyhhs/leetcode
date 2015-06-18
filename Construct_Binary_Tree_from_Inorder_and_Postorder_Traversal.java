import java.util.Arrays;


public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		int[] input={1,2,3,4,5,6,7};
		TreeNode tree=TreeNode.createTree(input);
		TreeNode.show_inorder(tree);
		System.out.println();
		TreeNode.show_postorder(tree);*/
		
		int[] inorder={4,2,5,1,6,3,7};
		int[] postorder={4,5,2,6,7,3,1};
		TreeNode tree=buildTree(inorder, postorder);
		TreeNode.show_inorder(tree);
	}

	
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
    	int len =postorder.length;
    	if(len==0){
    		return null;
    	}
        TreeNode tree=new TreeNode(postorder[len-1]);
        int breakpoint=0;
        for(int i=0;i<len;i++){
        	if(inorder[i]==postorder[len-1]){
        		breakpoint=i;
        		break;
        	}
        }
        int[] leftInorder=Arrays.copyOfRange(inorder, 0, breakpoint);
        int[] rightInorder=Arrays.copyOfRange(inorder, breakpoint+1, len);
        int[] leftPostorder=Arrays.copyOfRange(postorder, 0, breakpoint);
        int[] righrPostorder=Arrays.copyOfRange(postorder, breakpoint, len-1);
        
        tree.left=buildTree(leftInorder, leftPostorder);
        tree.right=buildTree(rightInorder, righrPostorder);
        
        return tree;
    }
}
