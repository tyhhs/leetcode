import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Binary_Tree_Zigzag_Level_Order_Traversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		TreeNode tree=TreeNode.createTree(input); 
		List<List<Integer>> res=zigzagLevelOrder(tree);
		System.out.println("#"+res.size());
		for (int i = 0; i < res.size(); i++) {
			for (int j = 0; j < res.get(i).size(); j++) {
				System.out.print(res.get(i).get(j));
			}
			System.out.println();
		}
	}
	
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(root==null){
        	return list;
        }
        Stack<TreeNode> leftToRightStack=new Stack<TreeNode>();
        Stack<TreeNode> rightToLeftStack=new Stack<TreeNode>();
        leftToRightStack.push(root);
        
        while(!leftToRightStack.empty()||!rightToLeftStack.empty()){
        	if(!leftToRightStack.empty()){
        		List<Integer> level=new ArrayList<Integer>();
            	while(!leftToRightStack.empty()){
            		TreeNode temp=leftToRightStack.pop();
            		level.add(temp.val);
            		if(temp.left!=null){
            			rightToLeftStack.push(temp.left);
            		}
            		if(temp.right!=null){
            			rightToLeftStack.push(temp.right);
            		}
            	}
            	list.add(level);
        	}
        	if(!rightToLeftStack.empty()){
        		List<Integer> level=new ArrayList<Integer>();
        		while(!rightToLeftStack.empty()){
        			TreeNode temp=rightToLeftStack.pop();
        			level.add(temp.val);
        			if(temp.right!=null){
        				leftToRightStack.push(temp.right);
        			}
        			if(temp.left!=null){
        				leftToRightStack.push(temp.left);
        			}
        		}
        		list.add(level);
        	}

        }
        return list;    
    }
}
