class Return1{
	
	int id;
	String name;
	String rollno;

	
	void setId(int id){
		this.id = id;
	}

	
	
	void setName(String sname){
		this.name = sname;
	} 


	public String display(){
		return "Student details{"+"id="+id+"Name:"+name+'}';
	} 
	
	public static void main(String[] args){
	Return1 obj = new Return1();
	
	
	obj.setId(19);
	obj.setName("chandrika");
	System.out.println(obj.display());
	}
}