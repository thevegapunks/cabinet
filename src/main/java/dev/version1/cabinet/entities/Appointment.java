package dev.version1.cabinet.entities;
import dev.version1.cabinet.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAppointment;

    @ManyToOne
    @JoinColumn(name = "idPatient")
    private Patient patient;

    private LocalDateTime date;
    @Enumerated(EnumType.STRING)
    private ReasonOfAppointment reasonOfAppointment;
    @Enumerated(EnumType.STRING)
    private ActivationState activationState;
    @Enumerated(EnumType.STRING)
    private Confirmation confirmation;
    @Enumerated(EnumType.STRING)
    private StateOfIllness stateOfIllness;
    @Enumerated(EnumType.STRING)
    private StateOfPassion stateOfPassion;
}
