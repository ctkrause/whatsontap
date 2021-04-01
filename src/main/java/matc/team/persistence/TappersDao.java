package matc.team.persistence;

import matc.team.entity.Tappers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class TappersDao{
    private final Logger logger = LogManager.getLogger(this.getClass());
    private List<Tappers> tappersList = new ArrayList<Tappers>();
    private static TappersDao instance;

    public TappersDao() {
        /*
        tappersList.add(new Tappers());
        tappersList.add(new Tappers());
        */
    }

    public Tappers getById(int id) {
        Tappers beer= new Tappers(id);
        int index = tappersList.indexOf(beer);
        if (index >= 0) {
            return tappersList.get(index);
        }
        return null;
    }

    public List<Tappers> getAll() {
        return tappersList;
    }

    // very helpful in doing all this
    // https://www.codejava.net/java-ee/web-services/java-crud-restful-web-services-examples-with-jersey-and-tomcat
}
