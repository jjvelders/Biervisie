package han.student.domain;

import java.util.Date;
import java.util.List;

public class Order {
    private Long id;

    //private Date creationDate;

    private List<OrderLine> orderLineList;

    public Order() {

    }

    public Order(Long id) {
        this.id = id;
    }

    public Order(Long id, List<OrderLine> orderLineList) {
        this.id = id;
        this.orderLineList = orderLineList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }*/

    public List<OrderLine> getOrderLineList() {
        return orderLineList;
    }

    public void setOrderLineList(List<OrderLine> orderLineList) {
        this.orderLineList = orderLineList;
    }
}
