package matc.team.controller;

import matc.team.entity.Tappers;
import matc.team.persistence.TappersDao;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;
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

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id) {
        Tappers tappers = dao.getById(id);
        if (tappers != null) {
            return Response.ok(tappers, MediaType.APPLICATION_JSON).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    /**
     * Adds a beer to the database from parameters
     *
     * @param tapper beer to be added
     * @return response showing results of adding
     * @throws URISyntaxException Bad syntax
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Tappers tapper) throws URISyntaxException {
        int newTappersId = dao.insert(tapper);
        URI uri = new URI("/taps/" + newTappersId);
        return Response.created(uri).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response update(@PathParam("id") int id, Tappers tapper) {
        tapper.setId(id);
        dao.saveOrUpdate(tapper);
        return Response.ok().build();
    }
}
