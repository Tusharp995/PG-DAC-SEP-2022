class Thiskey
{
int rollno;
int age;
double marks;

void setdetails(int rollno, int age, double marks)
{
this.rollno = rollno;
this.age = age;
this.marks =marks;
}
void printdetails()
{
	System.out.println(rollno);
System.out.println(age);
System.out.println(marks);
}
public static void main(String args[])
{
Thiskey S1 = new Thiskey();//object creation
S1.setdetails(1, 20, 75.0);
S1.printdetails();
Thiskey S2 = new Thiskey();
S2.setdetails(2, 21, 88.50);
S2.printdetails();


}
}