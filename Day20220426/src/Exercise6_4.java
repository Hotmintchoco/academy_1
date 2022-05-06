import lombok.Getter;
import lombok.Setter;

public class Exercise6_4 {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
	}

}

@Getter
@Setter
class Student {
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return name + "," + ban + "," + no + "," + kor + ","
				+ eng + "," + math + "," + getTotal() + "," + getAverage();
	}
	
	int getTotal() {
		int sum = kor + eng + math;
		return sum;
	}
	
	float getAverage() {
		return Math.round(getTotal()/3.0 * 10) / 10.0f;
	}
}
