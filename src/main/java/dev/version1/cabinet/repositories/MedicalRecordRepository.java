package dev.version1.cabinet.repositories;

import dev.version1.cabinet.entities.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord,Long> {
}
