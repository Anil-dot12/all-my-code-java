import java.sql.*; 
public class DBConnectionSample2 { 
public static void main(String args[]) throws Exception { 
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
Connection con = DriverManager.getConnection("jdbc:odbc:EmpDB2"); 
Statement stmt = con.createStatement();
 String sql = "CREATE TABLE TesT(" + 
                         "EmpNo INTEGER not NULL, " + 
                         "EmpName VARCHAR(255), " + 
                         "Age INTEGER, " + 
                         "Qualification VARCHAR(255), " + 
                         "PRIMARY KEY ( EmpNo ))"; 
            stmt.executeUpdate(sql); 
            System.out.println("Created table in the database."); 
 
            // Insert a row into the table 
            sql = "INSERT INTO TesT VALUES (1004, 'Harry', 30, 'MSc')"; 
            stmt.executeUpdate(sql); 
            System.out.println("Inserted row into the table."); 
 
            // Extract records with age > 40 
          sql = "SELECT * FROM TesT WHERE Age > 40"; 
            ResultSet rs = stmt.executeQuery(sql); 
 
            // Extract data from result set 
            while (rs.next()) { 
                // Retrieve by column name 
                int empNo = rs.getInt("EmpNo"); 
                String name = rs.getString("EmpName"); 
                int age = rs.getInt("Age"); 
                String qualification = rs.getString("Qualification"); 
 
                // Display values 
                System.out.print("EmpNo: " + empNo); 
                System.out.print(", EmpName: " + name); 
                System.out.print(", Age: " + age); 
                System.out.println(", Qualification: " + qualification);  } 
            // Clean-up environment 
            rs.close(); 
            stmt.close(); 
            con.close(); }} 
