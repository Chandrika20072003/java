class Local_variable{
			int a = 10;
			{
				b = 10 ;
				System.out.println("non - static block-1:b:"+b);			
			}

			Local_variable(){
				int c = 11;
				System.out.println("constractor:c:"+c);
			}

		public static void main(String[] args){
				int d = 13;
				System.out.println("main method:d:"+d);
			}

			{
				System.out.println("non-static block-2:e:"+c);
			}

}