package online.staff.mangement.system;
import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///staffmanagementsystem", "root", "Roshni@2000");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

