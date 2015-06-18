public class Linked_List_Cycle_II {

	/**
	 * Given a linked list, return the node where the cycle begins. If there is
	 * no cycle, return null.
	 * 
	 * Follow up: Can you solve it without using extra space?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(3);
		ListNode second=new ListNode(2);
		head.next=second;
		head.next.next=new ListNode(0);
		head.next.next.next=new ListNode(-4);
		head.next.next.next.next=second;
		//head.next=head;
		System.out.println(detectCycle(head));
	}

	public static ListNode detectCycle(ListNode head) {
		if(head==null){
			return null;
		}
		ListNode slow=head; 
		ListNode fast=head;
		//start walk
		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			//they meet
			if(fast==slow){
				//set slow back to start point, fast stay
				slow=head;
				while(slow!=fast){
					//each time they move one step separately, finally they will meet at the start of the circle
					slow=slow.next;
					fast=fast.next;
				}
				return slow;
			}
		}
		return null;
	}

}
