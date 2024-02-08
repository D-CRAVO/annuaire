package cda.annuaire.mapper;

import cda.annuaire.dto.photo.PhotoDTO;
import cda.annuaire.model.Photo;

public interface PhotoMapper {

    /**
     * Convertit la Photo en PhotoDTO
     *
     * @param photo Photo à convertir
     * @return La PhotoDTO
     */
    PhotoDTO map(Photo photo);

    /**
     * Convertit la PhotoDTO en Photo
     *
     * @param photoDTO PhotoDTO à convertir
     * @return La Photo
     */
    Photo update(PhotoDTO photoDTO);
}
