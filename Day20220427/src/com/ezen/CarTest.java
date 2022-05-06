package com.ezen;

import lombok.ToString;

public class CarTest {
	public static void main(String[] args) {
		
		Sedan se = new Sedan("white",5,4);
//		se.color = "white";
//		se.passenger = 5;
//		se.tire = 4;
		
		System.out.println(se.color + ", " + se.passenger + "," + se.tire);
		se.run();
		Bus bu = new Bus();
		bu.passenger = 15;
		bu.tire = 6;
		System.out.println(bu.passenger + "," + bu.tire);
		
		Sports ss = new Sports(2,4,2,"Red", 1000);
		System.out.println(ss.color + ", " + ss.passenger + "," + ss.tire +","+ ss.seat + ", "  + ss.sports);
	}
}

class Sedan extends Car{
	String color;
	
	public Sedan(String color, int passenger, int tire) {
		super(passenger,tire, 4);  //상위클래스 생성자 호출
		this.color = color;
//		this.passenger = passenger;
//		this.tire = tire;
		System.out.println("Sedan() 생성자");
	}
	
	public Sedan(int passenger, int tire , int seat, String color) {
		super(passenger, tire, seat);						// 매개변수를 지닌 super생성자.
		this.color = color;									// Car의 매개변수가 있는 생성자를 호출.
	}
	
	public Sedan() {}
}

class Sports extends Sedan{
	int sports ;
	
	public Sports() {}
	
	public Sports(int passenger, int tire , int seat, String color, int sports) { 
		super(passenger, tire, seat, color);			//36번째 줄에 있는 Sedan의 생성자를 호출
		this.sports = sports;							//본인의 인스턴스 변수인 sports와 매개변수의 sports가 동일.
	}
}
class Car {
	int passenger;
	int tire;
	int seat;
	
	public Car(int passenger, int tire, int seat) { // super(int passenger, int tire, int seat)
		this.passenger = passenger;					// 를 이용하는 생성자에 한하여 해당 생성자가 호출된다.
		this.tire = tire;							// sedan에서 사용하는 super() 생성자는 모두 매개변수를
		this.seat = seat;							// 가진 생성자이기 때문에 해당 생성자를 호출함.
		System.out.println("Car() 생성자");
	}
	public Car() {									// super()의 디폴트 생성자.
		this(10,4,4);								// super생성자에서 매개변수가 없으면
		System.out.println("Car()생성자");			// 해당 생성자가 호출된다.
	};
	
	
	void run() {
		System.out.println("run()");
	}
	void stop() {}
	
}

class Bus extends Car{
	void passengerLoad() {};
}
class Truck extends Car{
	void objectLoad() {};
}
