package matc.team.persistence;

import matc.team.entity.Tappers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TappersDao{
    private final Logger logger = LogManager.getLogger(this.getClass());
    private static TappersDao instance;

    public TappersDao() {}

    public static TappersDao getInstance() {
        if (instance == null) {
            instance = new TappersDao();
        }
        return instance;
    }

    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

    public Tappers getById(int id) {
        Session session = getSession();
        Tappers tapper = session.get( Tappers.class, id );
        session.close();
        return tapper;
    }

    public void saveOrUpdate(Tappers tapper) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(tapper);
        transaction.commit();
        session.close();
    }

    public int insert(Tappers tapper) {
        int id = 0;
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(tapper);
        transaction.commit();
        session.close();
        return id;
    }

    public void delete(Tappers tapper) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(tapper);
        transaction.commit();
        session.close();
    }

    public List<Tappers> getAll() {

        Session session = getSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Tappers> query = builder.createQuery( Tappers.class );
        Root<Tappers> root = query.from( Tappers.class );
        List<Tappers> tappers = session.createQuery( query ).getResultList();

        logger.debug("The list of tappers " + tappers);
        session.close();

        return tappers;
    }

    public List<Tappers> getByPropertyEqual(String propertyName, String value) {
        Session session = getSession();

        logger.debug("Searching for tapper with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Tappers> query = builder.createQuery( Tappers.class );
        Root<Tappers> root = query.from( Tappers.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<Tappers> tappers = session.createQuery( query ).getResultList();

        session.close();
        return tappers;
    }

    public List<Tappers> getByPropertyLike(String propertyName, String value) {
        Session session = getSession();

        logger.debug("Searching for tapper with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Tappers> query = builder.createQuery( Tappers.class );
        Root<Tappers> root = query.from( Tappers.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<Tappers> tappers = session.createQuery( query ).getResultList();
        session.close();
        return tappers;
    }


    // very helpful in doing all this
    // https://www.codejava.net/java-ee/web-services/java-crud-restful-web-services-examples-with-jersey-and-tomcat
}
