package basic;

public class practice {

	public static void main(String[] args) 
	{
		String expected="Abhijeetpatil";
		String actual="abhijeetpatil";
		String f="";
		
		
//		if(expected.equalsIgnoreCase(actual))
//		{
//			System.out.println("test case pass");
//		}
//		else
//		{
//			System.out.println("test case fail");
//		}
		
//		int y=expected.length();
//		System.out.println(y);
//		
//		for(int i=y-1;i>=0;i--)
//		{
//			f=f+expected.charAt(i);
//		}
//		
//		System.out.println(f);
//		int g=f.length();
//		System.out.println(g);
		
		String a="my name is abhijeet";
		
		String [] ar=a.split(" ");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		System.out.println(a.contains("jeet"));
		
	
		
	}

}
