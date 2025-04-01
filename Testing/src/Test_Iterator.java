import java.util.*;

public class Test_Iterator {
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("KH");
		list.add("US");
		list.add("HA");
		list.add("LI");
		
		ListIterator<String> litr= list.listIterator();
		
		while(litr.hasNext())
		{
			System.out.print(litr.next());
		}
		System.out.println("");
		while(litr.hasPrevious())
			{
				System.out.print(litr.previous());
			}

	}

}
