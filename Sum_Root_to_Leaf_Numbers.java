public class Sum_Root_to_Leaf_Numbers {

	 public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
    public static int sumNumbers(TreeNode root) {
    	return sumNumbersHelper(root, 0);
    }
    public static int sumNumbersHelper(TreeNode root,int path) {
        if(root==null){
        	return 0;
        }
        path=10*path+root.val;
        
        if(root.left==null&&root.right==null){
        	return path;
        }
        
        return sumNumbersHelper(root.left,path)+sumNumbersHelper(root.right,path);
    }
}
