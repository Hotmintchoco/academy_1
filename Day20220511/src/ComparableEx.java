import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Point implements Comparable{
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int compareTo(Object o) {
		Point p = (Point)o;
		
		return this.x - p.x;
	}
	
}

class MySort implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		return o1.y - o2.y;
	}
	
}

public class ComparableEx {

	public static void main(String[] args) {
		List<Point> point = new ArrayList<Point>();
		
		point.add(new Point(10, 20));
		point.add(new Point(50, 10));
		point.add(new Point(30, 30));
		
		Collections.sort(point, new MySort());
		
		for (Point p : point) {
			System.out.println(p);
		}
	}

}
