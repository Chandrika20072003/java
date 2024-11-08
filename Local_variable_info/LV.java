class LV
{
	int a;	//a variable define under the scope of a class that types of variable is called a class level variables.
	int b;	
	public static void main(String[] args)
	{

		int c; // a variable define under the scope of a method or block that type of variable is called local variable .
		LV obj = new LV();

		System.out.println("a:"+obj.a);
		System.out.println("b:"+obj.b);
		System.out.println("c:"+c);
		
	}
}