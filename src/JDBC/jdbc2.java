package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbc2 {
    static void main(String[] args)  throws ClassNotFoundException, SQLException {
        String select="select*from department;";


        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("class loaded sucsess");


        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cybrom","root","123456");
        System.out.println("connect sucsess");

        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(select);

        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        System.out.println("data done");

        st.close();
        con.close();
    }
}
