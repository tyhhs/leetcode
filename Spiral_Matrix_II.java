
public class Spiral_Matrix_II {

	/**
	 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] res=new int[5][5];
		res=generateMatrix(5);
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(res[i][j]);System.out.print("|");
			}
			System.out.println();
		}
	}
	
    public static int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int bX=0,eX=n-1,bY=0,eY=n-1;//b:beginning,e:end
        int value=1;
        while(bX<=eX){
        	for(int i=bX;i<=eX;i++){
        		res[bY][i]=value++;
        	}
        	bY++;
        	for(int i=bY;i<=eY;i++){
        		res[i][eX]=value++;
        	}
        	eX--;
        	for(int i=eX;i>=bX;i--){
        		res[eY][i]=value++;
        	}
        	eY--;
        	for(int i=eY;i>=bY;i--){
        		res[i][bX]=value++;
        	}
        	bX++;
        }
        return res;
    }
}
