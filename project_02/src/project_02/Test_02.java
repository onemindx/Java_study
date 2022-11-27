package project_02;

public class Test_02 {

	public static void main(String[] args) {
		int x = -2 ;
		while ( x % 2 == 0 && x < 100 )
		{
			x = x + 2 ;
			System.out.println (x);
		}
		System.out.println ("执行完成");
		for ( int x1 = 0 ; x1 < 101 ; x1 = x1 + 2 )
		{
			System.out.println (x1);
		}
		System.out.println ("执行完成");

	}

}
