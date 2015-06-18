
public class ListNode {
	
	/**
	 * @param args
	 */
	int val;
	ListNode next;
	ListNode(int x){
		val =x;
		next=null;
	}
	
	public static ListNode buildList(int[] num){
		if(num.length==0){
			return null;
		}
		ListNode list=new ListNode(num[0]);
		ListNode pointer=list;
		for(int i=1;i<num.length;i++){
			ListNode add=new ListNode(num[i]);
			pointer.next=add;
			pointer=pointer.next;
		}
		return list;
	}
	
	public static void printList(ListNode head){
		if(head==null){
			System.out.println("null");
			return;
		}
		System.out.print(head.val+"->");
		printList(head.next);
	}


}
