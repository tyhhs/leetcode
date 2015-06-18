public class Merge_Two_Sorted_Lists {

	/**
	 * Merge two sorted linked lists and return it as a new list. The new list
	 * should be made by splicing together the nodes of the first two lists.
	 */
	
	
	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	      ListNode(){
	    	  
	      }
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vals1={1,3,5,7,9,11};
		ListNode list1=createList(vals1);
		printList(list1);
		int[] vals2={2,4,6,8,10,12,14,16,18};
		ListNode list2=createList(vals2);
		printList(list2);
		printList(mergeTwoLists(list1,list2));
	}
	
	/*public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null&&l2==null){
			return null;
		}
		else if(l1==null){
			return l2;
		}
		else if(l2==null){
			return l1;
		}
		ListNode point1,point2,list,current;
		point1=l1;
		point2=l2;
		list=new ListNode(0);
		current=list;
		while(point1!=null&&point2!=null){
			if(point1.val>=point2.val){
				current.next=point2;
				point2=point2.next;
				current=current.next;
			}
			else if(point1.val<point2.val){
				current.next=point1;
				point1=point1.next;
				current=current.next;
				
			}
		}
		if(point1!=null){
			current.next=point1;
		}
		else if(point2!=null){
			current.next=point2;
		}
        return list.next;
    }	
*/	
	
	//recursive version
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1==null) return l2;
		if(l2==null) return l1;
		if(l1.val<=l2.val){
			l1.next=mergeTwoLists(l1.next,l2);
			return l1;
		}else{
			l2.next=mergeTwoLists(l1,l2.next);
			return l2;
		}
	}
	public static ListNode createList(int[] vals){
		ListNode list=new ListNode(vals[0]);
		ListNode preNode=list;
		for(int i=1;i<vals.length;i++){
			ListNode insert=new ListNode(vals[i]);
			preNode.next=insert;
			preNode=insert;
		}
		return list;
	}
	
	public static void printList(ListNode list){
		if(list==null){
			System.out.println("null");
			return;
		}
		else
			System.out.print(list.val+"->");
		printList(list.next);
	}

}
