class Student
{
int rollno;
int age;
double marks;

/*Student()
{
System.out.println("Zero argument constru ");
}*/

void printdetails()
{
System.out.println(rollno +","+age+","+marks);
}
}
public class constructor
{
public static void main(String args[])
{
Student S1 = new Student();//object creation
S1.printdetails();



}
}