import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorEx {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("toy");
		list.add("box");
		list.add("robot");
		list.add("toy");
		
		
		for (String s : list) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
