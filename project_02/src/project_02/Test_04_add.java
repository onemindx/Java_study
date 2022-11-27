package project_02;

public class Test_04_add {

	public static void main(String[] args) {
		int x , y ;
		for ( x = 9 ; x > 0 ; x -- )
		{
			for ( y = x ; y > 0 ; y -- ) 
			{
				System.out.print(x + "*" + y + "=" + (x * y) + " ");
			}
			System.out.println(" "); 
		}
	}
}
