class Student
{
int rollno;
int age;
double marks;

void printdetails()
{
System.out.println(rollno +","+age+","+marks);
}
public static void main(String args[])
{
Student S1 = new Student();//object creation
S1.rollno=1;
S1.age =20;
S1.marks =78.50;

Student S2 = new Student();
S2.rollno=2;
S2.age =21;
S2.marks =88.50;

S1.printdetails();
S2.printdetails();



}
}