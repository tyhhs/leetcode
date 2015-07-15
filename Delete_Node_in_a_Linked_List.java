
public class Delete_Node_in_a_Linked_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public void deleteNode(ListNode node) {
    	if(node == null){
    		return;
    	}
    	node.val = node.next.val;
    	node.next = node.next.next;
    }
}
