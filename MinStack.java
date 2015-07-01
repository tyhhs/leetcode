import java.util.Stack;


public class MinStack {

	/**
	 * the minStack always keep the current min value on the top of it
	 * if the new element pushed into the stack is less than the top of minStack, it'll be inserted into the minStack
	 * otherwise, ignore it, because it'll be popped out of the stack before current min value
	 */
	private Stack<Integer> stack=new Stack<Integer>();
	private Stack<Integer> minStack=new Stack<Integer>();
	
    public void push(int x) {
        if(minStack.isEmpty()||minStack.peek()>=x){
        	minStack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if(minStack.peek().equals(stack.peek())){
        	minStack.pop();
        }
        stack.pop();
    }

    public int top() {
    	return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
