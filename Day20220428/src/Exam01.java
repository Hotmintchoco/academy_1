
public class Exam01 {

	public static void main(String[] args) {
//		Animal animal = new Whale();
//		animal.eat();
		
		Animal animal = new Penguin();
		
		if (animal instanceof Bird) {
			Bird bird = (Bird)animal;
			bird.eat();
			bird.fly();
		} else if (animal instanceof Mammal) {
			Mammal mammal = (Mammal)animal;
			mammal.eat();
		}
//		animal.eat();
//		
//		Person person = (Person)animal;
//		person.eat();
	}

}

class Animal {
	void eat() {
		System.out.println("동물이 먹는다.");
	}
	void run() {}
}

class Mammal extends Animal{
	void eat() {
		System.out.println("포유류가 먹는다.");
	}
}

class Whale extends Mammal{
	void eat() {
		System.out.println("고래가 먹는다.");
	}
}

class Person extends Mammal{
	void eat() {
		System.out.println("사람이 먹는다.");
	}
}

class Bird extends Animal{
	void eat() {
		System.out.println("조류가 먹는다.");
	}
	void fly() {
		System.out.println("새가 난다.");
	}
}

class Penguin extends Bird{
	void eat() {
		System.out.println("펭귄이 먹는다.");
	}
	void play() {
		System.out.println("펭귄이 논다.");
	}
}

class Sparrow extends Bird {
	void eat() {
		System.out.println("참새가 먹는다.");
	}
}
 