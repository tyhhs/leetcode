import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Merge_Intervals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public List<Interval> merge(List<Interval> intervals) {
    	if(intervals.size()==0){
    		return new ArrayList<Interval>();
    	}
    	Collections.sort(intervals, new Comparator<Interval>() {
    		public int compare(Interval i1, Interval i2){
    			return Integer.compare(i1.start, i2.start);
    		}
		});
    	
    	List<Interval> res = new ArrayList<Interval>();
    	
    	int start = intervals.get(0).start;
    	int end = intervals.get(0).end;
    	for (int i = 1;i<intervals.size();i++){
    		Interval temp = intervals.get(i);
    		if(temp.start<=end){
    			end=Math.max(end, temp.end);
    		}
    		else{
    			res.add(new Interval(start, end));
    			start=temp.start;
    			end=temp.end;
    		}
    	}
    	
    	//add last interval
    	res.add(new Interval(start, end));
    	return res;
    	
    }
    

}
