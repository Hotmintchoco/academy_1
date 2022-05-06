import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("다섯 개의 정수를 입력하세요.");
		
		String tmp1 = scanner.nextLine();
		int input1 = Integer.parseInt(tmp1);
		String tmp2 = scanner.nextLine();
		int input2 = Integer.parseInt(tmp2);
		String tmp3 = scanner.nextLine();
		int input3 = Integer.parseInt(tmp3);
		String tmp4 = scanner.nextLine();
		int input4 = Integer.parseInt(tmp4);
		String tmp5 = scanner.nextLine();
		int input5 = Integer.parseInt(tmp5);
		
		int max = input1;
		
		if (input4 > input5) {
			max = input4;
			if (input3 > input4) {
				max = input3;
				if(input2 > input3) {
					max = input2;
					if(input1 > input2)
						max = input1;
				}
			} 
		}	
		else 
			max = input5;
		
		System.out.println(max);
		
	}
	
}
