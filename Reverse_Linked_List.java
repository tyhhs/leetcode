import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;

public class Reverse_Linked_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 5 };
		ListNode list = ListNode.buildList(nums);
		ListNode.printList(list);
		list = new Reverse_Linked_List().reverseList(list);
		ListNode.printList(list);
	}

	// iterative
	/*
	 * public ListNode reverseList(ListNode head) { if(head==null){ return null;
	 * } if(head.next==null){ return head; } ListNode pre=head; ListNode
	 * curr=head.next; pre.next=null; ListNode temp; while(curr!=null){
	 * temp=curr.next; curr.next=pre; pre=curr; curr=temp; }
	 * 
	 * return pre;
	 * 
	 * }
	 */

	
/*	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		ListNode next;

		while (cur != null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;

		}
		return pre;

	}*/
	
	// Recursive
/*	public ListNode reverseList(ListNode head) {
		if(head==null||head.next==null){
			return head;
		}
		return help(head,null);
	}
	
	public ListNode help(ListNode curr,ListNode pre){
		if(curr==null){
			return pre;
		}
		ListNode next=curr.next;		
		curr.next=pre;
		return help(next, curr);
		
	}*/
	
	public ListNode reverseList(ListNode head) {
	    if (null == head || null == head.next) {
	        return head;
	    }
	    ListNode reversedHead = reverseList(head.next);
	    head.next.next = head;
	    head.next = null;
	    return reversedHead;
	}
}
