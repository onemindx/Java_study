package project_01;

public class Test4 {

	public static void main(String[] args) {
		String pool = "��ɫ�ռ�";
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
		case "��ɫ�ռ�":
			if ( x == enter_1 )	
				System.out.println("name:��ɫ�ռ�\nsize:0.1������\ntime:" + (pool_size1 / enter_1 + 6) / 3600);
			else if ( x == enter_2 )	
				System.out.println("name:��ɫ�ռ�\nsize:0.21������\ntime:" + (pool_size1 / enter_2 + 6) / 3600);
			else	
				System.out.println("name:��ɫ�ռ�\nsize:0.35������\ntime:" + (pool_size1 / enter_3 + 6) / 3600);
			break;
		case "��Ȼѡ��":
			if ( x == enter_1 )	
				System.out.println("name:��Ȼѡ��\nsize:0.1������\ntime:" + (pool_size2 / enter_1 + 6) / 3600);
			else if ( x == enter_2 )	
				System.out.println("name:��ɫ�ռ�\nsize:0.21������\ntime:" + (pool_size2 / enter_2 + 6) / 3600);
			else	
				System.out.println("name:��ɫ�ռ�\nsize:0.35������\ntime:" + (pool_size2 / enter_3 + 6) / 3600);
			break;
		case "��������":
			if ( x == enter_1 )	
				System.out.println("name:��������\nsize:0.1������\ntime:" + (pool_size3 / enter_1 + 6) / 3600);
			else if ( x == enter_2 )	
				System.out.println("name:��ɫ�ռ�\nsize:0.21������\ntime:" + (pool_size3 / enter_2 + 6) / 3600);
			else
				System.out.println("name:��ɫ�ռ�\nsize:0.35������\ntime:" + (pool_size3 / enter_3 + 6) / 3600);
			break;
		case "��ͭʱ��":
			if ( x == enter_1 )	
				System.out.println("name:��ͭʱ��\nsize:0.1������\ntime:" + (pool_size4 / enter_1 + 6) / 3600);
			else if ( x == enter_2 )	
				System.out.println("name:��ɫ�ռ�\nsize:0.21������\ntime:" + (pool_size4 / enter_2 + 6) / 3600);
			else	
				System.out.println("name:��ɫ�ռ�\nsize:0.35������\ntime:" + (pool_size4 / enter_3 + 6) / 3600);
			break;
		case "����":
			if ( x == enter_1 )	
				System.out.println("name:����\nsize:0.1������\ntime:" + (pool_size5 / enter_1 + 6) / 3600);
			if ( x == enter_2 )	
				System.out.println("name:��ɫ�ռ�\nsize:0.21������\ntime:" + (pool_size5 / enter_2 + 6) / 3600);
			if ( x == enter_3 )	
				System.out.println("name:��ɫ�ռ�\nsize:0.35������\ntime:" + (pool_size5 / enter_3 + 6) / 3600);
			break;
		}
	}

}
