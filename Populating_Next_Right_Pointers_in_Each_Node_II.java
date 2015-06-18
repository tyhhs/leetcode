
public class Populating_Next_Right_Pointers_in_Each_Node_II {

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
        TreeLinkNode head=root;//The left most node in the lower level
        TreeLinkNode prev=null;//The previous node in the lower level
        TreeLinkNode curr=null;//The current node in the upper level
        while(head!=null){
        	curr=head;
        	head=null;
        	prev=null;
        	while(curr!=null){
        		if(curr.left!=null){
        			if(prev!=null){
        				prev.next=curr.left;
        				prev=curr.left;
        			}
        			else{
        				prev=curr.left;
        				head=curr.left;
        			}
        		}
        		if(curr.right!=null){
        			if(prev!=null){
        				prev.next=curr.right;
        				prev=curr.right;
        			}
        			else{
        				prev=curr.right;
        				head=curr.right;
        			}
        		}
        		curr=curr.next;
        	}
        }
    }
}
