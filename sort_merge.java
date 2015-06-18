import java.util.Arrays;




public class sort_merge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={8,7,6,5,4,3,2,1};
		merge_sort(num, 8);
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}

	}
	public static void merge_sort(int[] num,int n){
		int n1,n2,arr1[],arr2[];
		if(n<=1){
			return;
		}
		n1=n/2;
		n2=n-n1;
		arr1=Arrays.copyOfRange(num, 0, n1);
		arr2=Arrays.copyOfRange(num, n1, n);
		merge_sort(arr1, n1);
		merge_sort(arr2, n2);
		merge(num,arr1,n1,arr2,n2);
	}
	public static void merge(int[] num, int[] arr1, int n1,int[] arr2,int n2){
		int point=0,point1=0,point2=0;
		while(point1<n1&&point2<n2){
			if(arr1[point1]<=arr2[point2]){
				num[point]=arr1[point1];
				point++;
				point1++;
			}
			else{
				num[point]=arr2[point2];
				point++;
				point2++;
			}
		}
		
	}
}
