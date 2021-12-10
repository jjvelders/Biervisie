package han.student.service.dao;

import javax.inject.Inject;
import java.sql.*;

public class OrderDAO {

    @Inject
    DatabaseGetter dbGetter;

    public String getAllOrders() {
        Connection conn = dbGetter.getCon();
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM order");
            while (rs.next()) {
                System.out.print("Column 1 returned ");
                System.out.println(rs.getString(1));
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*This example issues the same query as before but uses a PreparedStatement and a bind value in the query.

        int foovalue = 500;
        java.sql.PreparedStatement st = conn.prepareStatement("SELECT * FROM mytable WHERE columnfoo = ?");
        st.setInt(1, foovalue);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            System.out.print("Column 1 returned ");
            System.out.println(rs.getString(1));
        }
        rs.close();
        st.close();*/
        return "Succes!";
    }
}
