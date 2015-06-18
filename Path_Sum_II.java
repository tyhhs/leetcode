import java.util.ArrayList;
import java.util.List;


public class Path_Sum_II {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={-2,0,-3};
		TreeNode root=TreeNode.createTree(input);
		//TreeNode.show_preorder(root);
		int sum=-5;
		TreeNode tree=new TreeNode(1);
		List<List<Integer>> res=pathSum(root, sum);
		System.out.println("#"+res.size());
		for (int i = 0; i < res.size(); i++) {
			for (int j = 0; j < res.get(i).size(); j++) {
				System.out.print(res.get(i).get(j));
			}
			System.out.println();
		}
	}

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> list=new ArrayList<List<Integer>>();
    	if(root==null){
    		return list;
    	}
    	List<Integer> item=new ArrayList<Integer>();
    	helper(root,sum,list,item);
    	return list;
    }
 
    public static void helper(TreeNode node,int target,List<List<Integer>> list,List<Integer> item){
    	if(node.val==target&&node.left==null&&node.right==null){
    		item.add(node.val);
    		list.add(item);
    	}

    	if(node.left!=null){
    		List<Integer> leftWay=new ArrayList<Integer>();
    		leftWay.addAll(item);
    		leftWay.add(node.val);
    		helper(node.left, target-node.val,list,leftWay);
    	}
    	if(node.right!=null){
    		List<Integer> rightWay=new ArrayList<Integer>();
    		rightWay.addAll(item);
    		rightWay.add(node.val);
    		helper(node.right, target-node.val, list, rightWay);
    	}
    }
}
