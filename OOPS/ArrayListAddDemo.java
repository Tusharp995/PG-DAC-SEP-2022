import java.util.*;
class ArrayListAddDemo
{
	static void display(List<String> list)
	{
		for (String s :list)
		{
				System.out.println(s);
		}
	}
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
	
	
	//addAll()
	ArrayList<String>list2 = new ArrayList<String>();
	list2.add("Shyam");
	list2.add("Madhur");
	list2.add("Amisha");
	System.out.println("List2 elements :");
		for (String s : list2)
	{
		System.out.println(s);
	}
	ArrayList<String>list3 = new ArrayList<String>();
	list3.add("Shyam");
	list3.add("Geeta");
	list3.add("Meeta");
	
	list1.addAll(list2);
	
	System.out.println("list1 element after addAll() : ");
		for (String s : list1)
	{
		System.out.println(s);
	}
	/*list1.clear();
	System.out.println("list1 element after clear() : ");
		for (String s : list1)
	{
		System.out.println(s);
	}*/
	
	// contains()  method
	boolean b;
	b = list1.contains("Shyam");
	System.out.println("list1.contains Shyam :"+b);
	
	boolean b1;
	b1 = list1.containsAll(list2);
	System.out.println("list1.contains all elements of lists 2 :"+b1);
	
	//isEmpty()
	//b = list1.isEmpty();
	//System.out.println();
	
	// retainAll() method
	list1.retainAll(list3);
	System.out.println("List1 elements  after retaining all elemnents of list3  ");
	display(list1);
	
	//size()
	int r = list1.size();
	System.out.println(r);
	}
	}
