package dec21;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class ResultSetDemo {
	
		private static ResultSet rs;
		private static Scanner sc;
		
		
			public static void main(String[] args) {
				 
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/cdac_db?useSSL=false&allowPublicKeyRetrieval=true","root","sept22");
					PreparedStatement sc1 = con.prepareStatement("select * from student",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

						rs = sc1.executeQuery();
						 sc = new Scanner(System.in);
						 boolean flag = true;
						 
						do { 
							System.out.println("select 0 to exit");
							System.out.println("select 1 to show record");
							System.out.println("select 2 to show record in reverse");
							System.out.println("select 3 to show FIRST record");
							System.out.println("select 4 to show LAST record");
							System.out.println("select 5 to insert record");
							System.out.println("select 6 to update record");
							System.out.println("select 7 to delete record");
							byte opt =sc.nextByte();
							switch (opt) {
						case 0:
							flag=false;
							break;
						case 1:
						showRecord();
						break;
						case 2:
							showRecordInReverse();
							break;
						case 3:
							firstRecord();
							break;
						case 4:
							lastRecord();
							break;
						case 5:
							insertData();
							break;
						case 6:
							updateData();
							break;
						case 7:
							deleteData();
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
//				System.out.println("done");
				
				
				private static void showRecord() throws SQLException {
					rs.beforeFirst();
					while(rs.next()) {
						 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
					 }
				}
				private static void showRecordInReverse() throws SQLException {
					rs.afterLast();
					while(rs.previous()) {
						 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
					 }
				}
				private static void firstRecord() throws SQLException {
						if(rs.first()) {
							 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
						 }
				}
				private static void lastRecord() throws SQLException {
								if(rs.last()) {
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

		
