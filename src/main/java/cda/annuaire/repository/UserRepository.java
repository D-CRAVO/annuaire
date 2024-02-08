package cda.annuaire.repository;

import cda.annuaire.dto.user.UserDTO;
import cda.annuaire.model.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ListCrudRepository<User, Long> {
}
