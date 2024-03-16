package dev.version1.cabinet.entities;
import dev.version1.cabinet.enums.BloodGroup;
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
public class PatientInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInfo;

    @OneToOne
    private Patient patient;
    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;
    private Double weight;
    private Double height;
    private String bloodPressure;
    private String allergies;

    private String specialNote;
}
