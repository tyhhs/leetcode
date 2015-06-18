import java.util.Arrays;


public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder={1,2,4,5,3,6,7};
		int[] inorder={4,2,5,1,6,3,7};
		
		TreeNode node=buildTree(preorder, inorder);
		TreeNode.show_preorder(node);
	}
	
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
    	int len=preorder.length;
    	if(len==0){
    		return null;
    	}
    	TreeNode tree=new TreeNode(preorder[0]);
    	int rootIndex=0;
    	for (int i = 0; i < len; i++) {
			if(inorder[i]==preorder[0]){
				rootIndex=i;
				break;
			}
		}
    	int[] leftPre=Arrays.copyOfRange(preorder, 1, 1+rootIndex);
    	int[] rightPre=Arrays.copyOfRange(preorder, 1+rootIndex, len);
    	int[] leftIn=Arrays.copyOfRange(inorder, 0, rootIndex);
    	int[] rightIn=Arrays.copyOfRange(inorder, rootIndex+1, len);
    	tree.left=buildTree(leftPre, leftIn);
    	tree.right=buildTree(rightPre, rightIn);
    	return tree;
    }
    	
}
