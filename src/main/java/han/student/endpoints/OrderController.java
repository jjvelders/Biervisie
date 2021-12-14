package han.student.endpoints;

import han.student.service.OrderService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/order")
@Consumes("application/json")
public class OrderController {

    @Inject
    OrderService orderService;

    @GET
    @Path("/getAll")
    public Response getAllOrders(){
        return Response.ok().entity(orderService.getAllOrders()).build();
    }

    @Path("/getNewest")
    public Response getNewestOrder(){ return Response.ok().entity(orderService.getNewest()).build(); }

}
