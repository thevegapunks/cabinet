package dev.version1.cabinet.repositories;

import dev.version1.cabinet.entities.CabinetMedical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabinetMedicalRepository extends JpaRepository<CabinetMedical,Long> {
}
