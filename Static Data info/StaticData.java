// how static data loading and initialze and calling for same class staic data and other class static data

class Demo{
	
	static int b = 111;
}

class StaticDemo{
		static int x = m1();
		static int a = 222;
		static{
			System.out.println("static  A block");
		}
		
		static int m1(){
				System.out.println("a:"+a);
				System.out.println("m1 method");
				return 333;
		}
	      public static void main(String[] args){
				System.out.println("main method");


			//---------calling for same class static data and other class static data using different technique-------------
		
				// same class static data

				System.out.print("By directly:"+a);
				System.out.print("\n");

				System.out.print("By Class Name:"+StaticDemo.a);
				System.out.print("\n");
				
				StaticDemo sd  = new StaticDemo();
				System.out.print("By Object:"+new StaticDemo().a);
				System.out.print("\n");

				System.out.print("By refence"+sd.a);
				System.out.print("\n");

				// other class static data calling

				System.out.print("By class Name:"+Demo.b);
				System.out.print("\n");

				Demo d = new Demo();
				System.out.print("By Object:"+new Demo().b);
				System.out.print("\n");

				System.out.print("BY reference:"+d.b);

					
	      }

		static{
				System.out.println("static B block");
		}

		

}