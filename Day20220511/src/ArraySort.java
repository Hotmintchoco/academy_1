import java.util.Arrays;
import java.util.Comparator;

import lombok.Getter;
import lombok.Setter;

public class ArraySort {

	public static void main(String[] args) {
		Person[] person = new Person[3];
		
		person[0] = new Person("김대", 25);
		person[1] = new Person("김신영", 30);
		person[2] = new Person("퐁당퐁당", 22);
		
		Arrays.sort(person);
		for (Person p : person) {
			System.out.println(p);
		}
	}

}

class Person implements Comparable {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public Person() {
		this(null, 0);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		
		return this.name.length() - p.name.length();
	}    
	
}

class ageSort implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Person && o2 instanceof Person) {
			Integer age1 = ((Person)o1).getAge();
			Integer age2 = ((Person)o2).getAge();
			return age1.compareTo(age2);
		}
		return -1;
	}
}