
public class Count_Complete_Tree_Nodes {

	/**
	 * @param args
	 */
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,5,6,7,8,9};
		TreeNode root = TreeNode.createTree(input);
		System.out.println(new Count_Complete_Tree_Nodes().countNodes(root));
	}
	
	
	public int countNodes(TreeNode root) {
		int h = getHeight(root);
		return h < 0 ? 0 :
				h==getHeight(root.right)+1?(1<<h)+countNodes(root.right):(1<<(h-1))+countNodes(root.left);
	}
	
	int getHeight(TreeNode root){
		return root==null?-1:1+getHeight(root.left);
	}
	//time limit exceeded
/*    public int countNodes(TreeNode root) {
        count = 0;
        if(root==null){
        	return count;
        }
        binarySearch(root);
        return count;
    }
    
    void binarySearch(TreeNode root){
    	if(root.left!= null){
    		binarySearch(root.left);
    	}
    	if(root.right!=null){
    		binarySearch(root.right);
    	}
    	count++;
    }*/
    

}
