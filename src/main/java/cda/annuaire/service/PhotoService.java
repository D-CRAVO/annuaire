package cda.annuaire.service;

import cda.annuaire.dto.photo.PhotoDTO;
import cda.annuaire.mapper.PhotoMapper;
import cda.annuaire.model.Photo;
import cda.annuaire.repository.PhotoRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    private final PhotoMapper photoMapper = (PhotoMapper) Mappers.getMapper(PhotoMapper.class);

    /**
     * Demande la récupération de la photo auprès du PhotoService
     * d'après l'identifiant de l'utilisateur
     *
     * @param userId Identifiant de l'utilisateur
     * @return La photo
     */
    public PhotoDTO getPhotoByUserId(long userId){
       return  photoMapper.map(photoRepository.findPhotoByUserId(userId));
    }

    /**
     * Demande la suppression de la photo auprès du PhotoService
     * d'après son identifiant
     *
     * @param id Identifiant de la photo
     */
    public void deletePhoto(long id){
        photoRepository.deleteById(id);
    }

    /**
     * Demande la mise à jour de la photo auprès du PhotoService
     *
     * @param photoDTO Photo à mettre à jour
     */
    public void updatePhoto(PhotoDTO photoDTO){
        photoRepository.save(photoMapper.update(photoDTO));
    }
}
