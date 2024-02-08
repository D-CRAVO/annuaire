package cda.annuaire.service;

import cda.annuaire.dto.user.UserDTO;
import cda.annuaire.mapper.UserMapper;
import cda.annuaire.model.User;
import cda.annuaire.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    /**
     * Récupère tous les utilisateur dans la base de données
     *
     * @return Tous les utilisateurs
     */
    public List<UserDTO> getUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(user -> {users.add(user);});
        return userMapper.map(users);
    }

    /**
     * Récupère un utilisateur dans la base de données
     * d'après son identifiant
     *
     * @param id Identifiant de l'utilisateur
     *
     * @return Un utilisateur
     */
    public UserDTO getUser(long id) {
        return userMapper.map(userRepository.findById(id).orElse(null));
    }

    /**
     * Ajoute un utilisateur dans la base de données
     *
     * @param userDTO Utilisateur à ajouter
     */
    public void addUser(UserDTO userDTO){
        userRepository.save(userMapper.update(userDTO));
    }

    /**
     * Supprime un utilisateur dans la base de données
     * d'après son identifiant
     *
     * @param id Identifiant de l'utilisateur
     */
    public void deleteUser(long id){
        userRepository.deleteById(id);
    }

    /**
     * Met à jour un utilisateur dans la base de données
     * d'après son identifiant
     *
     * @param userDTO Utilisateur à mettre à jour
     * @param id Identifiant de l'utilisateur à mettre à jour
     */
    public void updateUser(UserDTO userDTO, long id){
        userRepository.save(userMapper.update(userDTO));
    }
}
