package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.model.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }

    public User findById(Long id) {
        return userDAO.findById(id);
    }
    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }
    @Transactional
    public void update(User user) {
        userDAO.update(user);
//        user.setId(id);
//        userDAO.save(user);
    }
    @Transactional
    public void delete(Long id) {
        userDAO.deleteById(id);
    }
}
