//creating duplicate object to existing object
//check new memory reference are allocated or not

class DObj{
			int a = 100;
			int b = 200;	
	public static void main(String[] s){
		DObj obj1 = new DObj();
		DObj obj2 = obj1;
		System.out.print("obj1:"+obj1.a+"---"+obj1.b+"\n");
		System.out.print("obj2:"+obj2.a+"---"+obj2.b+"\n");
		System.out.print("obj1:"+obj1.hashCode()+"\n");
 		System.out.print("obj2:"+obj2.hashCode()+"\n");
		
	}
}