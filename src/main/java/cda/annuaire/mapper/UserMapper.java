package cda.annuaire.mapper;

import cda.annuaire.dto.user.UserDTO;
import cda.annuaire.model.User;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

import static cda.annuaire.common.ListUtils.safe;

@Mapper(uses = {EmailMapper.class, PhoneMapper.class, PhotoMapper.class})
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
    @AfterMapping
    default void afterUpdate(UserDTO dto, @MappingTarget User user){
        safe(user.getPhones())
              .forEach(phone -> phone.setUser(user));
        safe(user.getEmails())
              .forEach(email -> email.setUser(user));
    }
}
