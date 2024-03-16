package dev.version1.cabinet.services;

import dev.version1.cabinet.entities.CabinetMedical;

import java.util.List;
import java.util.Optional;


public interface CabinetMedicalService {
    CabinetMedical save(CabinetMedical cabinetMedical);
    List<CabinetMedical> getAllCabinetMedicals();
    Optional<CabinetMedical> getCabinetMedicalById(Long id);
    void deleteCabinetMedicalById(Long id);


}
