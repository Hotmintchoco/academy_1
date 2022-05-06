import java.util.StringJoiner;

public class StringTest {

	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] animalArr = animals.split(",");
		
		for (String ani : animalArr) {
			System.out.println(ani);
		}
		
		String str = String.join(":", animalArr);
		System.out.println(str);
		
		StringJoiner sj = new StringJoiner(",", "(", ")");
		
		for (String s : animalArr) {
			sj.add(s);
		}
		System.out.println(sj);
	}

}
