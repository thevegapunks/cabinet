package dev.version1.cabinet.repositories;

import dev.version1.cabinet.entities.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription,Long> {
}
