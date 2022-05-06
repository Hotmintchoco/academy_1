
public class Ex_001 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
		if (0 < num && num <=10) {
			this.num = num;
		} else {
			System.out.println("1 ~ 10사이의 정수가 아닙니다.");
		}
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang ? "K" : "");
	}
}
