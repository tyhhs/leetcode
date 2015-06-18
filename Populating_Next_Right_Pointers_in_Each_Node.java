
public class Populating_Next_Right_Pointers_in_Each_Node {

	/**
	 * @param args
	 */
    public class TreeLinkNode {
    	int val;
    	TreeLinkNode left, right, next;
    	TreeLinkNode(int x) { val = x; }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static void connect(TreeLinkNode root) {
        if(root==null||root.left==null){
        	return;
        }
        if(root.left!=null){
        	root.left.next=root.right;
        	if(root.next!=null){
        		root.right.next=root.next.left;
        	}
        	connect(root.left);
        	connect(root.right);
        }
        	
    }

}
