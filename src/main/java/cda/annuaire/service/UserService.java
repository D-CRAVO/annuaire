package cda.annuaire.service;

import cda.annuaire.dto.user.UserDTO;
import cda.annuaire.mapper.UserMapper;
import cda.annuaire.model.User;
import cda.annuaire.repository.UserRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private final UserMapper userMapper = (UserMapper) Mappers.getMapper(UserMapper.class);

    /**
     * Demande la récupération de tous les utilisateurs au UserRepository
     * et le converti ensuite en liste de UserDTO
     *
     * @return Tous les utilisateurs
     */
    public List<UserDTO> getUsers(){
        return userMapper.map(userRepository.findAll());
    }

    /**
     * Demande la récupération d'un utilisateur au UserRepository
     * d'après son identifiant
     * et le converti en UserDTO
     *
     * @param id Identifiant de l'utilisateur
     *
     * @return Un utilisateur
     */
    public UserDTO getUser(long id) {
        return userMapper.map(userRepository.findById(id).orElse(null));
    }

    /**
     * Demande l'ajout d'un utilisateur au UserRepository
     * Après avoir converti le userDTO
     *
     * @param userDTO Utilisateur à ajouter
     */
    public void addUser(UserDTO userDTO){
        userRepository.save(userMapper.update(userDTO));
    }

    /**
     * Demande la suppression d'un utilisateur au UserRepository
     * d'après son identifiant
     *
     * @param id Identifiant de l'utilisateur
     */
    public void deleteUser(long id){
        userRepository.deleteById(id);
    }

    /**
     * Demande la mise à jour de l'utilisateur au UserRepository
     * d'après son identifiant
     * et après avoir converti le userDTO
     *
     * @param userDTO Utilisateur à mettre à jour
     */
    public void updateUser(UserDTO userDTO){
        userRepository.save(userMapper.update(userDTO));
    }

    /**
     * Demande au UserRepository de rechercher les utilisateurs
     * suivant un texte de recherche
     *
     * @param search Texte de recherche
     * @return La liste des utilisateurs
     */
    public List<UserDTO> searchUsers(String search) {
        return userMapper.map(userRepository.findByFirstnameContainsOrLastnameContains(search, search));
    }
}
