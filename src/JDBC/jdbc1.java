package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {
    static void main(String[] args) throws ClassNotFoundException,SQLException{
        String q2="INSERT INTO department VALUES (104,'sanjana')";
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("class loaded sucsess");


        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cybrom","root","123456");
        System.out.println("connect sucsess");

        Statement st=con.createStatement();
        st.executeUpdate(q2);

        System.out.println("data done");

        st.close();
        con.close();

    }

}
