package dev.version1.cabinet.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrescription;

    @ManyToOne
    @JoinColumn(name = "idAppointment")
    private Appointment appointment;

    @ManyToOne
    @JoinColumn(name = "idMedication")
    private Medication medication;

    @OneToOne
    @JoinColumn(name = "instruction_id")
    private Instruction instruction;

}
