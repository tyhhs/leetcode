
public class Add_Two_Numbers {

	/**
	 * You are given two linked lists representing two non-negative numbers. The
	 * digits are stored in reverse order and each of their nodes contain a
	 * single digit. Add the two numbers and return it as a linked list.
	 * 
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(2);
		insert(l1,4);
		insert(l1,3);
		printList(l1);
		ListNode l2=new ListNode(5);
		insert(l2,6);
		insert(l2,4);
		printList(l2);
		ListNode sum=addTwoNumbers(l1,l2);
		printList(sum);
		
	}


	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
/*        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;*/
        ListNode c1=l1;
        ListNode c2=l2;
        ListNode nodeSum = new ListNode(0);
        ListNode digital =nodeSum;
        int sum=0;
        while(c1!=null||c2!=null){
        	sum=sum/10;
        	if(c1!=null){
        		sum+=c1.val;
        		c1=c1.next;
        	}
        	if(c2!=null){
        		sum+=c2.val;
        		c2=c2.next;
        	}
        	digital.next=new ListNode(sum%10);	
        	digital=digital.next;
        }
        if(sum/10==1){
        	digital.next=new ListNode(1);
        }
        return nodeSum.next;
	}
	
	public static void insert(ListNode head,int x){
		ListNode newNode=new ListNode(x);
		while(head.next!=null){
			head=head.next;
		}
		head.next=newNode;
	}
	public static void printList(ListNode head){
		if(head==null){
			System.out.println("null");
		}
		while(head.next!=null){
			System.out.print(head.val+"->");
			head=head.next;
		}
		System.out.println(head.val);
	}

}



