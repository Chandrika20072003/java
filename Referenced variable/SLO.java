// static and local object creation of same class --> valid


class SLO 
{
		static SLO obj1 = new SLO();

		public static void main(String[] args)
		{

			SLO obj2 = new SLO();
			System.out.println("valid Statement");
		
		}
}