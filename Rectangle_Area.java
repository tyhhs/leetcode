
public class Rectangle_Area {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new Rectangle_Area().computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
		System.out.println(new Rectangle_Area().computeArea(0,0,0,0,-1,-1,1,1));
	}

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	int overHorizontal = lengthOfOverlapping(A, C, E, G);
    	int overVertical = lengthOfOverlapping(F,H,B,D);
//    	System.out.println(overHorizontal);
//    	System.out.println(overVertical);
    	int overLapping = overHorizontal*overVertical;
    	int Area1 = (C-A)*(D-B);
    	int Area2 = (G-E)*(H-F);
    	return Area1+Area2-overLapping;
    }
    
    public int lengthOfOverlapping(int a, int b, int c, int d){
    	if (a<=c) {
			if(c<=b){
				if(d<=b){
					return d-c;
				}
				else{
					return b-c;
				}
			}
			else{
				return 0;
			}
		}
    	else{
    		if(a<=d){
    			if(b<=d){
    				return b-a;
    			}
    			else{
    				return d-a;
    			}
    		}
    		else{
    			return 0;
    		}
    	}
    }
    
}
