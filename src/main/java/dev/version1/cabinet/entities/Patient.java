package dev.version1.cabinet.entities;
import dev.version1.cabinet.enums.FamilySituation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;

    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String cin;
    private String insuranceNumber;
    private LocalDate dateOfBirth;
    private String address;
    @Column(unique = true) // Déclarez le champ email comme unique
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    private FamilySituation familySituation;
}
