import lombok.ToString;

public class CarTest {

	public static void main(String[] args) {

		Sedan se = new Sedan("white", 5, 4);
		se.color = "white";
		se.passenger = 5;
		se.tire = 4;
		System.out.println(se);
		
		Bus bu = new Bus();
		bu.passenger = 15;
		bu.tire = 6;
		System.out.println(bu.passenger + ", " + bu.tire);
		
		Sports ss = new Sports("white", 5, 4, 2);
		System.out.println();
	}

}

@ToString
class Cars {
	int passenger;
	int tire;
	int seat;
	
	public Cars() {}
	
	Cars(int passenger, int tire, int seat) {
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
	}
	
	void run() {}
	void stop() {}
}

class Sedan extends Cars {
	String color;
	
	public Sedan(String color, int passenger, int tire) {
		super(passenger, tire, 4);
		this.color = color;
	}
	
	public Sedan() {}
	
	public String toString() {
		return color + ", " + super.toString();
	}
}

class Sports extends Sedan {
	int sports;
	
	public Sports(String color, int passenger, int tire, int sports) {
		super(color, passenger, tire);
		this.sports = sports;
	}
	
	Sports() {
	}
}

@ToString
class Bus extends Cars {
	void passengerLoad() {};
}

@ToString
class Truck extends Cars {
	void objectLoad() {};
}