package han.student.domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Order {
    private Long id;

    private Date creationDate;

    private List<OrderLine> orderLineList;

    public Order() {

    }

    public Order(Long id) {
        this.id = id;
    }

    public Order(Long id, Date creationDate) {
        this.id = id;
        this.creationDate = creationDate;
    }

    public Order(Long id, String creationDate) {
        this.id = id;
        try {
            this.creationDate = new SimpleDateFormat("yyyy-MM-dd").parse(creationDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<OrderLine> getOrderLineList() {
        return orderLineList;
    }

    public void setOrderLineList(List<OrderLine> orderLineList) {
        this.orderLineList = orderLineList;
    }
}
