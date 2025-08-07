package gr.codingfactory.petpal.service;

import gr.codingfactory.petpal.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
    User save(User user);
    void deleteById(Long id);
    boolean existsByUsername(String username);
}
