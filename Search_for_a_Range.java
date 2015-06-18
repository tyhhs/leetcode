
public class Search_for_a_Range {
	public static void main(String[] args) {
		int[] A={1,1,2};
		int[] res=searchRange(A, 1);
		for(int i:res){
			System.out.println(i);
		}
	}
	public static int[] searchRange(int[] A,int target){
		int left=0;
		int right=A.length-1;
		int middle=0;
		int found=0;
		while(left<=right){
			middle=(left+right)/2;
			if(A[middle]>target){
				right=middle-1;
			}
			else if(A[middle]<target){
				left=middle+1;
			}
			else{
				found=1;
				break;
			}
		}
		int[] bound={middle,middle};
		if(found==0){
			bound[0]=-1;
			bound[1]=-1;
			return bound;
		}
		
		//left bound
		for(int i=middle;i>=0;i--){
			
			if(A[i]!=target){
				bound[0]=i+1;
				break;
			}
			bound[0]=i;
		}
		
		//right bound
		for(int j=middle;j<A.length;j++){
			if(A[j]!=target){
				bound[1]=j-1;
				break;
			}
			bound[1]=j;
		}
		return bound;
	}
}
