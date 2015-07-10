import java.util.LinkedList;
import java.util.Stack;

public class MyQueue {
	Stack<Integer> mainStack;
	Stack<Integer> helperStack;
	public MyQueue() {
		// TODO Auto-generated constructor stub
		mainStack=new Stack<Integer>();
		helperStack=new Stack<Integer>();
	}
    // Push element x to the back of queue.
    public void push(int x) {
        if(!mainStack.isEmpty()){
        	//element push to helper stack
        	while(!mainStack.isEmpty()){
        		helperStack.push(mainStack.pop());
        	}
        	//push the element
        	mainStack.push(x);
        	//push elements back
        	while(!helperStack.isEmpty()){
        		mainStack.push(helperStack.pop());
        	}
        }
        else{
        	mainStack.push(x);
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        mainStack.pop();
    }

    // Get the front element.
    public int peek() {
        return mainStack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return mainStack.isEmpty();
    }
}