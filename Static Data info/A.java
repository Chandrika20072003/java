class A{
	static a = 1010;
	static b = 2020;
}

class Main{
	public static void main(String[] args){
			 A obj1 = new A();
			 A obj2 = new A();

			System.out.println("a:"+a);
			System.out.println("b:"+b);

			System.out.println("*********************");
			
			obj1.a = 111;
			obj1.b = 222;
			System.out.println("obj1:"+obj1.a+"...."+obj1.b);
		      System.out.println("obj2:"+obj2.a+"...."+obj2.b);

			obj2.a = 999;
			obj2.b = 888;
			System.out.println("obj1:"+obj1.a+"...."+obj1.b);
		      System.out.println("obj2:"+obj2.a+"...."+obj2.b);