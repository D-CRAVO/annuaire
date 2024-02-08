package cda.annuaire.controller;

import cda.annuaire.dto.user.UserDTO;
import cda.annuaire.mapper.UserMapper;
import cda.annuaire.model.User;
import cda.annuaire.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Demande la récupération de tous les utilisateurs à l'UserService
     *
     * @return La liste des utilisateurs
     */
    @RequestMapping("/users")
    public List<UserDTO> getUsers(){
        return userService.getUsers();
    }

    /**
     * Demande la récupération d'un utilisateur à l'UserService
     * d'après son identifiant
     *
     * @param id Identifiant de l'utilisateur à récupérer
     *
     * @return L'utilisateur
     */
    @RequestMapping("/user/{id}")
    public UserDTO getUser(@PathVariable long id){
        return userService.getUser(id);
    }

    /**
     * Demande la suppression d'un utilisateur à l'UserService
     * d'après son identifiant
     *
     * @param id Identifiant de l'utilisateur à supprimer
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }

    /**
     * Demande l'ajout d'un utilisateur à l'UserService
     *
     * @param userDTO Utilisateur à ajouter
     */
    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
    }

    /**
     * Demande la mise à jour d'un utilisateur à l'UserService
     * d'après son identifiant
     *
     * @param userDTO Utilisateur à mettre à jour
     * @param id Identifiant de l'utilisateur à modifier
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
    public void updateUser(@RequestBody UserDTO userDTO, @PathVariable long id){
        userService.updateUser(userDTO, id);
    }
}
