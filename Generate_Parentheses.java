import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Generate_Parentheses {

	/**
	 * Given n pairs of parentheses, write a function to generate all
	 * combinations of well-formed parentheses.
	 * 
	 * For example, given n = 3, a solution set is:
	 * 
	 * "((()))", "(()())", "(())()", "()(())", "()()()"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=generateParenthesis(3);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public static List<String> generateParenthesis(int n) {
		List<List<String>> lists = new ArrayList<List<String>>();
		lists.add(Collections.singletonList(""));
		for(int i=1;i<=n;i++){
			List<String> insert=new ArrayList<String>();
			for(int j=0;j<i;j++){
				List<String> first=lists.get(j);
				List<String> second=lists.get(i-j-1);
				for(int k=0;k<first.size();k++){
					for(int l=0;l<second.size();l++){
						insert.add("("+first.get(k)+")"+second.get(l));
					}
				}
			}
			lists.add(insert);
		}
		return lists.get(n);
    }
	
	
	/* public static List<String> generateParenthesis(int n)
	    {
	        List<List<String>> lists = new ArrayList<>();
	        lists.add(Collections.singletonList(""));

	        for (int i = 1; i <= n; ++i)
	        {
	            final List<String> list = new ArrayList<>();

	            for (int j = 0; j < i; ++j)
	            {
	                for (final String first : lists.get(j))
	                {
	                    for (final String second : lists.get(i - 1 - j))
	                    {
	                        list.add("(" + first + ")" + second);
	                    }
	                }
	            }

	            lists.add(list);
	        }

	        return lists.get(lists.size() - 1);
	    }*/
	
	
}
