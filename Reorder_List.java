
public class Reorder_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,2,3,4};
		ListNode head=ListNode.buildList(num);
		ListNode.printList(head);
		Reorder_List reorder_List=new Reorder_List();
		//test reverse
/*		head=reorder_List.reverseLinkedList(head);
		ListNode.printList(head);*/
		//test reorder
		reorder_List.reorderList(head);
		ListNode.printList(head);
	}

    public void reorderList(ListNode head) {
    	//base case
    	if(head==null||head.next==null){
    		return;
    	}
    	//find the middle's next node as reverse node
    	ListNode slow=head;
    	ListNode fast=head;
    	while(fast!=null&&fast.next!=null){
    		slow=slow.next;
    		fast=fast.next.next;
    	}
    	ListNode reverseHead=slow.next;
    	slow.next=null;
    	
    	//reverse the second part
    	reverseHead=reverseLinkedList(reverseHead);
    	
    	//reorder
    	ListNode pre=head;
    	ListNode curr=head.next;
    	while(reverseHead!=null){
    		ListNode temp=reverseHead.next;
    		pre.next=reverseHead;
    		reverseHead.next=curr;
    		pre=curr;
    		curr=curr.next;
    		reverseHead=temp;
    	}
    }
    
    public ListNode reverseLinkedList(ListNode list){
    	if(list==null||list.next==null){
    		return list;
    	}
    	ListNode pre=list;
    	ListNode curr=list.next;
    	pre.next=null;
    	while(curr!=null){
    		ListNode temp=curr.next;
    		curr.next=pre;
    		pre=curr;
    		curr=temp;
    	}
    	return pre;
    }
    
    
}
