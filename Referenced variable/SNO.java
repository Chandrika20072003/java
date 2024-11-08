// Static and non - static object creation of same class  is --> Invalid

	class SNO{
		SNO obj1 = new SNO(); //non - static object

		static SNO obj2 = new SNO();//Static object

		public static void main(String[] args)
		{

				System.out.println("main method");
		}
	}


// it will give error - Exception in thread "main" java.lang.StackOverflowError