import java.util.ArrayList;
import java.util.List;


public class Palindrome_Linked_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5,4,3,2,1};
		ListNode head=ListNode.buildList(num);
		System.out.println(new Palindrome_Linked_List().isPalindrome(head));
	}
	
	//force method, accept O(n) time , but use extra memory
/*    public boolean isPalindrome(ListNode head) {
    	if(head==null){
    		return true;
    	}
    	List<Integer> list=new ArrayList<Integer>();
    	while(head!=null){
    		list.add(head.val);
    		head=head.next;
    	}
    	int low=0;
    	int high = list.size()-1;
    	while (low<high){
    		int a=list.get(low);
    		int b = list.get(high);
    		if (a==b){
    			low++;
    			high--;
    		}
    		else{
    			return false;
    		}
    	}
    	return true;
    }*/
	
	
	//method two, find the center point, then reverse the second half of the list, compare two sections
	public boolean isPalindrome(ListNode head) {
		if(head==null||head.next==null){
			return true;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next!=null&&fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		slow=reverseList(slow.next);
		while(slow!=null){
			if(slow.val==head.val){
				slow=slow.next;
				head=head.next;
			}
			else{
				return false;
			}
		}
		return true;
	}
	
	public ListNode reverseList(ListNode head){
		if(head == null||head.next==null){
			return head;
		}
		ListNode pre = head;
		ListNode curr = head.next;
		pre.next=null;
		ListNode next;
		while(curr!=null){
			next=curr.next;
			curr.next=pre;
			pre=curr;
			curr=next;
		}
		return pre;
	}
	 
}
