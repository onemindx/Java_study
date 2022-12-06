package project_04;

public class Test_03 {

	public static void main(String[] args) {
		int max = 0 , unlock = 0;
		int[] sort = new int [] {12,24,7,3,55,33,66,41};
		max = sort[0];
		for (int x = 0;x < sort.length;x ++)
		{
			for(int y = x;y < sort.length;y ++)
			{
				if(sort[x] < sort[y])
				{
					unlock = sort[y];
					sort[y] = sort[x];
					sort[x] = unlock;
				}
			}
		}
		for(int x = 0;x < sort.length;x ++)
		{
			System.out.print(sort[x]+" ");
		}
		return;
	}

}
