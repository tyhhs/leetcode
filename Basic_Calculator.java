import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Basic_Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("    dwidw    dwdwf  ".);
		System.out.println(new Basic_Calculator()
				.calculate("(11+11)"));
	}
	
	public int calculate(String s){
		Stack<Integer> stack=new Stack<Integer>();
		int num=0;//current number
		int res=0;//current result
		int sign=1;//1 for +, -1 for -
		for(char c:s.toCharArray()){
			if(c>='0'&&c<='9'){//obtain current operand until operator
				num=num*10+c-'0';
			}
			else if(c=='+'){
				res+=(sign*num);//calculate current operator with previous result
				sign=1;//set sign
				num=0;
			}
			else if(c=='-'){
				res+=(sign*num);
				sign=-1;
				num=0;
			}
			else if(c=='('){
				stack.push(res);
				stack.push(sign);
				res=0;
				sign=1;
			}
			else if(c==')'){
				res+=(sign*num);
				res*=stack.pop();//get sign
				res+=stack.pop();//get previous operand
				num=0;
			}
		}
		if(num!=0){
			res+=(sign*num);
		}
		return res;
	}

/*	public int rank(char op) {
		// the bigger the number, the higher the rank
		switch (op) {
		case '+':
			return 1;
		case '-':
			return 1;
		case '*':
			return 2;
		case '/':
			return 2;
		default:
			return 0; // '('
		}
	}

	public List<Object> infixToPostfix(String s) {
		Stack<Character> operators = new Stack<Character>();
		List<Object> postfix = new LinkedList<Object>();
		int numberBuffer = 0;
		boolean bufferingOperand = false;
		for (char c : s.toCharArray()) {
			if (c >= '0' && c <= '9') {
				numberBuffer = numberBuffer * 10 + c - '0';
				bufferingOperand = true;
			} else {
				if (bufferingOperand)
					postfix.add(numberBuffer);
				numberBuffer = 0;
				bufferingOperand = false;
				if (c == ' ' || c == '\t')
					continue;
				if (c == '(') {
					operators.push('(');
				} else if (c == ')') {
					while (operators.peek() != '(')
						postfix.add(operators.pop());
					operators.pop(); // popping "("
				} else { // operator
					while (!operators.isEmpty()
							&& rank(c) <= rank(operators.peek()))
						postfix.add(operators.pop());
					operators.push(c);
				}
			}
		}
		if (bufferingOperand)
			postfix.add(numberBuffer);
		while (!operators.isEmpty())
			postfix.add(operators.pop());
		return postfix;
	}

	public  int evaluatePostfix(List<Object> postfix) {
		Stack<Integer> operands = new Stack<Integer>();
		int a = 0, b = 0;
		for (Object s : postfix) {
			if (s instanceof Character) {
				char c = (Character) s;
				b = operands.pop();
				a = operands.pop();
				switch (c) {
				case '+':
					operands.push(a + b);
					break;
				case '-':
					operands.push(a - b);
					break;
				case '*':
					operands.push(a * b);
					break;
				default:
					operands.push(a / b);
				}
			} else { // instanceof Integer
				operands.push((Integer) s);
			}
		}
		return operands.pop();
	}

	public int calculate(String s) {
		return evaluatePostfix(infixToPostfix(s));
	}*/


}
