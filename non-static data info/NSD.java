// how to load and initialized non-static data 

	class NSD{

		int a = m1();
		{
			System.out.println("non-static block-1");
		}
	
		public static void main(String[] args){
			System.out.println("main method");
			new NSD();
		}

		NSD(){
		  	System.out.println("contructor");
		}
	
		int m1(){
			System.out.println("m1 method");
			System.out.println("a:"+a);
			return 111;
		}
	
		{

			System.out.println("non-static block-2");
		}
		
	}