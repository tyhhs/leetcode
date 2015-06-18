public class Linked_List_Cycle {

	/**
	 * Given a linked list, determine if it has a cycle in it.
	 * 
	 * Follow up: Can you solve it without using extra space?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list={1,2};
		ListNode listNode=ListNode.buildList(list);
		System.out.println(hasCycle(listNode));
	}
	
	/*		This is similar with CC150 question. You may try "fast runner and slow runner" solution. 
	Fast pointer runs 2 steps at a time and slow runner runs 1 step at a time. 
	They both start from beginning. 
	If faster runner catches slow runner some time, it means linked list has a circle.*/
	public static boolean hasCycle(ListNode head) {
		if(head==null){
			return false;
		}
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
				return true;
			}
		}
		return false;
		
	}
}
