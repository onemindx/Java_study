package project_03;

public class Test_01 {

	public static void main(String[] args) {
		String s1 = "Java��ʦ";
		String s2 = "����";
		String s3 = "��";
		String s4 ;
		s4 = s1 ;
		s1 = s2 ;
		s2 = s3 ;
		s3 = s4 ;
		String s5 = s1 + s2 + s3;
		System.out.println(s5);
	}

}
