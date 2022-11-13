package project_01;

public class Test4 {

	public static void main(String[] args) {
		String pool = "蓝色空间";
		double enter_1 = 0.1 ;
		double enter_2 = 0.21 ;
		double enter_3 = 0.35 ;
		int pool_size1 = 5 * 10 * 14 ;
		int pool_size2 = 5 * 8 * 16 ;
		int pool_size3 = 5 * 8 * 13 ;
		int pool_size4 = 5 * 8 * 10 ;
		int pool_size5 = 5 * 8 * 14 ;
		double x = (double) enter_2 ;
		System.out.println(x);
		switch (pool) {
		case "蓝色空间":
			if ( x == enter_1 )	
				System.out.println("name:蓝色空间\nsize:0.1立方米\ntime:" + (pool_size1 / enter_1 + 6) / 3600);
			else if ( x == enter_2 )	
				System.out.println("name:蓝色空间\nsize:0.21立方米\ntime:" + (pool_size1 / enter_2 + 6) / 3600);
			else	
				System.out.println("name:蓝色空间\nsize:0.35立方米\ntime:" + (pool_size1 / enter_3 + 6) / 3600);
			break;
		case "自然选择":
			if ( x == enter_1 )	
				System.out.println("name:自然选择\nsize:0.1立方米\ntime:" + (pool_size2 / enter_1 + 6) / 3600);
			else if ( x == enter_2 )	
				System.out.println("name:蓝色空间\nsize:0.21立方米\ntime:" + (pool_size2 / enter_2 + 6) / 3600);
			else	
				System.out.println("name:蓝色空间\nsize:0.35立方米\ntime:" + (pool_size2 / enter_3 + 6) / 3600);
			break;
		case "万有引力":
			if ( x == enter_1 )	
				System.out.println("name:万有引力\nsize:0.1立方米\ntime:" + (pool_size3 / enter_1 + 6) / 3600);
			else if ( x == enter_2 )	
				System.out.println("name:蓝色空间\nsize:0.21立方米\ntime:" + (pool_size3 / enter_2 + 6) / 3600);
			else
				System.out.println("name:蓝色空间\nsize:0.35立方米\ntime:" + (pool_size3 / enter_3 + 6) / 3600);
			break;
		case "青铜时代":
			if ( x == enter_1 )	
				System.out.println("name:青铜时代\nsize:0.1立方米\ntime:" + (pool_size4 / enter_1 + 6) / 3600);
			else if ( x == enter_2 )	
				System.out.println("name:蓝色空间\nsize:0.21立方米\ntime:" + (pool_size4 / enter_2 + 6) / 3600);
			else	
				System.out.println("name:蓝色空间\nsize:0.35立方米\ntime:" + (pool_size4 / enter_3 + 6) / 3600);
			break;
		case "其它":
			if ( x == enter_1 )	
				System.out.println("name:其它\nsize:0.1立方米\ntime:" + (pool_size5 / enter_1 + 6) / 3600);
			if ( x == enter_2 )	
				System.out.println("name:蓝色空间\nsize:0.21立方米\ntime:" + (pool_size5 / enter_2 + 6) / 3600);
			if ( x == enter_3 )	
				System.out.println("name:蓝色空间\nsize:0.35立方米\ntime:" + (pool_size5 / enter_3 + 6) / 3600);
			break;
		}
	}

}
