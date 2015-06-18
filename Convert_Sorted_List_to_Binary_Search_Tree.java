
public class Convert_Sorted_List_to_Binary_Search_Tree {

	/**
	 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; next = null; }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
        	return null;
        }
        int count=0;
        ListNode curr=head;
        while(curr!=null){
        	count++;
        	curr=curr.next;
        }
        int[] array=new int[count];
        curr=head;
        for(int i=0;i<count;i++){
        	array[i]=curr.val;
        	curr=curr.next;
        }
        int low=0;
        int high=count-1;
        TreeNode BST=buildBST(array, low, high);
        return BST;
    }
    public static TreeNode buildBST(int[] num,int low, int high){
    	if(low<=high){
    		int mid=(low+high)/2;
    		TreeNode root=new TreeNode(num[mid]);
        	root.left=buildBST(num, low, mid-1);
        	root.right=buildBST(num, mid+1, high);
        	return root;
    	}
    	else{
    		return null;
    	}

    }
}
