package cda.annuaire.mapper;

import cda.annuaire.dto.photo.PhotoDTO;
import cda.annuaire.model.Photo;

public interface PhotoMapper {

    PhotoDTO map(Photo photo);

    Photo update(PhotoDTO photoDTO);
}
