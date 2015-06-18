import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Binary_Tree_Right_Side_View {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={1,2,3,4};
		TreeNode tree=TreeNode.createTree(input);
		List<Integer> list=rightSideView(tree);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

    public static List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<Integer> list=new ArrayList<Integer>();
        TreeNode flag=new TreeNode(999);
        if(root==null){
        	return list;
        }
        queue.offer(root);
        queue.offer(flag);
        list.add(root.val);
        while(!queue.isEmpty()){
        	TreeNode temp=queue.poll();
        	if(temp.val==999){
        		if(!queue.isEmpty()){
        			TreeNode levelRight=queue.poll();
        			queue.offer(flag);
        			list.add(levelRight.val);
        			if(levelRight.right!=null){
        				queue.offer(levelRight.right);
        			}
        			if(levelRight.left!=null){
        				queue.offer(levelRight.left);
        			}
        		}
        		continue;
        	}
        	if(temp.right!=null){
        		queue.offer(temp.right);
        	}
        	if(temp.left!=null){
        		queue.offer(temp.left);
        	}
        }
        return list;
    }
}
