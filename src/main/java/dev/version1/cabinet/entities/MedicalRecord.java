package dev.version1.cabinet.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecord;

    @OneToOne
    private Patient patient;

    @OneToOne
    @JoinColumn(name = "idPrescription")
    private Prescription prescription;

    @OneToMany
    private List<MedicalHistory> medicalHistories;

    private String medicalConditions;
    @OneToMany
    private List<SurgicalHistory> surgicalHistories;
}
