package project_01;

public class Test2 {

	public static void main(String[] args) {
		int year = 2021 ;
		String month =  "2��" ;
		int day = 0 ;
		if ( year % 4 != 0 )
		{
			
			switch (month) {
			case "1��" : 
				 day = 31 ;
				 break;
			case "2��" : 
				 day = 29 ;
				 break;
			case "3��" : 
				 day = 31 ;
				 break;
			case "4��" : 
				 day = 30 ;
				 break;
			case "5��" : 
				 day = 31 ;
				 break;
			case "6��" : 
				 day = 30 ;
				 break;
			case "7��" : 
				 day = 31 ;
				 break;
			case "8��" : 
				 day = 31 ;
				 break;
			case "9��" : 
				 day = 30 ;
				 break;
			case "10��" : 
				 day = 31 ;
				 break;
			case "11��" : 
				 day = 30 ;
				 break;
			case "12��" : 
				 day = 31 ;
				 break;
			}
		}
		if ( year % 4 == 0 )
		{
			
			switch (month) {
			case "1��" : 
				 day = 31 ;
				 break;
			case "2��" : 
				 day = 28 ;
				 break;
			case "3��" : 
				 day = 31 ;
				 break;
			case "4��" : 
				 day = 30 ;
				 break;
			case "5��" : 
				 day = 31 ;
				 break;
			case "6��" : 
				 day = 30 ;
				 break;
			case "7��" : 
				 day = 31 ;
				 break;
			case "8��" : 
				 day = 31 ;
				 break;
			case "9��" : 
				 day = 30 ;
				 break;
			case "10��" : 
				 day = 31 ;
				 break;
			case "11��" : 
				 day = 30 ;
				 break;
			case "12��" : 
				 day = 31 ;
				 break;
			}
		}
		System.out.println("����Ϊ" + year + "���е�" + month + "��" + day + "��");
	}
}
