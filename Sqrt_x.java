
public class Sqrt_x {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Sqrt_x().mySqrt2(2));
	}

    public int mySqrt(int x) {
    	if(x<=0){
    		return 0;
    	}
    	int left=1;
    	int right=x;
    	int mid;
    	while(true){
    		mid=left+(right-left)/2;
    		if(mid>x/mid){
    			right=mid-1;
    		}
    		else{
    			if(mid+1>x/(mid+1)){
    				return mid;
    			}
    			left=mid+1;
    		}
    	}
    }
    public int mySqrt2(int x){
    	if(x<=0){
    		return 0;
    	}
    	double ans=x;
    	while(Math.abs(Math.pow(ans, 2)-x)>0.000001){
    		ans=(ans+x/ans)/2;
    	}
    	return (int)ans;
    }
}
