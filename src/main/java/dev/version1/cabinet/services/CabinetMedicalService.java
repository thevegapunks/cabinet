package dev.version1.cabinet.services;

import dev.version1.cabinet.entities.CabinetMedical;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CabinetMedicalService {
    CabinetMedical save(CabinetMedical cabinetMedical);
    List<CabinetMedical> getAllCabinetMedicals();
    CabinetMedical getCabinetMedicalById(Long id);


}
