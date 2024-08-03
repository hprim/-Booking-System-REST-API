package RESTAPI.BookingSystem.controller.health;


import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    private final Map<Long, User> userRepository = new HashMap<>();
    private Long currentId = 1L;

    @Override
    public User createUser(User user) {
        user.setId(currentId++);
        userRepository.put(user.getId(), user);
        return user;
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.ofNullable(userRepository.get(id));
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userRepository.values());
    }

    @Override
    public User updateUser(Long id, User user) {
        if (userRepository.containsKey(id)) {
            user.setId(id);
            userRepository.put(id, user);
            return user;
        }
        return null;
    }

    @Override
    public boolean deleteUser(Long id) {
        return userRepository.remove(id) != null;
    }
}

