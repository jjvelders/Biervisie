package han.student.service;

import han.student.service.dao.OrderDAO;

import javax.inject.Inject;

public class OrderService {

    @Inject
    OrderDAO orderDAO;

    public String getAllOrders(){
        return orderDAO.getAllOrders();
    }
}
