package cda.annuaire.service;

import cda.annuaire.dto.photo.PhotoDTO;
import cda.annuaire.mapper.PhotoMapper;
import cda.annuaire.model.Photo;
import cda.annuaire.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {

    @Autowired
    PhotoRepository photoRepository;
    @Autowired
    PhotoMapper photoMapper;

    public PhotoDTO getPhotoByUserId(long userId){
       return  photoMapper.map(photoRepository.findPhotoByUserId(userId));
    }

    public void deletePhoto(long id){
        photoRepository.deleteById(id);
    }

    public void updatePhoto(PhotoDTO photoDTO){
        photoRepository.save(photoMapper.update(photoDTO));
    }
}
