package dao;

import models.Auto;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    public User findUserById(long id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public void saveUser(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        }catch (Exception e){

        }finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public void updateUser(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    public void deleteUser(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    public Auto findAutoById(long id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Auto.class, id);
    }

    public List<User> findAll() {

        return HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From User").list();
    }
}
