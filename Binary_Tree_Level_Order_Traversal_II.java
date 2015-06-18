import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


/**
 * 
 *Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 *
 */
public class Binary_Tree_Level_Order_Traversal_II {
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
		int[]input={1};
		TreeNode tree=buildTree(input);
		//printTree(tree);
		List<List<Integer>> order=levelOrderBottom(tree);
		for(int i=0;i<order.size();i++){
			for(int j=0;j<order.get(i).size();j++){
				System.out.print(order.get(i).get(j));
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> order=new ArrayList<List<Integer>>();
		List<List<Integer>> bottom_order=new ArrayList<List<Integer>>();
		List<Integer> level=new ArrayList<Integer>();
		TreeNode flag=null;
		if(root==null){
			return order;
		}
		Vector<TreeNode> queue=new Vector<TreeNode>();
		level.add(root.val);
		order.add(level);
		level=new ArrayList<Integer>();
		queue.add(root);
		queue.add(flag);
		while(!queue.isEmpty()){
			TreeNode n=queue.remove(0);
			if(n!=null){
				if(n.left!=null){
					level.add(n.left.val);
					queue.add(n.left);
				}
				if(n.right!=null){
					level.add(n.right.val);
					queue.add(n.right);
				}
			}
			else{
				if(!level.isEmpty()){
					order.add(level);
					level=new ArrayList<Integer>();
				}
				if(!queue.isEmpty()){
					queue.add(n);
				}
				
			}
		}
		for(int i=order.size()-1;i>=0;i--){
		    bottom_order.add(order.get(i));
		}
		return bottom_order;
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
