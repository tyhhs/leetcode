import java.util.ArrayList;
import java.util.List;


public class Course_Schedule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCourses=2;
		int[][] prerequisites={{1,0},{0,1}};
		System.out.println(new Course_Schedule().canFinish(numCourses, prerequisites));
	}
	
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    	//keep indegree of very course, index: course number, value: in-degree
    	int[] degrees=new int[numCourses];
    	//a List keep all courses(course number) with zero in-degree
    	List<Integer> zeroList=new ArrayList<Integer>();
    	//calculate degrees
    	for(int i=0; i<prerequisites.length;i++){
    		degrees[prerequisites[i][0]]++;
    	}
    	//add 0 in-degree courses into set
    	for (int i=0;i<numCourses;i++){
    		if(degrees[i]==0){
    			zeroList.add(i);
    		}
    	}
    	if(zeroList.isEmpty()){
    		return false;
    	}
    	//while is not empty,topological sort
    	while(!zeroList.isEmpty()){
    		int course = zeroList.remove(0);
    		//find edge link current course to others, remove them
    		for(int i=0;i<prerequisites.length;i++){
    			//edge found
    			if(prerequisites[i][1]==course){
    				//remove edge, in-degree decrease and check if the degree reach 0
    				if(--degrees[prerequisites[i][0]]==0){
    					zeroList.add(prerequisites[i][0]);
    				}
    			}
    		}
    	}
    	
    	//check is there a cycle
    	for(int i=0;i<numCourses;i++){
    		if(degrees[i]!=0){
    			return false;
    		}
    	}
    	return true;
    	
    }

}
