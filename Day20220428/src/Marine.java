class Unit {
	int x, y;
	
	void move(int x, int y) {
		System.out.printf("(%d, %d)좌표만큼 이동%n", x, y);
	}
	void stop() {
		System.out.println("동작을 멈춤.");
	}
}


public class Marine extends Unit {
	void stimPack() {
		System.out.println("공격속도와 이동속도 증가");
	}
}

class Tank extends Unit {
	void changeMode() {
		
	}
}

class Dropship extends Unit {
	void load() {}
	void unload() {}
}

