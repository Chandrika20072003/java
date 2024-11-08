
//Create a object by using Factory method ----> PreDefine factory method

class SBtoS{
	public static void main(String[] arg){
			StringBuffer sb = new StringBuffer("this is chandrika");
			String s1 = sb.toString();
			System.out.println("sb: "+sb);
			System.out.println("s1: "+s1);
			
			String s2 = sb.substring(7);
			System.out.println("s2: "+s2);

			String s3 = sb.substring(0,6);
			System.out.println("s3: "+s3);
	}
}