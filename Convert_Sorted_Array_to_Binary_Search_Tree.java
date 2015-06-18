import java.util.ArrayList;
import java.util.List;


public class Convert_Sorted_Array_to_Binary_Search_Tree {

	/**
	 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,2,3,4,5,6,7,8};
		printTree(sortedArrayToBST(num));
/*		TreeNode rootNode=new TreeNode(0);
		rootNode.left=new TreeNode(1);
		rootNode.right=new TreeNode(2);
		printTree(rootNode);*/
	}
    public static TreeNode sortedArrayToBST(int[] num) {
    	if(num.length==0){
    		return null;
    	}
    	int low= 0;
    	int high=num.length-1;
    	TreeNode root=new TreeNode(0);
    	root=buildBST(num, low, high);
    	return root;
    }
    public static TreeNode buildBST(int[] num,int low, int high){
    	if(low<=high){
    		int mid=(low+high)/2;
    		TreeNode root=new TreeNode(num[mid]);
        	root.left=buildBST(num, low, mid-1);
        	root.right=buildBST(num, mid+1, high);
        	return root;
    	}
    	else{
    		return null;
    	}

    }
    
    
	public static void printTree(TreeNode tree){
		if(tree!=null){
			System.out.print(tree.val);
		}
		else{
			return;
		}
		//System.out.println();
		printTree(tree.left);
		printTree(tree.right);
		
	}
	public static TreeNode buildTree(int[] input){
		List<TreeNode> list=new ArrayList<TreeNode>();
		TreeNode tree=new TreeNode(0);
		int i=1;
		if(input[0]==0){
			return tree;
		}
		else{
			tree.val=input[0];
			//using list as a queue, enqueue this treenode
			list.add(tree);
			while(i<input.length){
				TreeNode node=list.remove(0);
				//insert left
				if(input[i]==0){
					i++;
				}else{
					TreeNode l=new TreeNode(input[i]);
					node.left=l;
					list.add(l);
					i++;
				}
				//insert right
				if(i<input.length){
					if(input[i]==0){
						i++;
					}else{
						TreeNode r=new TreeNode(input[i]);
						node.right=r;
						list.add(r);
						i++;
					}
				}
			}
		}	
		return tree;
	}
}
