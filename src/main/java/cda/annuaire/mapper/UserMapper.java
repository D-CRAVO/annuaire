package cda.annuaire.mapper;

import cda.annuaire.dto.user.UserDTO;
import cda.annuaire.model.User;

import java.util.List;
public interface UserMapper {

    UserDTO map(User user);

    List<UserDTO> map(List<User> users);

    User update(UserDTO userDTO);

    List<User> update(List<UserDTO> userDTOS);
}
