package onlinevideo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = new ArrayList <> ();  //WE CAN USE COLLECTION ALSO instead of List
		values.add(404); //Integer v =new Integer(4); 4 is object
		values.add(908);
		values.add(639);
		values.add(265);  //values.add(index,element)
//		Collections.sort(values);
//		Collections.reverse(values);
//		Collections.shuffle(values);
		//System.out.println(values);
		System.out.println(values.size()); //it gives size here it is 4
		//Iterator it = values.iterator();   // Fetch values one by one
//		System.out.println(it.next());
//		System.out.println(it.next());
		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
//		for (int i = 0; i<values.size(); i++)
//		{
//			System.out.println(values.get(i));
//		}
//		for (Integer o:values)  //enhanced for loop   Instead of Integer we can write Object
//		{
//			System.out.println(o);
//		}
		
		//Comparator <Integer> c = new Comparator<>()
				{
		//Comparator <Integer> c = (i,j) -> i%10>j%10?1:-1;
//		public int compare(Integer i, Integer j)
//		{
////			if(i%10>j%10)
////				return 1;
////			else
////				return -1;
//			return i%10>j%10?1:-1;
//		}
//		};
		Collections.sort(values,(i,j) -> i%10>j%10?1:-1);
		for (Integer o:values)  //enhanced for loop   Instead of Integer we can write Object
		{
			System.out.println(o);
		}
}
}
}