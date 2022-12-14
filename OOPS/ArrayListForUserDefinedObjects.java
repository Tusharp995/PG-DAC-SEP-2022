import java.util.*;

class Student implements Comparable<Student>
{
	int roll;
	String name;
	double marks;

	Student()
	{
	}

	Student(int roll, String name, double marks)
	{
		this.roll = roll;
		this.name = name;
		this. marks = marks;
	}

	public String toString()
	{
		return "Student[roll = " + roll + ", name = "+name + ", marks = " + marks + "]";
	}

	public int hashCode()
	{

		return (int) (roll+marks);
	}

	public boolean equals(Object ob)
	{
		Student s = (Student) ob;
		if(s == null)
			return false;

		if(this.roll == s.roll && this.name.equals(s.name) && this.marks == s.marks)
			return true;
		else
			return false;
	}
	 public int compareTo(Student s)
	 {
		
		 if(this.marks > s.marks)
			 return 1;
		if(this.marks < s.marks)
			 return -1;
		  return 0;
	 }
	
}

class ArrayListForUserDefinedObjects
{
	public static void display(List<Student> mylist)
	{
		Iterator<Student> it = mylist.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
	}

	public static void main(String args[])
	{
		List<Student> list1 = new ArrayList<Student>();

		Student s1 = new Student(1,"Rohit",75.0);
		list1.add(s1);

		list1.add(new Student(2,"Manish",65.0));
		list1.add(new Student(3,"Geeta",72.0));

		list1.add(new Student(4,"Mohit",69.0));

		//Iterating using Iterator
		System.out.println("List1 elements: ");
		display(list1);

		List<Student> list2 = new ArrayList<Student>();
		list2.add(new Student(5,"Mahesh",56.0));
		list2.add(new Student(6,"Amisha",67.0));

		System.out.println("List2 elements: ");
		display(list2);

		//addAll() method.
		list1.addAll(list2);
		System.out.println("List1 elements after addAll list2 : ");
		display(list1);

		//contains() method
		boolean b = list1.contains(s1);
		System.out.println("list1.contains(s1) : " + b);

		
		Student s2 = new Student(1,"Rohit",75.0);

		b = list1.contains(s2);
		System.out.println("list1.contains(s2) : " + b);

		//remove() method
		list1.remove(s2);
		System.out.println("list1.remove(s2) : ");
		display(list1);

		b = list1.containsAll(list2);		//true;
		System.out.println("list1.containsAll(list2): " + b);

	Collections.sort(list1);
	display(list1);

	}
}