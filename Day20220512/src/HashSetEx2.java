import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Num {
	private int num;
	Num(int num) { this.num = num; }
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	@Override
	public int hashCode() {
		return num % 3;
	}
	@Override
	public boolean equals(Object obj) {
		return num == ((Num)obj).num;
	}
	
}

// 중복x, 순서x
public class HashSetEx2 {

	public static void main(String[] args) {
		
		Set<Num> set = new HashSet<Num>();
		
		set.add(new Num(5));
		set.add(new Num(5));
		set.add(new Num(1));
		set.add(new Num(3));
		set.add(new Num(2));
		
		System.out.println("cnt : " + set.size());
		
		for (Iterator<Num> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
		for (Num s : set) {
			System.out.print(s + "\t");
		}
	}

}
