import java.util.*;
class Student
{
	int roll;
	String name;
	double marks;
	 
	 Student()
	 {
	 }
	 Student(int roll, String name, double marks)
	 {
			this.roll=roll;
			this.name=name;
			this.marks=marks;
	}
}



class ArrayListForUserDefinedObject
{
	public static void main(String args[])
	{
		List <Student> list1 = new ArrayList<>();
		
		Student s1 = new Student(1,"Rohit",75.0);
		list1.add(s1);
		
		list1.add(new Student(2,"Manish",65.0));
		list1.add(new Student(3,"Geeta",72.0));
		list1.add(new Student(4,"Mohit",69.0));
	//Iteration using Iterator
	Iterator<Student> it = list1.iterator();
	while(it.hasNext())
	{
		Student s = it.next();
		System.out.println(s);		
	}
	}

}














