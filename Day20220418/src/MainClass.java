import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		int count = 0;
		{
			File file = new File("data/data1.txt");

			FileInputStream src = new FileInputStream(file);

			Scanner sc = new Scanner(src);

			while (sc.hasNext()) {
				String tmp = sc.next();
				System.out.printf("%s ", tmp);
				count++;
			}
			System.out.println();

			sc.close();
			src.close();
		}
		
		int[] nums = new int[count];
		{
			File file = new File("data/data1.txt");
			
			FileInputStream src = new FileInputStream(file);
			
			Scanner sc = new Scanner(src);
			
			for (int i = 0; i < nums.length; i++) {
				String tmp = sc.next();
				nums[i] = Integer.parseInt(tmp);
			}
			
			System.out.print(Arrays.toString(nums));
			
			sc.close();
			src.close();
		}
		
		System.out.println();
		
		{
			int index = -1;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 88) {
					index = i;
					break;
				} 
			}
			System.out.println("index: " + index);
		}
		
		{
			int tmp;
			tmp = nums[0];
			nums[0] = nums[5];
			nums[5] = tmp;
		}
		System.out.println("nums: " + Arrays.toString(nums));

		
		{
			for (int i = 0; i < nums.length-1; i++) {
				int tmp;
				tmp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = tmp;
				
				Thread.sleep(1000);
				
				for (int j = 0; j < 50; j++) {
					System.out.println();
				}
				for (int j = 0; j < nums.length; j++) {
					if (j == i+1 || j == i) 
						System.out.printf("[%d] ", nums[j]);
					else
						System.out.printf("%d ", nums[j]);
				}
			}
//			System.out.println("after: " + Arrays.toString(nums));
		}
	}

}
