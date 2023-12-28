import java.io.BufferedReader;
import java.io.*;
import java.sql.*;

public class App {

    public static void main(String[] args) {

// Open a connection
try(Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/college?autoReconnect=true&useSSL=false","root","12345");
   Statement stmt = conn.createStatement();
) {              
    String create = "CREATE TABLE Student " +
             "(first VARCHAR(20) not null, " +
             " last VARCHAR(20) not null)";
   String insert = "insert into Student values ('Nikhilesh','Sinha')";
   String insert1 = "insert into Student values ('Varsha','Pawar')";
   String update = "update Student set first='NIKHILESH' where first='Nikhilesh'";
   String delete = "delete from Student  where first='Varsha'";



   stmt.executeUpdate(delete);
   System.out.println("Executed");        
} catch (SQLException e) {
   e.printStackTrace();
}
}
}
