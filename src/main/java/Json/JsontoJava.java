package Json;

import java.sql.ResultSet;

import java.sql.*;

public class JsontoJava {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =null;
        conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1 :3306","root","Jameskelly@1983");

        // OBJECT OF STATMENT CLASS WILL HELP US TO EXECUTE QURIES
        Statement st= conn.createStatement();
        ResultSet rs = st.executeQuery("select * from CustomerInfo where location = 'Asia' and purchasedDate=curdate();");
        while(rs.next());
        rs.next();
        rs.getString(1);
    }
}


//root@localhost:3306 jdbc:mysql://localhost:3306/?user=root   jdbc:mysql://localhost:3306/?user=root

//127.0.0.1   jdbc:mysql://18.233.97.71:3306/library1