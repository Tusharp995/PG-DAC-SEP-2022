package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Question6 {


	private static ResultSet rs;
	private static Scanner sc;
	
	
		public static void main(String[] args) {
			 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/cdac_db?useSSL=false&allowPublicKeyRetrieval=true","root","sept22");
				Statement sc1 = con.createStatement();

					rs = sc1.executeQuery("select * from student");
					 sc = new Scanner(System.in);
					 boolean flag = true;
					 
					do { 
						System.out.println("select 0 to exit");
						System.out.println("select 1 to show record");
						System.out.println("select 2 to insert record");
						System.out.println("select 3 to update record");
						System.out.println("select 4 to delete record");
						System.out.println("select 5 to insert record");
				
						byte opt =sc.nextByte();
						switch (opt) {
					case 0:
						flag=false;
						break;
					case 1:
					showRecord();
					break;
					case 2:
						insertData();
						break;
					case 3:
						updateData();
						break;
					case 4:
						deleteData();
						break;
					case 5:
						
						break;
					
						
						
					default:
						System.out.println("wrong choice");
					}
					}while(flag);
					sc1.close();
				con.close();
			} 
			catch (ClassNotFoundException | SQLException e) {			
				e.printStackTrace();
			}
		}
			
			
			private static void showRecord() throws SQLException {
				rs.beforeFirst();
				while(rs.next()) {
					 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
				 }
			}
			
			private static void insertData() throws SQLException {
				sc = new Scanner(System.in);
				System.out.println("Enter your PRN");
				int rno = sc.nextInt();
				System.out.println("Enter your name");
				String name = sc.next();
				System.out.println("Enter your marks");
				float marks = sc.nextFloat();
				System.out.println("Enter your dob");
				String dob = sc.next();
				
				rs.moveToInsertRow();
				rs.updateInt(1, rno);
				rs.updateString(2, name);
				rs.updateFloat(3, marks);
				rs.updateString(4, dob);
				rs.insertRow();
				rs.moveToCurrentRow();
			}
			private static void updateData() throws SQLException {
				System.out.println("Enter rno");
				int rno = sc.nextInt();
				boolean flag = false;
				rs.beforeFirst();
				while(rs.next()) {
					if(rs.getInt(1)==rno) {
						System.out.println("Enter name");
						String name = sc.next();
						System.out.println("Enter marks");
						float marks = sc.nextFloat();
						System.out.println("Enter dob");
						String dob = sc.next();
						
						rs.updateString(2, name);
						rs.updateFloat(3, marks);
						rs.updateString(4, dob);
						
						rs.updateRow();
						rs.moveToCurrentRow();
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					System.out.println("record not found");
				}
			}
			
			
			private static void deleteData() throws SQLException {
				System.out.println("Enter rno");
				int rno = sc.nextInt();
				boolean flag = false;
				rs.beforeFirst();
				while(rs.next()) {
					if(rs.getInt(1)==rno) {
						rs.deleteRow();
						rs.moveToCurrentRow();
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					System.out.println("record not found");
				}
			}

		}