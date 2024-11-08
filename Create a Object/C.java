//cloning--> creating new object with the help of giving object

class C implements Cloneable{
		int a = 111;
		int b = 222;
	public static void main(String[] arg)
				throws CloneNotSupportedException{
				C obj1 = new C();
				System.out.print("obj1:"+obj1.a+"..."+obj1.b+"\n");
				obj1.a = 333;
				obj1.b = 444;
				System.out.print("obj1:"+obj1.a+"...."+obj1.b+"\n");
				
				C obj2 = new C();
				System.out.print("obj2:"+obj2.a+"..."+obj2.b+"\n");

				Object o = obj1.clone();
				C obj3   = (C)o;
				System.out.print("obj3:"+obj3.a+"..."+obj3.b+"\n");

				System.out.print("obj1:"+obj1.hashCode()+"\n");
				System.out.print("obj3:"+obj3.hashCode());
	}
}
				
				