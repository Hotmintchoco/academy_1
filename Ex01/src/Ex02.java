
public class Ex02 {

	public static void main(String[] args) {
		int[] values = new int[45];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = i + 1;
		}
		
		int tmp = 0;
		for (int i = 0; i < 6; i++) {
			int j = (int) (Math.random() *45) +1;
			tmp = values[i];
			values[i] = values[j];
			values[j] = tmp;
			
			System.out.println(values[i]);
		}
	}
}
