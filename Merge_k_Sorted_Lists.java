import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Merge_k_Sorted_Lists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list1={1,4,7,10};
		int[] list2={2,5,8,11};
		int[] list3={3,6,9,12,15};
		ListNode[] lists=new ListNode[3];
		lists[0]=ListNode.buildList(list1);
		lists[1]=ListNode.buildList(list2);
		lists[2]=ListNode.buildList(list3);
		ListNode list=new Merge_k_Sorted_Lists().mergeKLists(lists);
		ListNode.printList(list);
	}
	
	//brute force method, time exceeded
/*    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
        	return null;
        }
        if(lists.length==1){
        	return lists[0];
        }
        ListNode res=new ListNode(0);
        ListNode temp=lists[0];
    	for(int i=1;i<lists.length;i++){
        	res=mergeTwoLists(temp, lists[i]);
        	temp=res;
        }
    	return res;
    }*/
    
    //simulate binary merge using queue
	public ListNode mergeKLists(ListNode[] lists) {
		Queue<ListNode> queue=new LinkedList<ListNode>();
		for(ListNode list:lists){
			queue.offer(list);
		}
		
		while(queue.size()>1){
			ListNode list1=queue.poll();
			ListNode list2=queue.poll();
			ListNode res=mergeTwoLists(list1, list2);
			queue.offer(res);
		}
		
		return queue.peek();

	}
    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
    	ListNode res=new ListNode(0);
    	ListNode pointer=res;
    	while(list1!=null&&list2!=null){
    		if(list1.val>list2.val){
    			pointer.next=list2;
    			pointer=pointer.next;
    			list2=list2.next;
    		}
    		else{
    			pointer.next=list1;
    			pointer=pointer.next;
    			list1=list1.next;
    		}
    	}
    	if(list1!=null){
    		pointer.next=list1;
    	}
    	else if(list2!=null){
    		pointer.next=list2;
    	}
    	return res.next;
    }

}
