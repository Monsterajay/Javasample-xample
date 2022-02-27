package maveric2;

public class kumar {

	public static void hai()
	{
		System.out.println("hai is called");
	}
	public static void hello(String a)
	{
		System.out.println(a);
		int b=10;
		String c=a+b;
		System.out.println(c);	
		}
	kumar()
	{
		System.out.println("constructor is calledfor xtend class");
	}
	public static  int vales(int aa, int bb)
	{
		int cs=aa+bb;
		System.out.print(cs);
		return cs;
			}
	
	//overriders
	public static void quakka()
	{
		System.out.println("can you over ride me");
	}
	
}
