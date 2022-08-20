//package web.dao;
//
//import org.hibernate.Session;
//import web.model.User;
//
//import java.util.List;
//
//public class UserDAOImpl implements UserDAO{
//    @Override
//    public void saveUser(String name, String surame, byte age) {
//
//    }
//
//    @Override
//    public void removeUser(long id) {
//
//    }
//
//    @Override
//    public void changeUser(long id) {
//
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        List<User> users = null;
//        try {
//            Session session = Util.getSessionFactory().openSession();
//            users = (List<User>) session.createQuery("From User").list();
//            session.close();
//        } catch (Exception ignore) {}
//        return users;
//    }
//}
