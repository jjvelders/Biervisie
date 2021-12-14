package han.student.service;

import han.student.domain.Order;
import han.student.service.dao.OrderDAO;

import javax.inject.Inject;
import java.util.List;

public class OrderService {

    @Inject
    OrderDAO orderDAO;

    public List<Order> getAllOrders(){
        return orderDAO.getAllOrders();
    }

    public Order getNewest(){ return orderDAO.newestOrder(); }
}
