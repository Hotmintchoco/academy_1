
public class BlockTest {
	int a = 1;
	
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
		a++;
	}
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		System.out.println(bt.a);
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
		System.out.println(bt2.a);
	}

}
