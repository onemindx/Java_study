package project_04;

public class Test_01 {

	public static void main(String[] args) {
		int arr [] = new int [] {1,2,3,4};
		int arr2 [] = new int [] {6,7,8};
		int [] arr3 = new int [7] ;
		for (int i = 0;i < arr.length;i ++)
		{
			arr3[i]= arr[i];
		}
		for (int i = 0;i < arr2.length;i ++)
		{
			arr3[i+4]= arr2[i];
		}
		System.out.print("arr3里面的内容为{");
		for(int i = 0;i < arr3.length;i ++)
		{
			System.out.print(arr3[i]);
			if (i == arr3.length - 1)
			{
				System.out.print("}");
			}
			else
			{
				System.out.print(",");
			}
		}
		
	}

}
