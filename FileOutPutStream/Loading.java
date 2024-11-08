
import java.io.*;
public class Loading{
		static{

		System.out.println("static block");

		}

	public static void main(String...r)throws Exception{

		System.out.println("main method");
		FileOutputStream fos = new FileOutputStream("yes.text");
		PrintStream ps = new PrintStream(fos);
		ps.println("yes we can execute");
	}
}