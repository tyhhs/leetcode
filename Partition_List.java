
public class Partition_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,4,3,2,5,2};
		ListNode head=ListNode.buildList(num);
		ListNode.printList(partition(head,3));
	}
	
    public static ListNode partition(ListNode head, int x) {
    	if(head==null){
    		return null;
    	}
    	ListNode lessListNode=new ListNode(0);
    	ListNode lessPointer=lessListNode;
    	ListNode greaterListNode=new ListNode(0);
    	ListNode greaterPointer=greaterListNode;
    	while(head!=null){
    		if(head.val<x){
    			ListNode temp=new ListNode(head.val);
    			lessPointer.next=temp;
    			lessPointer=lessPointer.next;
    		}
    		else{
    			ListNode temp=new ListNode(head.val);
    			greaterPointer.next=temp;
    			greaterPointer=greaterPointer.next;
    		}
    		head=head.next;
    	}
    	lessPointer.next=greaterListNode.next;
    	return lessListNode.next;
    }
}
