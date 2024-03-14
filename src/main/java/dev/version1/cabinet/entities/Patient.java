package dev.version1.cabinet.entities;
import dev.version1.cabinet.enums.FamilySituation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;

    private String name;
    private String surname;
    private Integer age;
    private String cin;
    private String insuranceNumber;
    private LocalDate dateOfBirth;
    private String address;
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    private FamilySituation familySituation;
}
