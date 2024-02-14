package cda.annuaire.mapper;

import cda.annuaire.dto.user.UserDTO;
import cda.annuaire.model.User;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(uses = {EmailMapper.class, PhoneMapper.class})
public interface UserMapper {

    /**
     * Convertit le User en UserDTO
     *
     * @param user User à convertir
     * @return Le UserDTO
     */
    UserDTO map(User user);

    /**
     * Convertit la liste de User en liste de UserDTO
     *
     * @param users Liste de User à convertir
     * @return La liste de UserDTO
     */
    List<UserDTO> map(List<User> users);

    /**
     * Convertit le UserDTO en User
     *
     * @param userDTO UserDTO à convertir
     * @return Le User
     */
    User update(UserDTO userDTO);

    /**
     * Convertit un UserDTO en User
     *
     * @param userDTOS UserDTO à convertir
     * @return Le User
     */
    List<User> update(List<UserDTO> userDTOS);
}
