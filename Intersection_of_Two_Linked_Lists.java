				
public class Intersection_of_Two_Linked_Lists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
		if(headA==null||headB==null){
			return null;
		}
		//calculate the sum and length of list A
		int sumA=0;
		int lengthA=0;
		ListNode pointA=headA;
		while(pointA!=null){
			sumA+=pointA.val;
			lengthA++;
			pointA=pointA.next;
		}
		
		//add 1 to each node of listB
		ListNode pointB=headB;
		while(pointB!=null){
			pointB.val++;
			pointB=pointB.next;
		}
		
		//recalculate the sum of the new listA
		int sumA2=0;
		ListNode pointA2=headA;
		while(pointA2!=null){
			sumA2+=pointA2.val;
			pointA2=pointA2.next;
		}
		
		//recover the original structrue
		pointB=headB;
		while(pointB!=null){
			pointB.val-=1;	
			pointB=pointB.next;
		}
		
		if(sumA==sumA2){
			return null;
		}
		else{
			int overlap=sumA2-sumA;
			int start=lengthA-overlap;
			ListNode start_point=headA;
			for(int i=0;i<start;i++){
				start_point=start_point.next;
			}
			return start_point;
		}
	}

}
