
public class Remove_Duplicates_from_Sorted_List_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,2,3,3,4,4,5,5};
		ListNode list=ListNode.buildList(num);
		ListNode res=deleteDuplicates(list);
		ListNode.printList(res);

	}
    public static ListNode deleteDuplicates(ListNode head) {
    	ListNode res=new ListNode(0);
    	res.next=head;
    	ListNode pre=res;
    	ListNode curr=head;
    	while(curr!=null&&curr.next!=null){
    		if(curr.val!=curr.next.val){
    			pre=pre.next;
    			curr=curr.next;
    		}
    		else{
    			int delete=curr.val;
    			while(curr!=null&&curr.val==delete){
    				curr=curr.next;
    			}
    			pre.next=curr;
    		}
    	}
    	return res.next;
    }
}
