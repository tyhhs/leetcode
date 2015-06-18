
public class Distinct_Subsequences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="rabbbit";
		String T="rabbit";
		System.out.println(numDistinct(S, T));
	}
	
    public static int numDistinct(String S, String T) {
        int lenS=S.length();
        int lenT=T.length();
        int [][] trans=new int[lenS+1][lenT+1];
        for(int i=0;i<=lenS;i++){
        	trans[i][0]=1;
        }
        for(int i=1;i<=lenT;i++){
        	trans[0][i]=0;
        }
        for(int i=1;i<=lenS;i++){
        	for(int j=1;j<=lenT;j++){
        		if(S.charAt(i-1)==T.charAt(j-1)){
        			trans[i][j]=trans[i-1][j-1]+trans[i-1][j];
        		}
        		else{
        			trans[i][j]=trans[i-1][j];
        		}
        	}
        }
        return trans[lenS][lenT];
    }

}
