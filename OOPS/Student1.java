class Student
{
int rollno;
int age;
double marks;

void setdetails(int r, int a, double m)
{
rollno=r;
age=a;
marks=m;
System.out.println(rollno +","+age+","+marks);
}

void printdetails()
{
System.out.println(rollno +","+age+","+marks);
}
}
public class Student1
{
public static void main(String args[])
{
Student S1 = new Student();//object creation
S1.setdetails(1, 20, 75.53);

Student S2 = new Student();
S2.setdetails(2, 21, 78.3);



}
}