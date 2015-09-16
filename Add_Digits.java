
public class Add_Digits {

	public static void main(String[] args) {
		int num = 0;
		System.out.println(new Add_Digits().addDigits(num));
	}

	public int addDigits(int num) {
		return num - 9 * (int)Math.floor((num - 1)/9);
    }
}
