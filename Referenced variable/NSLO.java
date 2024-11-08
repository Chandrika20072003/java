//non - static and local object creation --> Invalid
class NSLO
{
		NSLO obj1 = new NSLO();

		public static void main(String[] args)
		{
			NSLO obj2 = new NSLO();
			System.out.println("Invalid statement:");
		}
}
			

//it give's error --Exception in thread "main" java.lang.StackOverflowError