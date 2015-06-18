

public class Remove_Nth_Node_From_End_of_List {

	/**
	 * Given a linked list, remove the nth node from the end of list and return
	 * its head.
	 * 
	 * For example,
	 * 
	 * Given linked list: 1->2->3->4->5, and n = 2.
	 * 
	 * After removing the second node from the end, the linked list becomes
	 * 1->2->3->5. Note: Given n will always be valid. Try to do this in one
	 * pass.
	 */
	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	      ListNode(){
	    	  
	      }
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values={1,2};
		ListNode list=createList(values);
		printList(list);
		printList(removeNthFromEnd(list, 2));
	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null)
			return null;
		int length=0;
		ListNode pointer=head;
		while(pointer!=null){
			length++;
			pointer=pointer.next;
		}

		//System.out.println(length);
		int delete=length+1-n;
		
		if(delete==1){
			return head.next;
		}
		pointer=head;
		for(int i=1;i<delete-1;i++){
			pointer=pointer.next;
		}
		//System.out.println(pointer.val);
		ListNode previous=pointer;
		ListNode next=pointer.next.next;
		previous.next=next;
        return head;
    }
	public static ListNode createList(int[] vals){
		ListNode list=new ListNode(vals[0]);
		ListNode preNode=list;
		for(int i=1;i<vals.length;i++){
			ListNode insert=new ListNode(vals[i]);
			preNode.next=insert;
			preNode=insert;
		}

		return list;
	}
	
	public static void printList(ListNode list){
		if(list==null){
			System.out.println("null");
			return;
		}
		else
			System.out.print(list.val+"->");
		printList(list.next);
	}
}
