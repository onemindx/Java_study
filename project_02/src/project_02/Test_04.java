package project_02;

public class Test_04 {

	public static void main(String[] args) {
		int x = 9 , y = 9 ;
		while ( x >= 1 )
		{
			while ( y <= x && y >= 1 )
			{
				System.out.print(x + "*" + y + "=" + x * y + " ");
				y -- ;
			}
			System.out.println(" ");
			x -- ;
			y = x ;
		}
	}

}
