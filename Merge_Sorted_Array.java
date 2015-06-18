public class Merge_Sorted_Array {

	/**
	 * Given two sorted integer arrays A and B, merge B into A as one sorted
	 * array.
	 * 
	 * Note: You may assume that A has enough space (size that is greater or
	 * equal to m + n) to hold additional elements from B. The number of
	 * elements initialized in A and B are m and n respectively.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,3,5,7,9,0,0,0,0,0};
		int[] B={2,4,6,8,10};
		merge(A,5,B,5);
		for(int a=0;a<10;a++){
    		System.out.println(A[a]);
    	}
	}
    public static void merge(int A[], int m, int B[], int n) {
    	
        int i=m;
        int j=n;
        while(i!=0&&j!=0){
        	if(A[i-1]<=B[j-1]){
        		A[i+j-1]=B[j-1];
        		j--;
        	}
        	else{
        		A[i+j-1]=A[i-1];
        		i--;
        	}
        }
        if(i==0){
        	for(int a=0;a<j;a++){
        		A[a]=B[a];
        	}
        }
    }

}
