package project_gametest;

import java.util.Random;

import java.util.Scanner;

public class GameTest_01 {


		public static void main(String[] args) 
		{
			Random x = new Random();
			System.out.println("�����֣�������һ��0-100���ڵ�����");
			int number = x.nextInt(101);
			while(true)
			{
				Scanner a = new Scanner (System.in);
				int enter_number = a.nextInt();
				if(enter_number > number)
				{
					System.out.println("̫����");
				}
				if(enter_number < number) 
				{
					System.out.println("̫С��");
				}
				if(enter_number == number) 
				{
					System.out.println("�����");
					break;
				}
			}
		}
}
