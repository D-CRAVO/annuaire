package cda.annuaire.service;

import cda.annuaire.model.User;
import cda.annuaire.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(user -> {users.add(user);});
        return users;
    }

    public User getUser(long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(long id){
        userRepository.deleteById(id);
    }

    public void updateUser(User user, long id){
        userRepository.save(user);
    }
}
