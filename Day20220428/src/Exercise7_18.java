
public class Exercise7_18 {
	
	static void action(Robot r) {
		if (r instanceof DanceRoBot) {
			DanceRoBot dr = (DanceRoBot)r;
			dr.dance();
		} else if (r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}  else if (r instanceof DrawRobot) {
			DrawRobot drt = (DrawRobot)r;
			drt.draw();
		}
	}

	public static void main(String[] args) {
		Robot[] arr = {new DanceRoBot(), new SingRobot(), new DrawRobot()};
		
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}

}

class Robot {}

class DanceRoBot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

