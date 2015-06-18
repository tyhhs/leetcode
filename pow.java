
public class pow {

	/**
	 * Implement pow(x, n).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(5,-1));
	}
/*    public static double pow(double x, int m) {
        double temp=x;
        if(m==0)
        return 1;
        temp=pow(x,m/2);
        if(m%2==0)
        return temp*temp;
        else 
        {
        if(m > 0)
            return x*temp*temp;
        else
            return (temp*temp)/x;
        }
    }*/
	
	//the O(lgn) solution
	public static double pow(double x, int n) {
		if(n==0){
			return 1;
		}
		double temp=pow(x, n/2);
		if(n%2==0){
			return temp*temp;
		}
		else{
			if(n>0){
				return x*temp*temp;
			}
			else{
				return (temp*temp)/x;
			}
		}
		
	}
/* complexity is O(n),time exceeded    
 * public static double pow(double x, int n) {
        if(n==0){
            return 1;
        }
        double res=x;
        int flag=0;
        if(n<0){
            n=-n;
            flag=1;
        }
        for(int i=1;i<n;i++){
            res=res*x;
        }
        if(flag==1){
            res=(double)(1/res);
        }
        return res;
    }*/
}
