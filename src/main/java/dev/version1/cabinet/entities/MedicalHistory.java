package dev.version1.cabinet.entities;
import dev.version1.cabinet.enums.DiagnosisMedicalHistory;
import dev.version1.cabinet.enums.EventTypeMedicalHistory;
import dev.version1.cabinet.enums.OutcomeMedicalHistory;
import dev.version1.cabinet.enums.TreatmentMedicalHistory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistory;

    @ManyToOne
    @JoinColumn(name = "idPatient")
    private Patient patient;

    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private EventTypeMedicalHistory eventTypeMedicalHistory;
    @Enumerated(EnumType.STRING)
    private DiagnosisMedicalHistory diagnosisMedicalHistory;
    @Enumerated(EnumType.STRING)
    private TreatmentMedicalHistory treatmentMedicalHistory;
    @Enumerated(EnumType.STRING)
    private OutcomeMedicalHistory outcomeMedicalHistory;
}
