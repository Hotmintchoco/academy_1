import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Tv {
	private boolean power;
	private int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

@Getter
@Setter
class CaptionTv extends Tv {
	private boolean caption;
	void displayCaption (String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.setChannel(10);
		ctv.channelUp();
		System.out.println(ctv.getChannel());
		ctv.displayCaption("Hello, World");
		ctv.setCaption(true);
		ctv.displayCaption("Hello, World");
		
	}

}
