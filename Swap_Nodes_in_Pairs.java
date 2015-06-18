public class Swap_Nodes_in_Pairs {

	/**
	 * Given a linked list, swap every two adjacent nodes and return its head.
	 * 
	 * For example, Given 1->2->3->4, you should return the list as 2->1->4->3.
	 * 
	 * Your algorithm should use only constant space. You may not modify the
	 * values in the list, only nodes itself can be changed.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vals = { 1,2 };
		ListNode list = ListNode.buildList(vals);
		ListNode.printList(list);
		ListNode.printList(swapPairs(list));
	}
	
    public static ListNode swapPairs(ListNode head) {
        if(head==null){
        	return null;
        }
        ListNode start=new ListNode(0);
    	start.next=head;
    	ListNode pointer=start;
    	ListNode left=head;
    	ListNode right=head.next;
    	
    	while(right!=null){
    		left.next=right.next;
    		right.next=left;
    		pointer.next=right;
    		
    		pointer=left;
    		left=left.next;
    		if(left==null){
    			break;
    		}
    		right=left.next;
    		
    	}


    	return start.next;
    }
}
