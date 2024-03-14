package dev.version1.cabinet.repositories;

import dev.version1.cabinet.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
