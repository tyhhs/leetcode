import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by Administrator on 2015/7/17.
 */
public class Simplify_Path {
    public static void main(String[] args) {
        //String path="/a/./b/../../c/";
        //String path = "/...";
    	//String path="///eHx/..";
    	String path = "/abc/...";
        String dir = new Simplify_Path().simplifyPath(path);
        System.out.print(dir);
    }
    //method 2
    public String simplifyPath(String path) {
    	Stack<String> stack = new Stack<String>();
    	Set<String> set = new HashSet<String>(Arrays.asList(".","..",""));
    	for(String dir:path.split("/")){
    		if(!set.contains(dir)){
    			stack.push(dir);
    		}
    		else if(dir.equals("..")&&!stack.isEmpty()){
    			stack.pop();
    		}
    	}
    	String res = "";
    	while(!stack.isEmpty()){
    		res = "/"+stack.pop() + res;
    	}
    	return res.equals("")?"/":res;
    }

    //method 1
/*    public String simplifyPath(String path) {
        Stack<String>  stack = new Stack<String>();
        StringBuilder dir = new StringBuilder();
        for(Character c: path.toCharArray()){
            if(c=='/'){
                if(dir.toString().equals("")){
                    continue;
                }
                else{
                    if(dir.toString().equals(".")){
                        dir = new StringBuilder();
                        continue;
                    }
                    else if(dir.toString().equals("..")){
                        if(!stack.isEmpty()){
                            stack.pop();
                            dir = new StringBuilder();
                        }
                        else{
                        	dir = new StringBuilder();
                        }
                    }
                    else{
                        stack.push(new String(dir));
                        dir = new StringBuilder();
                    }
                }
            }
            else{
                dir.append(c);
            }
        }

        if(!dir.toString().isEmpty()){
        	String rest = dir.toString();
        	if(!rest.equals(".")&&!rest.equals("..")){
        		stack.push(dir.toString());
        	}
        	else if(rest.equals("..")&&!stack.isEmpty()){
        		stack.pop();
        	}
            
        }
        dir = new StringBuilder();
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                dir.insert(0,"/"+stack.pop());
            }
        }
        else{
            dir.append("/");
        }

        return new String(dir);
    }*/
}


