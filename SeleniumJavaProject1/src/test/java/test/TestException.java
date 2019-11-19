package test;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			System.out.println("Hello");
			int i= 1/0;
			System.out.println("Completed");
			System.out.println();
		}
		catch(Exception exp){
			System.out.println("Catch ");
			exp.printStackTrace();
		}
		finally{
			System.out.println("final ");
		}
	}
	public static void demo() throws Exception{
		System.out.println("Hello demo");
		int i= 1/1;
		System.out.println("Completed demo");
		
	}
	
	 
 
	
	
}
