import java.util.Stack;

public class Longest_Valid_Parentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()(()";
		System.out.println(new Longest_Valid_Parentheses()
				.longestValidParentheses(s));
	}

	/*
	 * The workflow of the solution is as below.
	 * 
	 * 1. Scan the string from beginning to end. If current character is '(', push
	 * its index to the stack. 
	 * 2. If current character is ')' and the character at
	 * the index of the top of stack is '(', we just find a matching pair so pop
	 * from the stack. Otherwise, we push the index of ')' to the stack. 
	 * 3. After the scan is done, the stack will only contain the indices of characters
	 * which cannot be matched. Then let's use the opposite side - substring
	 * between adjacent indices should be valid parentheses. 
	 * 4. If the stack is empty, the whole input string is valid. Otherwise, we can scan the stack
	 * to get longest valid substring as described in step 3.
	 */
	public int longestValidParentheses(String s) {
		if(s.length()<2){
			return 0;
		}
		char[] array=s.toCharArray();
		Stack<Integer> stack=new Stack<Integer>();
		for(int i = 0; i<array.length; i++){
			if(array[i]=='('){
				stack.push(i);
			}
			else{
				if(!stack.isEmpty()&&array[stack.peek()]=='('){
					stack.pop();
				}
				else{
					stack.push(i);
				}
			}
		}
		if(stack.isEmpty()){
			return s.length();
		}
		else{
			int max=0;
			int endIndex=s.length();
			while(!stack.isEmpty()){
				max=Math.max(max, endIndex-stack.peek()-1);
				endIndex=stack.pop();
			}
			max=Math.max(max, endIndex-0);
			return max;
		}

	}

}
