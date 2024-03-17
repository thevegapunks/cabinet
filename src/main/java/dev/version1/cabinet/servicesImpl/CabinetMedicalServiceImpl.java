package dev.version1.cabinet.servicesImpl;

import dev.version1.cabinet.entities.CabinetMedical;
import dev.version1.cabinet.repositories.CabinetMedicalRepository;
import dev.version1.cabinet.services.CabinetMedicalService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CabinetMedicalServiceImpl implements CabinetMedicalService {
    private final CabinetMedicalRepository cabinetMedicalRepository;

    public CabinetMedicalServiceImpl(CabinetMedicalRepository cabinetMedicalRepository) {
        this.cabinetMedicalRepository = cabinetMedicalRepository;
    }

    @Override
    public CabinetMedical save(CabinetMedical cabinetMedical) {
        return cabinetMedicalRepository.save(cabinetMedical);
    }

    @Override
    public List<CabinetMedical> getAllCabinetMedicals() {
        return cabinetMedicalRepository.findAll();
    }

    @Override
    public Optional<CabinetMedical> getCabinetMedicalById(Long id) {
        return cabinetMedicalRepository.findById(id);
    }

    @Override
    public void deleteCabinetMedicalById(Long id) {
        cabinetMedicalRepository.deleteById(id);
    }
}
