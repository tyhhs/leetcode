import javax.print.attribute.standard.RequestingUserName;

public class H_Index {

	public static void main(String[] args) {
		int[] citations ={3, 0, 6, 1, 5};
		System.out.println(new H_Index().hIndex(citations));
	}
    public int hIndex(int[] citations) {
        int length = citations.length;
        int map[] = new int[length+1];
        for(int i =0; i < length; i++){
        	int temp;
        	temp = citations[i] > length ? length : citations[i];
        	for(int j = 0; j <= temp; j++){
        		map[j]++;
        	}
        }
        for(int i = length; i >= 0; i --){
        	if (map[i] == i) {
				return i;
			}
        }
        return 0;
    }
}
