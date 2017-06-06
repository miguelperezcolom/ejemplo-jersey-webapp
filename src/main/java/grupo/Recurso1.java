package grupo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * Created by miguel on 6/6/17.
 */
@Path("/recurso1")
public class Recurso1 {

    @GET @Path("/eco")
    public String eco(@QueryParam("msg") String msg) {
        return msg;
    }

}
