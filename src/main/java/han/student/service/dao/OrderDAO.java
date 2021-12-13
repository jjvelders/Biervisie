package han.student.service.dao;

import han.student.domain.Beer;
import han.student.domain.Order;
import han.student.domain.OrderLine;

import javax.inject.Inject;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {

    @Inject
    DatabaseGetter dbGetter;

    public List<Order> getAllOrders() {
        List<Order> orders = new ArrayList<>();

        Connection conn = dbGetter.getCon();
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from customer_order co left JOIN order_line ol ON co.id = ol.fk_order_line join beer b ON ol.beer_id = b.id");

            List<OrderLine> OrderLineList = null;
            Order order = new Order();

            while (rs.next()) {
                //ga erin als order id null is of order ongelijk is aan het vorige order id
                if (order.getId() == null || order.getId() != rs.getLong(1)){
                    //ga erin als je een oude order moet opslaan
                    if (order.getId() != null){
                        order.setOrderLineList(OrderLineList);
                        orders.add(order);
                    }
                    //maak een nieuwe order aan
                    order = new Order(
                            rs.getLong(1),
                            rs.getString(2)
                    );
                    //maak de OrderLineList leeg/maak een aan
                    OrderLineList = new ArrayList<>();
                }

                OrderLineList.add(new OrderLine(
                    rs.getLong(3),
                    rs.getInt(4),
                    rs.getInt(5),
                    new Beer(
                        rs.getLong(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)
                    )
                ));
            }
            //finally
            order.setOrderLineList(OrderLineList);
            orders.add(order);

            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orders;
    }
}
