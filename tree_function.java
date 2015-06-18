import java.util.*;

public class tree_function {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]input={1,0,2,3};
		TreeNode tree=buildTree(input);
		
		printTree(tree);
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
	
	public static void printTree(TreeNode tree){
		if(tree!=null){
			System.out.println(tree.val);
		}
		else{
			return;
		}
		printTree(tree.left);
		printTree(tree.right);
	}
		
		
}
