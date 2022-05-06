
public class Ex001 {

	public static void main(String[] args) {
		System.out.println(frontBack("abcdef"));
//		int sum = 0;
//		int absi = 1;
//		for (int i = 1; sum < 100; i++) {
//			sum += absi * i;
//			
//			absi = absi * -1;
//			
//			System.out.println(absi * i);
//		}
	}

	public static String frontBack(String str) {
		char[] ch = str.toCharArray();
		int j = ch.length - 1;
		System.out.println(ch[j]);
		for (int i = 0;  i <= (ch.length-1)/2; i++){
			char tmp = ch[i];
			ch[i] = ch[j];
			ch[j] = tmp;
			j--;
		}
		 String str1 = new String(ch);
		return str1;
	}
}

