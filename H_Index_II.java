
public class H_Index_II {

	public static void main(String[] args) {
		int[] citations ={3, 0, 6, 1, 5};
		System.out.println(new H_Index_II().hIndex(citations));
	}
    public int hIndex(int[] citations) {
    	if(citations.length == 0 || citations == null){
    		return 0;
    	}
        int length = citations.length;
        int left = 0;
        int right = length-1;
        while(left!=right){
        	int mid = left + (right - left)/2;
        	if(length - mid <= citations[mid]){
        		right = mid;
        	}
        	else{
        		left = mid +1;
        	}
        }
        return length - left <= citations[left] ? length - left : citations[left]; 
    }
}
