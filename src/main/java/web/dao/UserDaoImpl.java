package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao{
    private Long count = 5L;
    private List<User> userList;

    {
        userList = new ArrayList<>();
        userList.add(new User(1L,"Andrei", "Petrov", (byte) 26));
        userList.add(new User(2L,"Andrei", "Petrov", (byte) 26));
        userList.add(new User(3L,"Andrei", "Petrov", (byte) 26));
        userList.add(new User(4L,"Andrei", "Petrov", (byte) 26));
        userList.add(new User(5L,"Andrei", "Petrov", (byte) 26));

    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public User getUserById(long id) {
        return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    @Override
    public void addUser(User user) {
        user.setId(++count);
        userList.add(user);
    }

    @Override
    public void removeUser(long id) {
        userList.removeIf(u -> u.getId() == id);
    }

    @Override
    public void updateUser(User user, Long id) {
        User ubdateUser = getUserById(id);
        ubdateUser.setName(user.getName());
        ubdateUser.setLastName(user.getLastName());
        ubdateUser.setAge(user.getAge());

    }
}
