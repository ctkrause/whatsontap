package matc.team.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/whatsontap")
public class TapResults {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public Response getName() {
        // Return a simple message
        String name = "Name: Spotted Cow";
        return Response.status(200).entity(name).build();
    }
}
