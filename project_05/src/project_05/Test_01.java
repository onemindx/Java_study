package project_05;

public class Test_01 
{
	public static void main(String[] args) 
	{
		/*有三个公司，2021年每季度利润分别是：
        				华为： 93,60,92,90
        				小米： 95,82,63,79
	java老师开的超级高科技公司： 94,93,94,93
	利用二维数组求最大值和最小值 ，以及每个公司的年利润和月利润。
		 */

		int huawei [] = {93,60,92,90};
		int xiaomi [] = {95,82,63,79};
		int javatc [] = {94,93,94,93};
		int a [][] = new int [][] {huawei,xiaomi,javatc};
		int min = 1000;
		int max = 0;
		for(int i = 0;i < a.length;i ++)
		{
			for(int j = 0;j < a[i].length;j ++)
			{
				if(max < a[i][j])
				{
					max = a[i][j];
				}
				if(min > a[i][j])
				{
					min = a[i][j];
				}
			}
		}
		System.out.println("最大值为" + max);
		System.out.println("最小值为" + min);
		int pj_h = 0;
		int total_h = 0;
		for(int z = 0;z < huawei.length;z ++)
		{
			total_h = total_h + huawei[z];
			pj_h = total_h / 4;
		}
		System.out.println("华为的年利润" + total_h * 3);
		System.out.println("华为的月利润" + pj_h);
		int pj_x = 0;
		int total_x = 0;
		for(int z = 0;z < xiaomi.length;z ++)
		{
			total_x = total_x + xiaomi[z];
			pj_x = total_x / 4;
		}
		System.out.println("小米的年利润" + total_x * 3);
		System.out.println("小米的月利润" + pj_x);
		int pj_j = 0;
		int total_j = 0;
		for(int z = 0;z < javatc.length;z ++)
		{
			total_j = total_j + javatc[z];
			pj_j = total_j / 4;
		}
		System.out.println("java老师的年利润" + total_j * 3);
		System.out.println("java老师的月利润" + pj_j);
	}
}
