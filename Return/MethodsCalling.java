class MethodsCalling{
	
	int x;
		
	void m1(){
		System.out.println("m1 method");
	}

	static void m2(){
		System.out.println("m2 method");
	}

	boolean m3(){
		System.out.println("m3 method");
		return true;
	}

	static String m4(){
		System.out.println("m4 method");
		return "shivani";
	}


	void m5(int x){
		System.out.println("parameterized method");
		this.x = x;
	}
	
	
	public static void main(String[] args){
			MethodsCalling obj = new MethodsCalling();
			obj.m1();
			m2();
			System.out.println(obj.m3());
			boolean b = obj.m3();
			System.out.println("b:"+b);
			System.out.println(m4());

			obj.m5(211);
			System.out.println("x:"+obj.x);
	}
}