import java.util.ArrayList;
import java.util.List;


public class Different_Ways_to_Add_Parentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "2*3-4*5";
		List<Integer> res = new Different_Ways_to_Add_Parentheses().diffWaysToCompute(input);
		for(int i : res){
			System.out.println(i);
		}
	}

    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < input.length(); i++){
        	char curr = input.charAt(i);
        	if(curr == '+' || curr == '-' || curr == '*'){
        		String part1 = input.substring(0, i);
        		String part2 = input.substring(i+1);
        		List<Integer> res1 = diffWaysToCompute(part1);
        		List<Integer> res2 = diffWaysToCompute(part2);
        		for(int ele1 : res1){
        			for(int ele2 : res2){
        				int c = 0;
        				if(curr == '+'){
        					c = ele1 + ele2;
        				}
        				else if(curr == '-'){
        					c = ele1 - ele2;
        				}
        				else{
        					c = ele1 * ele2;
        				}
        				res.add(c);
        			}
        		}
        	}
        }
        if(res.size() == 0){
        	res.add(Integer.valueOf(input));
        }
        return res;
    }
}
