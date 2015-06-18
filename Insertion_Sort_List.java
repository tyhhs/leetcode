
public class Insertion_Sort_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={3,4,1};
		ListNode head=ListNode.buildList(num);
		ListNode.printList(head);
		head=insertionSortList(head);
		ListNode.printList(head);
	}

    public static ListNode insertionSortList(ListNode head) {
    	if(head==null){
    		return null;
    	}
    	ListNode sortList=head;
    	ListNode insertNode=head.next;
    	sortList.next=null;
    	while(insertNode!=null){
    		ListNode pre=null;
    		ListNode current=sortList;
    		while(current!=null){
    			if(pre==null){
        			if(insertNode.val<=current.val){
        				ListNode temp=insertNode.next;
        				insertNode.next=current;
        				sortList=insertNode;
        				insertNode=temp;
        				break;
        			}
        			else if(current.next==null){
        				ListNode temp=insertNode.next;
        				current.next=insertNode;
        				insertNode.next=null;
        				insertNode=temp;
        				break;
        			}
        			else{
        				pre=current;
            			current=current.next;
            			continue;
        			}

    			}

    			if(insertNode.val>pre.val&&insertNode.val<=current.val){
    				ListNode temp=insertNode.next;
    				pre.next=insertNode;
    				insertNode.next=current;
    				insertNode=temp;
    				break;
    			}
    			if(current.next==null){
    				ListNode temp=insertNode.next;
    				current.next=insertNode;
    				insertNode.next=null;
    				insertNode=temp;
    				break;
    			}
    			pre=current;
    			current=current.next;    			
    		}
    	}
    	return sortList;
    }
}
