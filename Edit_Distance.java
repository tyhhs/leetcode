
public class Edit_Distance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1="abc";
		String word2="def";
		System.out.println(minDistance(word1, word2));
	}

    public static int minDistance(String word1, String word2) {
        //convert from word1 to word2
    	int len1=word1.length();
        int len2=word2.length();
        int[][] distance=new int[len1+1][len2+1];
        //distance[i][j]: i:length of word1, j:length of word2
        for(int i=0;i<=len1;i++){
        	distance[i][0]=i;//word1 to word2, delete i times, cost i
        }
        for(int i=0;i<=len2;i++){
        	distance[0][i]=i;//word1 to word2, insert i times, cost i
        }
        for(int i=1;i<=len1;i++){
        	for(int j=1;j<=len2;j++){
        		if(word1.charAt(i-1)==word2.charAt(j-1)){
        			distance[i][j]=distance[i-1][j-1];
        		}
        		else{
        			distance[i][j]=distance[i-1][j-1]+1;//subsititude
        		}
        		distance[i][j]=Math.min(distance[i][j], Math.min(distance[i-1][j]+1, distance[i][j-1]+1));
        		//distance[i-1][j]+1:insert one to word1; distance[i][j-1]+1:delete one from word2
        	}
        }
        return distance[len1][len2];
    }
}
