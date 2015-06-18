import java.util.Stack;

/**
 * Created by tyhhs on 2014/10/30.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Valid_Parentheses {
    public static void main(String[] args){
    	String s="({(})[]";
    	System.out.println(isValid(s));
    	//System.out.println(']'-'[');
    	
    }
    public static boolean isValid(String s) {
        Stack check=new Stack();
        for(int i=0;i<s.length();i++){
        	if(check.empty()){
        		check.push(s.charAt(i));
        	}
        	else{
        		char top=(Character)check.peek();
        		if(0<s.charAt(i)-top&&s.charAt(i)-top<3){
        			check.pop();
        		}
        		else
        			check.push(s.charAt(i));
        	}
        }
        if(check.empty())
        	return true;
        else
        	return false;
    }
}
