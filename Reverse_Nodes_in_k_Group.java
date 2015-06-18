public class Reverse_Nodes_in_k_Group {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={1,2,3,4,5};
		int k=3;
		ListNode head=ListNode.buildList(input);
		ListNode.printList(head);
		ListNode reversed=reverseKGroup(head, k);
		ListNode.printList(reversed);
	}
	
    public static ListNode reverseKGroup(ListNode head, int k) {
    	ListNode current=head;
    	int count=0;
    	while(current!=null&&count!=k){//find if the k+1 node is existed
    		current=current.next;
    		count++;
    	}
    	if(count==k){//if the k+1 node is found
    		current=reverseKGroup(current, k);//reverse node k+1 to k+k
    		while(count>0){//reverse node 1 to k
    			ListNode temp=head.next;
    			head.next=current;
    			current=head;
    			head=temp;
    			count--;
    		}
    		head=current;
    	}
    	return head;
    }

}
