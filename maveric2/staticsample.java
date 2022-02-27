package maveric2;

public class staticsample {
	static  int a=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		staticsample b= new staticsample();
		b.method();
		System.out.println(a);

	}
	public void method()
	{
			System.out.println(a);

	}

}
