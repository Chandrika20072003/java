// how to communicate with nono - static variables

class NSDCommunication{
			
		int a = 111;
		{
			System.out.println("NSB:a:"+a); // As long as object is created. it will run for that much time. this type of block is called non - static block
		}

		 NSDCommunication{
			System.out.println("constructor:a:"+a);
		}
		void m1(){
			System.out.println("m1 method:a:"+a);
		}
		public static void main(String[] args){
			//System.out.println("By directly:a:"+a); // We can not access non - static variable by directly
			 NSDCommunication ns = new  NSDCommunication(); 
			System.out.println("By reference:a:"+ns.a);
			System.out.println("By anonymous object:a:"+ns.a);

		}
		
}