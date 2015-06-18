import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;


public class mock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintWriter writer = new PrintWriter("Vol_Has_Sche.txt");
			Random rand = new Random();
			for(int i=0;i<5000;i++){
				int schedule_id = i+1;
				int num_vol = rand.nextInt(5)+3;
				ArrayList<Integer> previous = new ArrayList<Integer>();
				for(int j=0;j<num_vol;j++){
					int vol_id = rand.nextInt(999)+1;
					while(previous.contains(vol_id)){
						vol_id = rand.nextInt(999)+1;
					}
					writer.println(vol_id+","+schedule_id);
					previous.add(vol_id);
				}
			}
			
			
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
