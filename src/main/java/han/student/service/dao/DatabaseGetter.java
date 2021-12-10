package han.student.service.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseGetter {

    public Connection getCon(){
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/postJDBC";
            Properties props = new Properties();
            props.setProperty("user","postgres");
            props.setProperty("password","Welkom123!");
            //props.setProperty("ssl","true");
            conn = DriverManager.getConnection(url, props);

            if (conn != null) {
                System.out.println("Connection Established");
                return conn;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return conn;
    }

}
