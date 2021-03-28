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

    public TappersDao() {
        tappersList.add(new Tappers(1, "Test Beer", "Test Brewery", "Testaurant",
                "This is a test"));
        tappersList.add(new Tappers(2, "Another Beer", "Test Brewery", "Testaurant",
                "This is another test"));
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

}
