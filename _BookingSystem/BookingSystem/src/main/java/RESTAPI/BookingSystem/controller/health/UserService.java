package RESTAPI.BookingSystem.controller.health;


import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id, User user);
    boolean deleteUser(Long id);
}