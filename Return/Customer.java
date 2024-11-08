import java.util.Scanner;
class Customer{
	String Customer_id;
	String Customer_name;
	String Customer_address;



	void get_Customer_id(String Customer_id){
			this.Customer_id = Customer_id;
	}

	void get_Customer_name(String name){
			this.Customer_name = name;
	}

	void get_Customer_address(String address){
			this.Customer_address  = address;
	}

	String Display(){
		return "Customer details: {"+"Customer id: " + Customer_id +", Customer name: " + Customer_name + ", Customer address: " + Customer_address + '}';
	}


	public static void main(String[] args){

		Customer obj = new Customer();
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter Customer id");
			String s = scan.nextLine();
			obj.get_Customer_id(s);
		
			
			System.out.println("enter Customer name");
			String n = scan.nextLine();
			obj.get_Customer_name(n);

			System.out.println("Enter customer Address");
			String a = scan.nextLine();
			obj.get_Customer_address(a);
			
			System.out.println(obj.Display());
			
	}
}
		
	
	
	