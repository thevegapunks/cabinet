package dev.version1.cabinet.services;

import dev.version1.cabinet.entities.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    Patient savePatient(Patient patient);
    Optional<Patient> getPatientById(Long id);
    Patient getPatientByCin(String cin);
    List<Patient> getAllPatients();
    void deletePatient(Long id);


}
