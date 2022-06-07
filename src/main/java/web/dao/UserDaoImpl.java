package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }
    @Transactional
    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }
    @Transactional
    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }
    @Transactional
    @Override
    public void removeUser(long id) {
        entityManager.remove(getUserById(id));
    }
    @Transactional
    @Override
    public void updateUser(User user, Long id) {
        entityManager.merge(user);

    }
}
