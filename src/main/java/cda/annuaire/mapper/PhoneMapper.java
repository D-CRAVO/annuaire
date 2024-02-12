package cda.annuaire.mapper;

import cda.annuaire.dto.phone.PhoneDTO;
import cda.annuaire.model.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface PhoneMapper {

    /**
     * Convertit un Phone en PhoneDTO
     *
     * @param phone Phone à convertir
     * @return Un PhoneDTO
     */
    PhoneDTO map(Phone phone);

    /**
     * Convertit une liste de Phone en liste de PhoneDTO
     *
     * @param phones Liste de Phone à convertir
     * @return La liste des PhoneDTO
     */
    List<PhoneDTO> map(List<Phone> phones);

    /**
     * Convertit un PhoneDTO en Phone
     *
     * @param phoneDTO PhoneDTO à convertir
     * @return Un Phone
     */
    Phone update(PhoneDTO phoneDTO);

    /**
     * Convertit une liste de Phone en liste de PhoneDTO
     *
     * @param phoneDTOs Liste de Phone à convertir
     * @return Une liste de PhoneDTO
     */
    List<Phone> update(List<PhoneDTO> phoneDTOs);
}
