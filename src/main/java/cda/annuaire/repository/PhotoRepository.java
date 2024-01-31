package cda.annuaire.repository;

import cda.annuaire.model.Photo;
import org.springframework.data.repository.ListCrudRepository;

public interface PhotoRepository extends ListCrudRepository<Photo, Long> {
    public Photo findPhotoByUserId(long userId);
}
