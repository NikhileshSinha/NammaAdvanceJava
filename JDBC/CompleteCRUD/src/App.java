import java.io.BufferedReader;
import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Open a connection
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/college?autoReconnect=true&useSSL=false","root","12345");
        Statement stmt = conn.createStatement();
        ) {      
            try{
                String create = "CREATE TABLE Student " +
                    "(usn VARCHAR(10) not null, " +
                    "first VARCHAR(20) not null, " +
                    "last VARCHAR(20) not null, "+
                    "course VARCHAR(5) not null, "+
                    "primary key (usn))";
                stmt.executeUpdate(create);
                System.out.println("Table Student is created\n");
            } 
            catch (SQLException e) {
                System.out.println("Table Student is already created\n");
            }       
            while (true) {
                System.out.println("Enter your choice:\n1. Insert new value\n2. Update value by USN\n3. Delete value by USN\n4. Print Table\n9. Exit the loop");
                Scanner s = new Scanner(System.in);
                int choice = s.nextInt();
                switch (choice) {
                    case 1:
                        try{
                            Scanner sc = new Scanner(System.in);
                            System.out.println("USN: ");
                            String usn = sc.nextLine();
                            System.out.println("First Name: ");
                            String fname = sc.nextLine();
                            System.out.println("Last Name: ");
                            String lname = sc.nextLine();
                            System.out.println("Course: (MCA/MBA/BTECH)");
                            String crs = sc.nextLine();
                            String insert = "insert into Student values ('" + usn + "','" + fname + "','" + lname + "','" + crs + "')";
                            stmt.executeUpdate(insert);
                            System.out.println("Value inserted"); 
                        }
                        catch (SQLException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        try{
                            Scanner sc = new Scanner(System.in);
                            System.out.println("USN: ");
                            String usn = sc.nextLine();
                            System.out.println("First Name: ");
                            String fname = sc.nextLine();
                            System.out.println("Last Name: ");
                            String lname = sc.nextLine();
                            System.out.println("Course: (MCA/MBA/BTECH)");
                            String crs = sc.nextLine();
                            String update ="update student set first='" + fname +"', last='" + lname +"', course='" + crs+"' where usn = '"+usn+"';";
                            System.out.println(update+"\n\n");
                            stmt.executeUpdate(update);
                            System.out.println("Value Updated"); 
                        }
                        catch (SQLException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        try{
                            Scanner sc = new Scanner(System.in);
                            System.out.println("USN: ");
                            String usn = sc.nextLine();
                            String delete = "delete from Student  where usn='"+usn+"'";
                            stmt.executeUpdate(delete);
                            System.out.println("Value Delete"); 
                        }
                        catch (SQLException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        //TODO: dekhna
                        //Statement stmt1=conn.createStatement();
                        ResultSet rs=stmt.executeQuery("select * from Student");
                        if(rs.next()){
                            System.out.println("USN\t\tFirst name\tSecond Name\tCourse");
                            do{
                                String usn=rs.getString(1);
                                String fn=rs.getString(2);
                                String ln=rs.getString(3);
                                String c=rs.getString(4);
                                System.out.println(usn+"\t"+fn+"\t"+ln+"\t\t"+c);
                            }
                            while(rs.next());
                        }
                        else
                            System.out.println("Record(s) are not available in database.");
                        break;
                    case 9:
                        System.exit(1);
                        break;
                
                    default:
                        System.out.println("Wrong Input!");
                        break;
                }
            }
            // String insert = "insert into Student values ('Nikhilesh','Sinha')";
            // String insert1 = "insert into Student values ('Varsha','Pawar')";
            // String update = "update Student set first='NIKHILESH' where first='Nikhilesh'";
            // String delete = "delete from Student  where first='Varsha'";
            // stmt.executeUpdate(delete);
            // System.out.println("Executed");        
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
