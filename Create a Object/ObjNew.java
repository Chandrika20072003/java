
//Creating Object By using new keyword

	class ObjNew{
		int sid;
		String sname;
		String sinName;
		double sfee;
		String scourse;
		ObjNew(int id, String name, String inName, double fee, String course){
				sid = id;
				sname = name;
				sinName = inName;
				sfee = fee;
				scourse = course;
		}
		public static void main(String[] args){
				ObjNew on = new ObjNew(19, "chandrika", "nit", 28000, "Java");
				System.out.println("Student id: "+on.sid);
				System.out.println("Student Name: "+on.sname);
				System.out.println("Student Institute Name: "+on.sinName);
				System.out.println("Student fees:"+on.sfee);
				System.out.println("Student Course:"+on.scourse);
		}
	}
				