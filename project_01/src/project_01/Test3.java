package project_01;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2021 ;
		int month = 12 ;
		int day = 0 ;
		if ( year % 4 != 0 )
		{
			if ( month == 1 | month ==3 |  month ==5 | month == 7 | month == 8 | month == 10 | month == 12) 
			{
				day = 31 ;
				System.out.println("����Ϊ" + year + "(ƽ��)���е�" + month + "����" + day + "��");
			}
			else if ( month == 4 | month == 6 |  month == 9 | month == 11 ) 
			{
				day = 30 ;
				System.out.println("����Ϊ" + year + "(ƽ��)���е�" + month + "����" + day + "��");
			}
			else if ( month == 2 )
			{
				day = 29 ;
				System.out.println("����Ϊ" + year + "(ƽ��)���е�" + month + "����" + day + "��");
			}
			else
			{
				System.out.println("�·ݲ���ȷ");
			}
		}
		else
		{
			if ( month == 1 | month ==3 |  month ==5 | month == 7 | month == 8 | month == 10 | month == 12) 
			{
				day = 31 ;
				System.out.println("����Ϊ" + year + "(����)���е�" + month + "����" + day + "��");
			}
			else if ( month == 4 | month == 6 |  month == 9 | month == 11 ) 
			{
				day = 30 ;
				System.out.println("����Ϊ" + year + "(����)���е�" + month + "����" + day + "��");
			}
			else if ( month == 2 )
			{
				day = 28 ;
				System.out.println("����Ϊ" + year + "(����)���е�" + month + "����" + day + "��");
			}
			else
			{
				System.out.println("�·ݲ���ȷ");
			}
		}
	}

}
