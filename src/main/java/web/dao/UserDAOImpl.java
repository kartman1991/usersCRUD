package web.dao;

import org.springframework.stereotype.Repository;
import web.config.WebConfig;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.ResultSet;
import java.util.*;

@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<User> findAll() {
        return entityManager.createNativeQuery("select * from usersdb.users").getResultList();
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
