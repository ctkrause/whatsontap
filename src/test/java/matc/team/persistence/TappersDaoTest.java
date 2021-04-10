package matc.team.persistence;

import matc.team.entity.Tappers;
import matc.team.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TappersDaoTest {

    TappersDao tappersDao;

    @BeforeEach
    void setUp() {
        tappersDao = new TappersDao();
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    void getById() {
        Tappers retrievedTapper = tappersDao.getById(2);
        assertNotNull(retrievedTapper);
    }

    @Test
    void getAll() {
        List<Tappers> tappers = tappersDao.getAll();
        assertEquals(10,tappers.size());
    }

    @Test
    void insert() {
        Tappers tap = new Tappers("Influencer", "IPA", "One Barrel", "Alchemy", "04/01/2021");
        int confId = tappersDao.insert(tap);
        assertNotNull(confId);
    }


    @Test
    void delete() {
        Tappers retrievedTapper = tappersDao.getById(10);
        tappersDao.delete(retrievedTapper);
        assertNull(tappersDao.getById(10));
    }


    @Test
    void getByPropertyEqual() {
        List<Tappers> retrievedTapper = tappersDao.getByPropertyEqual("description", "Hell");
        assertEquals(1, retrievedTapper.size());
    }


    @Test
    void getByPropertyLike() {
        List<Tappers> retrievedTappers = tappersDao.getByPropertyLike("brewery", "H");
        assertEquals(2, retrievedTappers.size());
    }

}