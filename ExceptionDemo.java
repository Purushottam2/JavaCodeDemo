package onlinevideo;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 20;
		int j = 10;
		try
		{
			int k=i/j;
			if(k==0)
			throw new MyException ("This is not possible");
			System.out.println(k);		
			}
		catch (MyException e)
		{
			System.out.println("Error " +e.getMessage());
		}
		
	}

}
