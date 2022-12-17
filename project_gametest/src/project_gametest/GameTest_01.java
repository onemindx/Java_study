package project_gametest;

import java.util.Random;

import java.util.Scanner;

public class GameTest_01 {


		public static void main(String[] args) 
		{
			Random x = new Random();
			System.out.println("猜数字，请输入一个0-100以内的整数");
			int number = x.nextInt(101);
			while(true)
			{
				Scanner a = new Scanner (System.in);
				int enter_number = a.nextInt();
				if(enter_number > number)
				{
					System.out.println("太大了");
				}
				if(enter_number < number) 
				{
					System.out.println("太小了");
				}
				if(enter_number == number) 
				{
					System.out.println("答对了");
					break;
				}
			}
		}
}
