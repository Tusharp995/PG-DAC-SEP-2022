
class Demo1
{

public static void main(String args [])
{
	String s1 = "Welcome";
	String s2 = new String("Welcome");
	String s3 = "Welcome";
	String s4 = new String("Welcome");

System.out.println("s1 == s2 returns"+(s1==s2));
System.out.println("s1 == s3 returns"+(s1==s3));
System.out.println("s3 == s4 returns"+(s3==s4));

System.out.println("s1.equal(s2) return "+s1.equals(s2));
System.out.println("s1.equal(s3) return "+s1.equals(s3));
System.out.println("s3.equal(s4) return "+s3.equals(s4));
//System.out.println(s1.hashcode());
//System.out.println(s2.hashcode());
//System.out.println(s3.hashcode());
//System.out.println(s4.hashcode());


}
}