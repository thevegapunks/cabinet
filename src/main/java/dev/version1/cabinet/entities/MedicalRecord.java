package dev.version1.cabinet.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecord;

    @OneToOne
    @JoinColumn(name = "idPatient")
    private Patient patient;

    @OneToOne
    @JoinColumn(name = "idPrescription")
    private Prescription prescription;

    @OneToOne
    @JoinColumn(name = "idMedicalHistory")
    private MedicalHistory medicalHistory;
}
