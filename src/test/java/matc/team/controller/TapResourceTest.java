package matc.team.controller;

import matc.team.entity.Tappers;
import matc.team.persistence.TappersDao;
import matc.team.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TapResourceTest {
    private TapResource tapResource;
    private static final String baseURI = "http://3.141.155.98:8080/madisonontap/whatsontap/taps";

    static WebTarget getWebTarget() {
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        return client.target(baseURI);
    }

    @BeforeEach
    void setUp() {
        tapResource = new TapResource();
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    void listTest() {
        List<Tappers> tappersList = tapResource.list();
        assertNotNull(tappersList);
        assertEquals(10, tappersList.size());
    }

    @Test
    void getTest() {
        WebTarget target = getWebTarget();
        String tapperId = "3";
        Tappers tapper = target.path(tapperId)
                .request().accept(MediaType.APPLICATION_JSON)
                .get(Tappers.class);
        assertEquals(3, tapper.getId());
    }


    @Test
    void addTest() {
        WebTarget target = getWebTarget();
        Tappers tappers = new Tappers("Influencer", "IPA", "One Barrel", "Alchemy", "04/01/2021");
        Response response = target.request()
                .post(Entity.entity(tappers, MediaType.APPLICATION_JSON), Response.class);

        System.out.println(response.getLocation().toString());
    }

    @Test
    void updateTest() {
        WebTarget target = getWebTarget();
        Tappers tappers = new Tappers("beer", "beer", "beer", "beer", "04/01/2021");

        String tapperId = "13";
        Response response = target.path(tapperId).request()
                .put(Entity.entity(tappers, MediaType.APPLICATION_JSON), Response.class);
        System.out.println(response);
    }

    @Test
    void deleteTest() {
        WebTarget target = getWebTarget();
        String tapperId = "16";
        Response response = target.path(tapperId).request()
                .delete(Response.class);
        System.out.println(response);
    }
}