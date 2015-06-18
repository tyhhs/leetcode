public class Container_With_Most_Water {

	/**
	 * Given n non-negative integers a1, a2, ..., an, where each represents a
	 * point at coordinate (i, ai). n vertical lines are drawn such that the two
	 * endpoints of line i is at (i, ai) and (i, 0). Find two lines, which
	 * together with x-axis forms a container, such that the container contains
	 * the most water.
	 * 
	 * Note: You may not slant the container.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height={1,5,1,1,1,5};
		System.out.println(maxArea(height));
	}
	
	 public static int maxArea(int[] height) {
		 int len=height.length;
		 int max=0;
		 int left=0;
		 int right=len-1;
		 int h;
		 while(left<right){
			 h=height[left]<height[right]?height[left]:height[right];
			 max=Math.max(max,h*(right-left));
			  //mx=max(mx,((j-i)*(min(height[i],height[j]))));
			 if(height[left]<height[right]){
				 left++;
			 }
			 else{
				 right--;
			 }
		 }
		 return max;
	 }
	
	
	
	//time limit exceeded solution
/*    public static int maxArea(int[] height) {
        int max=0;
        int h;
        int area=0;
        for(int i=0;i<height.length-1;i++){
        	for(int j=i+1;j<height.length;j++){
        		h=height[i]<height[j]?height[i]:height[j];
        		area=h*j-i;
        		max=max>area?max:area;
        	}
        }
        return max;
    }*/

}
