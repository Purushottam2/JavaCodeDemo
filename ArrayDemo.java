package onlinevideo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int nums[] = {2,4,8,5};               //new int[4]
		
		//for(int i=0;i<4;i++)
		//{
		//System.out.println(nums[i]);
		//}
		
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]= {9,10,11,12};
		
		int d[][]= { {1,2,3,4},  //Jagged Array
				   {5,6,7},
				   {9,10,11,12,5}
		};
		for (int i=0;i<d.length;i++)   //row
		{
			for(int j=0;j<d[i].length;j++)   //column
			{
				System.out.print(" " + d[i][j]);
		}
			    System.out.println();
				
		}
		
		for (int k[]:d)
		{
			for(int l:k)
			{
				System.out.print(" " +l);
			}
			System.out.println();
		}
		
//		for (int k:a)
//		{
//			System.out.print(k);
//		}
				
	
	
	}
	
	

}
