//In same class .. two different object when we change the first object static data, this reflected on other object also, because In same class two different object are pointing to same memory location it's happend only static data

class StaticObj{
		static int a = 111;  // static data 
		static int b = 222; // static data

		public static void main(String[] agrs){
				StaticObj obj1 = new StaticObj(); // Both object are pointing to same memory location
				StaticObj obj2 = new StaticObj(); // Both object are pointing to same memory location

				System.out.println("obj1:"+obj1.a+"...."+"obj1:"+obj1.b);
				System.out.println("obj2:"+obj2.a+"...."+"obj2:"+obj2.b);

				System.out.println("...................................");
				
				obj1.a = 999;
				obj1.b = 888;
				System.out.println("obj1:"+obj1.a+"...."+"obj2:"+obj1.b);
				System.out.println("obj2:"+obj2.a+"...."+"obj2:"+obj2.b);

				System.out.println("...................................");

				obj2.a = 4545;
				obj2.b = 5454;
				System.out.println("obj1:"+obj1.a+"...."+"obj1:"+obj1.b);
				System.out.println("obj2:"+obj2.a+"...."+"obj2:"+obj2.b);
	
		}
}