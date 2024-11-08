
//Creating object by using deserialization
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class Student implements java.io.Serializable{
	int sid = 101;
	String sname = "shivani";
	int sage = 19;
	double sfee = 28900;
	String scourse = "java";
	String sinsname = "nit";
}

class ObjSAndD{
	 public static void main(String[] args)throws FileNotFoundException, IOException, ClassNotFoundException{
			FileOutputStream fos = new FileOutputStream("des");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Student s = new Student();
			oos.writeObject(s);
			
			FileInputStream fis = new FileInputStream("des");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			Student s1 = (Student)o;
	
			System.out.println(s1.sid);
			System.out.println(s1.sname);
			System.out.println(s1.sage);
			System.out.println(s1.sfee);
			System.out.println(s1.scourse);
			System.out.println(s1.sinsname);
	}
}