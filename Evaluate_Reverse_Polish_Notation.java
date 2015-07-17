import java.util.Stack;


public class Evaluate_Reverse_Polish_Notation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = {"4", "13", "5", "/", "+"};
		System.out.println(new Evaluate_Reverse_Polish_Notation().evalRPN(tokens));
	}
	
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String s:tokens){
        	if(isOperator(s)){
        		int operand1 = stack.pop();
        		int operand2 = stack.pop();
        		stack.push(calculate(operand2,operand1,s));
        		
        	}
        	else{
        		stack.push(Integer.parseInt(s));
        	}
        }
    	return stack.peek();
    }
    
    int calculate(int a, int b, String op){
    	char operator = op.toCharArray()[0];
    	switch (operator) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			return a/b;
		default:
			return 0;
		}
    }
    
    boolean isOperator(String s){
    	if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
    		return true;
    	}
    	return false;
    }
}
