package project_02;

public class Test_01 {

	public static void main(String[] args) {
		int x = -1 ;
		while ( x % 2 != 0 && x < 49 )
		{
			x = x + 2 ;
			System.out.println (x);
		}
		System.out.println ("执行完成");
		for ( int x1 = 1 ; x1 < 50 ; x1 = x1 + 2 )
		{
			System.out.println (x1);
		}
		System.out.println ("执行完成");
	}

}
