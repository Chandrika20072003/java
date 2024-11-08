//Shallow Clonning --> primitive variable getting seperate memery but referenced variable is not getting any seperate memory is called shallow clonning

class Address{
	String cityName = "kanti";
	String StateName = "Madhya pradesh";
	}

class Shallow_student implements Cloneable{
		int sid = 101;
		int sage = 21;
		String sname = "shivani";
		Address addr = new Address();
		
		public static void main(String[] s)
		throws CloneNotSupportedException{
		Shallow_student obj1 = new Shallow_student();
		System.out.println(obj1.sid+"....."+obj1.sage+"..."+obj1.sname+"..."+obj1.addr.cityName+"...."+obj1.addr.StateName);


     		obj1.sid = 100;
		obj1.sage=20;
		obj1.sname = "rishita";
		obj1.addr.cityName = "jabalpur";
		obj1.addr.StateName = "MP";
	
		System.out.println("---------obj1 details----------");
		System.out.println(obj1.sid+"....."+obj1.sage+"..."+obj1.sname+"..."+obj1.addr.cityName+"...."+obj1.addr.StateName);
		

		System.out.println("---------obj2 details--------");
		Shallow_student obj2 = (Shallow_student)obj1.clone();
		System.out.println(obj2.sid+"....."+obj2.sage+"..."+obj2.sname+"..."+obj2.addr.cityName+"...."+obj2.addr.StateName);

		System.out.println("obj1:"+obj1.hashCode()+"...."+"obj2:"+obj2.hashCode());
		
		}
	}