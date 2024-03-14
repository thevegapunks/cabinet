package dev.version1.cabinet.repositories;

import dev.version1.cabinet.entities.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<Medication,Long> {
}
