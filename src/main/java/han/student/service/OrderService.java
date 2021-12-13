package han.student.service;

import han.student.domain.dto.OrderDTO;
import han.student.service.dao.OrderDAO;

import javax.inject.Inject;

public class OrderService {

    @Inject
    OrderDAO orderDAO;

    public OrderDTO getAllOrders(){
        return new OrderDTO(orderDAO.getAllOrders());
    }
}
