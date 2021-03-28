package matc.team.controller;

import matc.team.entity.Tappers;
import matc.team.persistence.TappersDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/taps")
public class TapResource {
    TappersDao dao = new TappersDao();
    // The Java method will process HTTP GET requests
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tappers> list() {
        return dao.getAll();
    }
}
