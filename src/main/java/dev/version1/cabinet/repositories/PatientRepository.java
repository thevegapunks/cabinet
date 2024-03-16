package dev.version1.cabinet.repositories;

import dev.version1.cabinet.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByCin(String cin);
}
