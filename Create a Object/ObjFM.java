
// Creating object by using factory method--> user define factory method
class CEO{	
	String ceoName = "mr. chandrika Patel";
}
class Employee{
	String ename = "Shivani";
}

class ITCompany{
	private ITCompany(){
	}
	String itCName = "iit";
	public static ITCompany getObjectForITCompany(){
		return new ITCompany();
	} 
	
	/*public static Employee getObjectForEmployee(){
		return new Employee();
	} */
}

class ObjFM{
	public static void main(String[] args){
			ITCompany ite = ITCompany.getObjectForITCompany();
			//ITCompany ite = new ITCompany();
			System.out.println(ite.itCName);
			Employee e = new Employee();
			//Employee e = ite.getObjectForITCompany();
			System.out.println(e.ename);
			CEO c =  new CEO();
			System.out.println(c.ceoName);
	}
}