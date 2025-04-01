import java.util.*;
public class Maps_ex {
	
	public static void main(String[] args)
	{
		/*HashMap hs = new HashMap();
		hs.put(101, "Amit");
		hs.put(103, "Bittu");
		hs.put(104,"kittu");
		hs.put(103,"Bittu");
		
		
		
	Set set =hs.entrySet();
	Iterator itr = set.iterator();
	
	while(itr.hasNext())
		
	{
		Map.Entry m = (Map.Entry)itr.next();
		System.out.println(m.getKey()+" , "+m.getValue());
		}*/
		
		TreeMap lhm = new TreeMap();
		lhm.put(100,"All");
		lhm.put(101,"the");
		lhm.put(191, "Best");
		lhm.put(291, "hg");
		
		Set set =lhm.entrySet();
		Iterator itr =set.iterator();
	
	while(itr.hasNext())
	{
		Map.Entry m =(Map.Entry)itr.next();
		System.out.println(m.getKey()+" , "+m.getValue());
	}
	
	}

}
