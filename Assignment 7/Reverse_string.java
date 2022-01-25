
public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="JavaProgram";
		int size=s1.length();
		System.out.println("String Length: "+s1.length());
		
		System.out.println("Rev String: "+" "+s1+" "+"is");
		for(int i=0;i<size;i++)
		{
			System.out.print(s1.charAt(s1.length()-i-1));
		}

	}

}
