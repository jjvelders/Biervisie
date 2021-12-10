package han.student.endpoints;

import han.student.service.OrderService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/order")
@Consumes("application/json")
@Produces("application/json")
public class OrderController {

    @Inject
    OrderService orderService;

    @GET
    public String getAllOrders(){
        return orderService.getAllOrders();
    }

}
