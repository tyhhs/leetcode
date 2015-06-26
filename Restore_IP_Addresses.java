import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.List;

public class Restore_IP_Addresses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new Restore_IP_Addresses()
				.restoreIpAddresses("0000");
		for (String s : list) {
			System.out.println(s);
		}
	}

	public List<String> restoreIpAddresses(String s) {
		return helper(new ArrayList<String>(), s, new ArrayList<String>(), 0, 1);
	}

	public List<String> helper(ArrayList<String> list, String s,
			ArrayList<String> curr, int position, int section) {
		// last of section of ip address, indicate that the previous three
		// sections are valid
		// just check if the remaining String is a valid section, if yes, append
		// it to previous three and return the whole address
		if (section == 4) {
			String subString = s.substring(position);
			if (isValidSection(subString)) {
				StringBuilder sb = new StringBuilder();
				for (String string : curr) {
					sb.append(string);
				}
				sb.append(subString);
				list.add(new String(sb));
				return list;
			}
			return list;
		}

		// find the feasible range from current position, avoid out of bound
		int sectionRange = s.length() - position < 3 ? s.length() - position
				: 3;
		for (int i = 1; i <= sectionRange; i++) {
			String subString = s.substring(position, position + i);
			if (isValidSection(subString)) {
				subString += ".";
				curr.add(subString);
				// a valid section got, go to next section
				helper(list, s, curr, position + i, section + 1);
				// remove checked section
				curr.remove(curr.size() - 1);
			}
		}

		return list;
	}

	public boolean isValidSection(String ipSection) {
		// first, check length
		if (ipSection.length() > 3 || ipSection.length() == 0) {
			return false;
		}
		// second, check range
		int val = Integer.parseInt(ipSection);
		if (val < 0 || val > 255) {
			return false;
		}
		// third, start with '0'
		if (ipSection.startsWith("0") && ipSection.length() > 1) {
			return false;
		}
		return true;
	}

}
