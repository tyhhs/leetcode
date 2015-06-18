import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class MyStack {

	/**
	 * @param args
	 */
	public Queue<Integer> queue;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public MyStack(){
		this.queue=new LinkedList<Integer>();
	}
    // Push element x onto stack.
    public void push(int x) {
        queue.offer(x);
        //change to last insert element to the queue head
        //simulate the stack order
        for(int i=0; i<queue.size()-1;i++){
        	queue.offer(queue.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue.poll();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }

}
