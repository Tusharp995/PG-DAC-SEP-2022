class Wrapper
{
 
public static void main(String args [])

{
 int num = 31;
String A = Integer.toBinaryString(num);
String B = Integer.toOctalString(num);
String C = Integer.toHexString(num);

System.out.println("Binary of 31: "+ A);
System.out.println("Octal of 31: "+ B);
System.out.println("Hexadecimal of 31: "+ C);


}

}