package project_02;

public class Test_03 {

	public static void main(String[] args) {
		int day , money ;
		for ( day = 1 , money = 0 ; money <=150 ; day ++ )
		{
			money = money + 7 ;
			if ( day % 5 == 0 )
			{
				money = money - 9 ;
			}
		}
		System.out.println( day );
	}

}
