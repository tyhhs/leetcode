import java.util.ArrayList;
import java.util.List;


public class Unique_Binary_Search_Trees_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static List<TreeNode> generateTrees(int n) {
    	return helper(1, n);
    }
    public static List<TreeNode> helper(int low, int high){
        List<TreeNode> list=new ArrayList<TreeNode>();
        if(low<high){
        	TreeNode node=null;
        	list.add(null);
        }
        for(int i=low;i<=high;i++){
        	List<TreeNode> left=helper(low, i-1);
        	List<TreeNode> right=helper(i+1, high);
        	for(int p=0;p<left.size();p++){
        		for(int q=0;q<right.size();q++){
        			TreeNode head=new TreeNode(i);
        			head.left=left.get(p);
        			head.right=right.get(q);
        			list.add(head);        					
        		}
        	}
        }
        return list;
    }
}
