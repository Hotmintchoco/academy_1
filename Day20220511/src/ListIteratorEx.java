import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("toy", "box", "robot", "box");
		
		System.out.println(list);
		
		list = new ArrayList<String>(list);
		
		ListIterator<String> it = list.listIterator();
		
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + "\t");
		}
		
		System.out.println();
		
		while (it.hasPrevious()) {
			String str = it.previous();
			System.out.print(str + "\t");
		}
	}

}
