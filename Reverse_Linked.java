
public class Reverse_Linked {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,2,3,4,5};
		int m=2;
		int n=4;
		ListNode head=ListNode.buildList(num);
		ListNode.printList(head);
		head=reverseBetween(head, m, n);
		ListNode.printList(head);
	}
	
    public static ListNode reverseBetween(ListNode head, int m, int n) {
    	ListNode pre=null;
    	ListNode start=head;
    	ListNode end=null;
    	if(m>1){
    		for(int i=1;i<m;i++){
    			pre=start;
    			start=start.next;
    		}
    	}
    	ListNode pointer=start;
    	ListNode next=start.next;
    	end=start.next;
    	for(int i=m;i<n;i++){
    		end=next.next;
    		next.next=pointer;
    		pointer=next;
    		next=end;
    	}
    	if(pre==null){
    		start.next=end;
    		return pointer;
    	}
    	pre.next=pointer;
    	start.next=end;
    	return head;
    }
    

}
