package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    EntityManager entityManager;

    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<User> findAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
        entityManager.flush();
    }

    @Override
    public void deleteById(Long id) {
        User user = findById(id);
        entityManager.remove(user);
        entityManager.flush();
    }
}