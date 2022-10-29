import java.util.*;
class IteratorDemo
{
	public static void main(String args[])
	{
		ArrayList <String> list1 = new ArrayList<String>();
		list1.add("Rohit");
		list1.add("Mukesh");
		list1.add("Radha");
		list1.add("Geeta");
		
		//using for each
		System.out.println("List1 elements :");
	for (String s : list1)
	{
		System.out.println(s);
	}
	
		//usingIteratot 
	System.out.println("Using iterator iterating list1 elemnent: ");
	Iterator<String> it = list1.iterator();
	while(it.hasNext())
	{
		String s = it.next();
		System.out.println(s);
	
	}
	
}
}