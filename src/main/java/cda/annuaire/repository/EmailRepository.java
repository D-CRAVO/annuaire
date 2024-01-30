package cda.annuaire.repository;

import cda.annuaire.model.Email;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository extends ListCrudRepository<Email, Long> {
    public List<Email> findEmailByUserId(long id);
}
