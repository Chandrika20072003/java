//NewInstance method

class NewInstanceDemo{
		public static void main(String[] s)
		throws ClassNotFoundException,InstantiationException,IllegalAccessException{
		java.lang.Class cls = Class.forName(s[0]);
		Object o = cls.newInstance();
		if(o instanceof A){
				System.out.println("A class Object");
				A obj1 =(A)o;
				System.out.println(obj1.a);
		}
		else if(o instanceof B){
				System.out.println("B class object");
				B obj1 = (B)o;
				System.out.println(obj1.b);
		}
	}
}