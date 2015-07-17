import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class Basic_Calculator_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic_Calculator_II calculator=new Basic_Calculator_II();
		System.out.println(calculator.calculate("1+((2+3)*4)-5"));
		//calculator.infixToPostfix("1+((2+3)×4)-5");
	}
	
	int priority(char op){
		switch(op){
		case '+':
			return 1;
		case '-':
			return 1;
		case '*':
			return 2;
		case '/':
			return 2;
		default:
			return 0;
		}
	}
	
	//infix to postfix
	List<Object> infixToPostfix(String s){
		Stack<Character> operators=new Stack<Character>();
		List<Object> result=new LinkedList<Object>();
		int number=0;
		boolean hasNumber=false;
		//scan the string
		for(char c:s.toCharArray()){
			if(c>='0'&&c<='9'){//number
				number=number*10+c-'0';
				hasNumber=true;
			}
			else{//symbol
				if(hasNumber){
					result.add(number);
					number=0;
					hasNumber=false;
				}
				if(c==' '||c=='\t'){
					continue;
				}
				else if(c=='('){
					operators.push(c);
				}
				else if(c==')'){
					while(operators.peek()!='('){
						result.add(operators.pop());
					}
					operators.pop();
				}
				else{//operator
					while(true){
						if(operators.isEmpty()||operators.peek()=='('){
							operators.push(c);
							break;
						}
						else if(priority(c)>priority(operators.peek())){
							operators.push(c);
							break;
						}
						else{
							result.add(operators.pop());
						}
					}
				}
			}
		}
		if(hasNumber){
			result.add(number);
		}
		
		while(!operators.isEmpty()){
			result.add(operators.pop());
		}
		
		return result;
	}
	
	int processPostfix(List<Object> postfix){
		Stack<Integer> helper=new Stack<Integer>();
		for (Object O:postfix){
			if(O instanceof Integer){
				helper.push((Integer)O);
			}
			else{
				int operand1=helper.pop();
				int operand2=helper.pop();
				helper.push(calculateTwo(operand1, operand2, (Character)O));
			}
		}
		return helper.pop();
	}
	
	int calculateTwo(int operand1,int operand2,char operator){
		switch (operator) {
		case '+':	
			return operand1+operand2;
		case '-':
			return operand2-operand1;
		case '*':
			return operand1*operand2;
		case '/':
			return operand2/operand1;
		default:
			return 0;
		}
	}
	public int calculate(String s) {
		return processPostfix(infixToPostfix(s));
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
