package project_01;

public class Test {

	public static void main(String[] args) {
		char x , y , z ;
		char max ;
		char middle ;
		char min ;
		x = 97 ; y = 98 ; z = 99 ;
		if ( x > z && x > y)
		{
			max = x;
			if ( z > y )
			{
				middle = z;
				min = y;
			}
			else
			{
				middle = y;
				min = z;
			}
		}
		else if ( y > x && y > z )
		{
			max = y;
			if ( x > z )
			{
				middle = x;
				min = z;
			}
			else
			{
				middle = z;
				min = x;
			}
		}
		else 
		{
			max = z;
			if ( x > y )
			{
				middle = x;
				min = y;
			}
			else 
			{
				middle = y;
				min = x;
			}
		}
		System.out.println("���ֵΪ:" + max);
		System.out.println("�м�ֵΪ:" + middle);
		System.out.println("��СֵΪ:" + min);
	}

}
 