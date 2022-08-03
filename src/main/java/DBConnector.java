import java.sql.*;

import static java.lang.Class.forName;

public class DBConnector {

    public void connectDB(){

        try {
            forName("oracle.jdbc.driver.OracleDriver");

        Connection con= DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe","system","password");

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
