package dev.version1.cabinet.repositories;

import dev.version1.cabinet.entities.PatientInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientInfoRepository extends JpaRepository<PatientInfo,Long> {
}
