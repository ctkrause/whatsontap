package matc.team.controller;

import matc.team.entity.Tappers;
import matc.team.persistence.TappersDao;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Gives results in XML instead of JSON
 */
@Path("/tapsXML")
public class TapResourceXML {

    TappersDao dao = new TappersDao();

    /**
     * Gets all records
     * @return all beers
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Tappers> getAll() {
        return dao.getAll();
    }

    /**
     * Gets specific record based on id
     *
     * @param id id of beer being retrieved
     * @return status based on result of get
     */
    @GET
    @Path("/id/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Response getById(@PathParam("id") int id) {
        Tappers tappers = dao.getById(id);
        if (tappers != null) {
            return Response.ok(tappers, MediaType.APPLICATION_XML).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    /**
     * Gets all records with a specified description
     * @param description description of beer (name)
     * @return beers containing description
     */
    @GET
    @Path("/desc/{description}")
    @Produces(MediaType.APPLICATION_XML)
    public Response getByDescription(@PathParam("description") String description) {
        List<Tappers> tappers = dao.getByPropertyLike("description", description);
        if (tappers != null) {
            return Response.ok(tappers, MediaType.APPLICATION_XML).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    /**
     * Gets all records of a beer type
     * @param type type of beer being queried
     * @return records of beer of specified type
     */
    @GET
    @Path("/type/{type}")
    @Produces(MediaType.APPLICATION_XML)
    public Response getByType(@PathParam("type") String type) {
        List<Tappers> tappers = dao.getByPropertyLike("beerType", type);
        if (tappers != null) {
            return Response.ok(tappers, MediaType.APPLICATION_XML).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    /**
     * Gets all records for a brewery
     * @param brewery brewery being queried
     * @return records with brewery
     */
    @GET
    @Path("/brewery/{brewery}")
    @Produces(MediaType.APPLICATION_XML)
    public Response getByBrewery(@PathParam("brewery") String brewery) {
        List<Tappers> tappers = dao.getByPropertyLike("brewery", brewery);
        if (tappers != null) {
            return Response.ok(tappers, MediaType.APPLICATION_XML).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    /**
     * Gets all records for a restaurant
     * @param restaurant restaurant being queried
     * @return records with restaurant
     */
    @GET
    @Path("/restaurant/{restaurant}")
    @Produces(MediaType.APPLICATION_XML)
    public Response getByRestaurant(@PathParam("restaurant") String restaurant) {
        List<Tappers> tappers = dao.getByPropertyLike("restaurant", restaurant);
        if (tappers != null) {
            return Response.ok(tappers, MediaType.APPLICATION_XML).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
