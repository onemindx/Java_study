package project_04;

public class Test_02 {

	public static void main(String[] args) {
		int arr [] = {4,24,21,84,17,66,7,33};
		for(int i = 0 ; i < arr.length ; i ++)
		{
			if(arr[i] % 2 == 0) //ji
			{
				for(int j = i + 1 ; j < arr.length ; j ++)
				{
					if(arr[j] % 2 == 1) //ou
					{
						int un = arr[i] ;
						arr[i] = arr[j] ;
						arr[j] = un;
						break;
					}
				}
			}
		}
		for(int i = 0 ; i < arr.length ; i ++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
