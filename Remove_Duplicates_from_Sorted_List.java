public class Remove_Duplicates_from_Sorted_List {

	/**
	 * Given a sorted linked list, delete all duplicates such that each element
	 * appear only once.
	 * 
	 * For example, Given 1->1->2, return 1->2. Given 1->1->2->3->3, return
	 * 1->2->3.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vals = { 1, 1, 2, 2, 3, 4, 5 };
		ListNode list = ListNode.buildList(vals);
		ListNode nonduplicate=deleteDuplicates(list);
		ListNode.printList(nonduplicate);
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if(head==null){
			return null;
		}
		ListNode pointer=head;
		ListNode next=head.next;
		while(next!=null){
			if(next.val==pointer.val){
				pointer.next=pointer.next.next;
				next=next.next;
			}
			else{
				pointer=pointer.next;
				next=next.next;
			}
		}
		return head;
	}
}
