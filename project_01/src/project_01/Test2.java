package project_01;

public class Test2 {

	public static void main(String[] args) {
		int year = 2021 ;
		String month =  "2月" ;
		int day = 0 ;
		if ( year % 4 != 0 )
		{
			
			switch (month) {
			case "1月" : 
				 day = 31 ;
				 break;
			case "2月" : 
				 day = 29 ;
				 break;
			case "3月" : 
				 day = 31 ;
				 break;
			case "4月" : 
				 day = 30 ;
				 break;
			case "5月" : 
				 day = 31 ;
				 break;
			case "6月" : 
				 day = 30 ;
				 break;
			case "7月" : 
				 day = 31 ;
				 break;
			case "8月" : 
				 day = 31 ;
				 break;
			case "9月" : 
				 day = 30 ;
				 break;
			case "10月" : 
				 day = 31 ;
				 break;
			case "11月" : 
				 day = 30 ;
				 break;
			case "12月" : 
				 day = 31 ;
				 break;
			}
		}
		if ( year % 4 == 0 )
		{
			
			switch (month) {
			case "1月" : 
				 day = 31 ;
				 break;
			case "2月" : 
				 day = 28 ;
				 break;
			case "3月" : 
				 day = 31 ;
				 break;
			case "4月" : 
				 day = 30 ;
				 break;
			case "5月" : 
				 day = 31 ;
				 break;
			case "6月" : 
				 day = 30 ;
				 break;
			case "7月" : 
				 day = 31 ;
				 break;
			case "8月" : 
				 day = 31 ;
				 break;
			case "9月" : 
				 day = 30 ;
				 break;
			case "10月" : 
				 day = 31 ;
				 break;
			case "11月" : 
				 day = 30 ;
				 break;
			case "12月" : 
				 day = 31 ;
				 break;
			}
		}
		System.out.println("今年为" + year + "其中的" + month + "有" + day + "天");
	}
}
