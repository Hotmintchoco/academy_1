import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Exercise6_4_1 {

	public static void main(String[] args) {
		
		Student2 s = new Student2("손흥민", 1, 10, 90, 100, 60);
		System.out.println(s.getName());
		System.out.println(s.getTotal());
	}

}

// private < default < protected < public

@Getter
@Setter
@ToString
class Student2{
	//변수>> 인스턴스변수, 클래스변수, 지역변수
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student2(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	
	//함수 --> 인스턴스메소드, 클래스메소드

	int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	
	double getAverage() {
		return getTotal()/3.0;
	}
}