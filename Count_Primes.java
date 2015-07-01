import java.util.ArrayList;
import java.util.List;


public class Count_Primes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_Primes count_Primes=new Count_Primes();
		System.out.println(count_Primes.countPrimes(121));
	}
	//time limit exceeded
/*    public int countPrimes(int n) {
    	int count=0;
    	for (int i=2;i<n ;i++){
    		if(isPrime(i)){
    			count++;
    		}
    	}
    	return count;
    }
    
    public boolean isPrime(int n){
    	int maxCheck=(int)Math.sqrt(n);
    	for(int i=2;i<=maxCheck;i++){
    		if ((n%i)==0){
    			return false;
    		}
    	}
    	return true;
    }*/
	
	//an efficient method: Sieve of Eratosthenes
	 public int countPrimes(int n) {
		 //an array, the index represents number, value represents is it a prime
		 //for example numbers[2]=true mean 2 is a prime number
		 boolean[] numbers=new boolean[n];
		 for(int i=2;i<n;i++){
			 numbers[i]=true;
		 }
		 //we just need to check 2 to root of n
		 int maxCheck= (int)Math.sqrt(n);
		 for(int i=2;i<=maxCheck;i++){
			 if(!numbers[i]){
				 continue;
			 }
			 else{
				 //start mark from i^2
				 for(int j=i*i;j<n;j=j+i){
					 numbers[j]=false;
				 }
			 }
		 }
		 int count=0;
		 for(int i=2;i<n;i++){
			 if(numbers[i]){
				 count++;
			 }
		 }
		 return count;
	 }
}
