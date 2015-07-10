import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.events.EndDocument;
public class Insert_Interval {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval i1=new Interval(1, 5);
		//Interval i2=new Interval(6,9);
		Interval insert=new Interval(5,7);
		List<Interval> intervals=new ArrayList<Interval>();
		intervals.add(i1);
		//intervals.add(i2);
		List<Interval> res=new Insert_Interval().insert(intervals, insert);
		for(int i=0;i<res.size();i++){
			Interval temp=res.get(i);
			temp.printInterval();
		}
	}
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    	List<Interval> res=new ArrayList<Interval>();
    	int len=intervals.size();
    	if(len==0){
    		res.add(newInterval);
    		return res;
    	}
        for (int i = 0; i < len; i++) {
			Interval temp=intervals.remove(0);
			if(temp.end<newInterval.start){
				res.add(temp);
			}
			else if(temp.start>newInterval.end){
				res.add(newInterval);
				res.add(temp);
				break;
			}
			else if(temp.start<=newInterval.start&&temp.end>=newInterval.start&&temp.end<=newInterval.end){
				newInterval.start=temp.start;
				continue;
			}
			else if(temp.start<=newInterval.end&&temp.end>=newInterval.end&&temp.start>=newInterval.start){
				newInterval.end=temp.end;
				continue;
			}
			else if(temp.start<=newInterval.start&&temp.end>=newInterval.end){
				newInterval.start=temp.start;
				newInterval.end=temp.end;
			}
		}
        if(!res.contains(newInterval)){
        	res.add(newInterval);
        }
        res.addAll(intervals);
        return res;
    }
}
