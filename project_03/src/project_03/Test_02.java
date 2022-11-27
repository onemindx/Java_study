package project_03;

import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		int a , x , y , z ;
		Scanner ture = new Scanner (System.in);
		a = ture.nextInt();
		x = a % 10 ;
		y = a / 10 % 10 ;
		z = a / 100 ;
		if ((z + y) % x == 0)
		{
				System.out.println(a);
		}
		else 
		{
			System.out.println("输入数不符合条件");
		}
	}

}
