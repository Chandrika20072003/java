//class informartion is available with in the class or not
// if not existed
// then  compiler chack the scope of class

	class Load2{

		static class Student2{
			 String name = "kit";
		}
		
		public static void main(String...r){

			Student2 s = new Student2();
			System.out.println(s.name);
		}

	}