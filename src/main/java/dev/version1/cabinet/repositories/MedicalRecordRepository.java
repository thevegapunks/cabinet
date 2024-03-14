package dev.version1.cabinet.repositories;

import dev.version1.cabinet.entities.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord,Long> {
}
