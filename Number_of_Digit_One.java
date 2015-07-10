
public class Number_of_Digit_One {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Number_of_Digit_One().countDigitOne(10));
	}
	
    public int countDigitOne(int n) {
    	if(n<=0){
    		return 0;
    	}
    	int res = 0;
    	int curr = n%10;
    	int high = n/10;
    	int low = 0;
    	int base = 1;
    	while(curr!=0||high!=0){
    		if(curr==0){
    			res+=(high*base);
    		}
    		else if(curr==1){
    			res+=(high*base+low+1);
    		}
    		else{
    			res+=((high+1)*base);
    		}
    		low+=(curr*base);
    		curr = high%10;
    		high = high /10;
    		base*=10;
    	}
    	
    	return res;
    }

}
