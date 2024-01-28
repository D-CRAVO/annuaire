package cda.annuaire.repository;

import cda.annuaire.model.Phone;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepository extends ListCrudRepository<Phone, Long> {
    List<Phone> findByUserId(long userId);
}
