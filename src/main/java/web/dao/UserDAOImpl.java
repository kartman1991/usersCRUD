package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.*;

@Repository
public class UserDAOImpl implements UserDAO {
    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private static EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("User");
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<User> findAll() {
        entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        List<User> userList = entityManager.createNativeQuery("select * from usersdb.users").getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        User user = new User("qqq", "aaa", (byte)1);
        userList.add(user);
        return userList;
//        return entityManager.createNativeQuery("select * from usersdb.users").getResultList();
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(Long id, User user) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
//    PreparedStatement statement = Util.connect().prepareStatement(
//            "DELETE FROM `usersdb`.`users` WHERE (`id` = ?);");
//            statement.setLong(1, id);
//                    statement.executeUpdate();
//                    Util.connect().commit();
//                    statement.close();
//                    Util.connect().close();
//                    } catch (SQLException ignore) {
//                    }
//                    }
